/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package userregistering1;
import java.awt.Component;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author LENOVO
 */

public class dbconnection {
    
  public static Connection connect(){
      Connection conn=null;
      try{
         conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/userregistration?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root",""); 
         Component rootPane=null;
         System.out.println("connected");
      }
     catch(Exception ex){
          JOptionPane.showMessageDialog(null,ex);
      }
      return conn;
  }
  public static void main(String args[]){
      Connection conn=connect();
      if(conn!=null){
          try{
              conn.close();
              System.out.println("connection closed successfully");
          }
          catch(SQLException ex){
              System.out.println("error closing connection"+ex.getMessage());
          }
      }
  }
}
