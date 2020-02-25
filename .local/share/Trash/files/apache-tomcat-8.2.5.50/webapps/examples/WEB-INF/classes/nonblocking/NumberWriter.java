/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package nonblocking;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicInteger;

import javax.servlet.AsyncContext;
import javax.servlet.ReadListener;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.ServletOutputStream;
import javax.servlet.WriteListener;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * This doesn't do anything particularly useful - it just writes a series of
 * numbers to the response body while demonstrating how to perform non-blocking
 * writes.
 */
public class NumberWriter extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        resp.setContentType("text/plain");
        resp.setCharacterEncoding("UTF-8");

        // Non-blocking IO requires async
        AsyncContext ac = req.startAsync();

        // Use a single listener for read and write. Listeners often need to
        // share state to coordinate reads and writes and this is much easier as
        // a single object.
        @SuppressWarnings("unused")
        NumberWriterListener listener = new NumberWriterListener(
                ac, req.getInputStream(), resp.getOutputStream());

    }


    /**
     * Keep in mind that each call may well be on a different thread to the
     * previous call. Ensure that changes in values will be visible across
     * threads. There should only ever be one container thread at a time calling
     * the listener.
     */
    private static class NumberWriterListener implements ReadListener,
            WriteListener {

        private static final int LIMIT =  10000;

        private final AsyncContext ac;
        private final ServletInputStream sis;
        private final ServletOutputStream sos;
        private final AtomicInteger counter = new AtomicInteger(0);

        private volatile boolean readFinished = false;
        private byte[] buffer = new byte[8192];

        private NumberWriterListener(AsyncContext ac, ServletInputStream sis,
                ServletOutputStream sos) {
            this.ac = ac;
            this.sis = sis;
            this.sos = sos;

            // In Tomcat, the order the listeners are set controls the order
            // that the first calls are made. In this case, the read listener
            // will be called before the write listener.
            sis.setReadListener(this);
            sos.setWriteListener(this);
        }

        @Override
        public void onDataAvailable() throws IOException {

            // There should be no data to read

            int read = 0;
            // Loop as long as there is data to read. If isReady() returns false
            // the socket will be added to the poller and onDataAvailable() will
            // be called again as soon as there is more data to read.
            while (sis.isReady() && read > -1) {
                read = sis.read(buffer);
                if (read > 0) {
                    throw new IOException("Data was present in input stream");
                }
            }
        }

        @Override
        public void onAllDataRead() throws IOException {
            readFinished = true;

            // If sos is not ready to write data, the call to isReady() will
            // register the socket with the poller which will trigger a call to
            // onWritePossible() when the socket is ready to have data written
            // to it.
            if (sos.isReady()) {
                onWritePossible();
            }
        }

        @Override
        public void onWritePossible() throws IOException {
            if (readFinished) {
                int i = counter.get();
                boolean ready = true;
                while (i < LIMIT && ready) {
                    i = counter.incrementAndGet();
                    String msg = String.format("%1$020d\n", Integer.valueOf(i));
                    sos.write(msg.getBytes(StandardCharsets.UTF_8));
                    ready = sos.isReady();
                }

                if (i == LIMIT) {
                    ac.complete();
                }
            }
        }

        @Override
        public void onError(Throwable throwable) {
            // Should probably log the throwable
            ac.complete();
        }
    }
}
