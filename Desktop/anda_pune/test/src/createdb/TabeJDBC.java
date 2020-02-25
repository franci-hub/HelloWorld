package createdb;
//STEP 1. Import required packages
	import java.sql.*;

public class TabeJDBC {
	
	   // JDBC driver name and database URL
	   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost/SPITALI";

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
	      System.out.println("Creating table in given database...");
	      stmt = conn.createStatement();
	      
//	      String sql = "CREATE  TABLE IF NOT EXISTS DOCTOR " +
//	                   "(id INTEGER not NULL, " +
//	                   " fName VARCHAR(255), " + 
//	                   " lname VARCHAR(255), " + 
//	                   " gender VARCHAR(255), " + 
//	                   " PRIMARY KEY ( id ))"; 

	      String sql1 = "CREATE  TABLE IF NOT EXISTS PACIENT " +
                  "(id INTEGER not NULL, " +
                  " fName VARCHAR(255), " + 
                  " lname VARCHAR(255), " + 
                  " gender VARCHAR(255), " + 
                  " Doct_id VARCHAR(255), " + 
                 
                  " PRIMARY KEY ( id ))"; 

	   //   stmt.executeUpdate(sql);
	      stmt.executeUpdate(sql1);
	      System.out.println("Created table in given database...");
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
	            stmt.close();
	      }catch(SQLException se2){
	      }// nothing we can do
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

