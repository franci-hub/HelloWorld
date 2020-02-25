import java.sql.*; 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author presentation
 */
public class DBManager {
 
static DBManager instance = null;
static Connection connection = null;
static Statement stmt = null;
static ResultSet resultSet = null;

private DBManager(){}

   public static DBManager getInstance(){
        if(instance == null){
            instance = new DBManager();
        }
        return instance;
    }
    
    public static Statement getStatement(){
    try{
    stmt = connection.createStatement(); 
    }catch (Exception e ) {System.out.println(e);}
    
    return stmt;
    }
    
    public static void insertQuery(String query){
    try{
        stmt=getStatement(); 
        stmt.execute(query);
    } catch (Exception e ) {System.out.println(e);}
    }
   
    public static Connection getConnection(){
    try{ 
        Class.forName("com.mysql.cj.jdbc.Driver");  
        connection =DriverManager.getConnection(  
        "jdbc:mysql://localhost:3306/mysql?","root",""); 
     }catch(Exception e){ System.out.println(e+ " prob with conn");}  
   
        return connection;
    }
        
    public static ResultSet readDatabase (String query) {
    try{  
        stmt=getStatement();  
       // stmt.execute(query);
        resultSet = stmt.executeQuery(query);                
    }
    catch(Exception e){ System.out.println(e+" prob reading the database");}  
    return resultSet;
    }
    
    public static void closeConnection(){
         try{
          try {
            if (resultSet != null) {
                resultSet.close();
            }

            if (stmt != null) {
                stmt.close();
            }

            if (connection != null) {
                connection.close();
            }
        } catch (Exception e) {

        }
         }
         catch(Exception e){ System.out.println(e);} 
    }
    
   
}
