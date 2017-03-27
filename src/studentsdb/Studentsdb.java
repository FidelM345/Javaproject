
package studentsdb;
import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class Studentsdb {

 public static final String User_Name="root"; // DECLARATION OF A CONSTANT VARIABLE IN JAVA. THE VARIABLE CANNOT BE REASSIGNED
 public static final String password=null;
 /*public static final String connectorstring="jdbc:mysql://localhost:3306/password";*/
        
   
   
    //Connection conn=null; 
   public static Connection conDB(){
    try{
       
    
    JOptionPane.showMessageDialog(null, "connected to the DB");
    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/fidel",User_Name,password);// getConnection attempts to establish a connection to the given database url
   
   
    
    
    return conn;
    
    
    
    }catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
    return null;}
    
   }
 
   
    
    
}
