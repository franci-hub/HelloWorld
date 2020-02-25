import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReportsHospitalManager {

	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost/hospital";

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
      System.out.println("Creating statement...");
      stmt = conn.createStatement();
      System.out.println("|------------------------");
      System.out.println();
      System.out.println("Report: All Doctors that works at the hospital");
      System.out.println();
      String sql = "SELECT * FROM doctor";
      ResultSet rs = stmt.executeQuery(sql);
      //STEP 5: Extract data from result set
      while(rs.next()){
         //Retrieve by column name
    	  String id  = rs.getString("inst_id");
    	  String fName = rs.getString("fName");
         String lName = rs.getString("lName");
         String gender = rs.getString("gender");

         //Display values
         System.out.print("ID: " + id);
         System.out.print(", FistName: " + fName);
         System.out.print(", Lastname: " + lName);
         System.out.println(", Gender: " + gender);
      }
   
      System.out.println();
      System.out.println();
      System.out.println("-------------------------------");
      System.out.println();

      System.out.println("Report: All Patients that are at the hospital");
      System.out.println();
      String sql2 = "SELECT st_id, fName, lName, gender FROM patient";
      ResultSet rs2 = stmt.executeQuery(sql2);
      //STEP 5: Extract data from result set
      while(rs2.next()){
         //Retrieve by column name
    	  String id  = rs2.getString("st_id");
    	  String fName = rs2.getString("fName");
         String lName = rs2.getString("lName");
         String gender = rs2.getString("gender");

         //Display values
         System.out.print("ID: " + id);
         System.out.print(", FistName: " + fName);
         System.out.print(", Lastname: " + lName);
         System.out.println(", Gender: " + gender);
      }
      System.out.println("|------------------------");
      System.out.println("Report: All Patients that have one doctor assigned to it");
      System.out.println();
      
      String sql3 = "SELECT fName, lName FROM patient WHERE inst_id != -1";
      ResultSet rs3 = stmt.executeQuery(sql3);
      //STEP 5: Extract data from result set
      System.out.println("Patient are :");
      while(rs3.next()){
         //Retrieve by column name
    	 
    	 String fName = rs3.getString("fName");
         String lName = rs3.getString("lName");
        

         //Display values
         
         System.out.print("- "+fName+" ");
         System.out.println( lName);
  
      }
      System.out.println("|------------------------");
      System.out.println("Report: All Patients that dont have one doctor assigned to it");
      System.out.println();
      String sql4 = "SELECT fName, lName FROM patient WHERE inst_id = -1";
      ResultSet rs4 = stmt.executeQuery(sql4);
      //STEP 5: Extract data from result set
      System.out.println("Patient are :");
      while(rs4.next()){
         //Retrieve by column name
    	 
    	 String fName = rs4.getString("fName");
         String lName = rs4.getString("lName");
         //Display values
         
         System.out.print("- "+fName+" ");
         System.out.println( lName);
  
      }
      

      System.out.println();
      System.out.println("|------------------------");
      System.out.println("Report:  Patient and their doctor");
     
      String sql5 = "SELECT patient.fName, patient.lName,doctor.fName,doctor.lName FROM patient JOIN doctor ON patient.inst_id = doctor.inst_id";
      ResultSet rs5 = stmt.executeQuery(sql5);
      //STEP 5: Extract data from result set
      System.out.println();
      while(rs5.next()){
         //Retrieve by column name
    	 
    	 String fName = rs5.getString("patient.fName");
         String lName = rs5.getString("patient.lName");
       	
    	 String dName = rs5.getString("doctor.fName");
         String dlName = rs5.getString("doctor.lName");
         //Display values
         
         System.out.print("-Patient "+fName+" ");
         System.out.print( lName + " ");
         System.out.print("have Doctor:");
         System.out.print( " "+dName+" ");
         System.out.println( dlName);
      }
      System.out.println("--------------------------------------------------------------------");
      System.out.println("LIST OF THE doctor AND THEIR patients");
      String sql6 = "SELECT patient.fName, patient.lName,doctor.fName,doctor.lName FROM doctor JOIN patient ON doctor.inst_id = patient.inst_id";
      ResultSet rs6 = stmt.executeQuery(sql6);
      //STEP 5: Extract data from result set
      System.out.println();
      while(rs6.next()){
         //Retrieve by column name
    	 
    	  String dName = rs6.getString("doctor.fName");
          String dlName = rs6.getString("doctor.lName");
    	 
    	 String fName = rs6.getString("patient.fName");
         String lName = rs6.getString("patient.lName");
       	
    	
         //Display values
         
         System.out.print("-Doctor "+dName+" ");
         System.out.print( dlName+" ");
         System.out.print("have Patient:");
         System.out.print(" "+fName+" ");
         System.out.println( lName + " ");
   
      
      }
      
      rs.close();
      rs2.close();
      rs3.close();
      rs4.close();
      rs5.close();
      rs6.close();
      
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
