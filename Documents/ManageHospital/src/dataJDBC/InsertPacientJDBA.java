package dataJDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertPacientJDBA {
	// JDBC driver name and database URL
	   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost/hospital";
	   //   Connection con=DriverManager.getConnection("jdbc:mysql://localhost/hospital","root","password");

	   //  Database credentials
	   static final String USER = "root";
	   static final String PASS = "password";
	   
	   public static void main(String[] args) {
	   Connection conn = null;
	   Statement stmt = null;
	   try{
	      //STEP 2: Register JDBC driver
	      Class.forName("com.mysql.jdbc.Driver");

	      //STEP 3: Open a connection
	      System.out.println("Connecting to a selected database...");
	      conn = DriverManager.getConnection(DB_URL, USER, PASS);
	      System.out.println("Connected database successfully...");
	      
	      //STEP 4: Execute a query
	      System.out.println("Inserting records into the table...");
	      stmt = conn.createStatement();
	      
	      String sql = "INSERT INTO patient " +
	                   "VALUES ('1', 'Zara', 'Adem', 'Male',-1)";
	      stmt.executeUpdate(sql);
	      sql = "INSERT INTO patient " +
	                   "VALUES ('1u', 'Anda', 'Kap', 'Male',-1)";
	      stmt.executeUpdate(sql);
	      sql = "INSERT INTO patient " +
	                   "VALUES ('1h', 'Franci', 'Dema', 'Male',-1)";
	      stmt.executeUpdate(sql);
	      sql = "INSERT INTO patient " +
	                   "VALUES('1a', 'Gregor', 'Gjylamenti', 'Male',-1)";
	      stmt.executeUpdate(sql);
	      System.out.println("Inserted records into the table...");

	   }catch(SQLException se){
	      //Handle errors for JDBC
	      se.printStackTrace();
	   }catch(Exception e){
	      //Handle errors for Class.forName
	      e.printStackTrace();
	   }finally{
	      //finally block used to close resources
	      try{
	         if(stmt!=null)
	            conn.close();
	      }catch(SQLException se){
	      }// do nothing
	      try{
	         if(conn!=null)
	            conn.close();
	      }catch(SQLException se){
	         se.printStackTrace();
	      }//end finally try
	   }//end try
	   System.out.println("Goodbye!");
	}//end main
	}//end JDBCExample
	
