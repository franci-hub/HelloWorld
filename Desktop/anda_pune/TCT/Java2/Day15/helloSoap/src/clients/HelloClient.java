package clients;

public class HelloClient {
	public static void main(String[] args) {
		HelloService service = new HelloService();
		Hello hello = service.getHelloPort();
		String text = hello.sayHello("hany");
		System.out.println(text);
	}
}
