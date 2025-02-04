/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package DBUTIL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nitish
 */
public class DBUTIL {
  /**  private String dburl= "jdbc:oracle:thin:@localhost:1521;XE";
    private  String user = "SYSTEM";
private String pass = "abcd";
*/
    private final String dbUrl;
    private final String user;
    private final String pass;

   public DBUTIL() {
       
    /** this.dburl=dburl;
    this.pass=pass;
    this.user=user;
    */
    this.dbUrl = "jdbc:mysql://localhost:3306/AEDProject";
        this.user = "root"; // Replace with your MySQL username
        this.pass = "krupali04";
       
  }
       
  public Connection getConnection()
  { /**

        Connection con= null;
        System.out.println("Connecting .....");
        try {
           // Connection conn = DriverManager.getConnection(dburl, user, pass);
            Class.forName(("oracle.jdbc.OracleDriver"));
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","SYSTEM","abcd");
             System.out.println("Now connected..!");
             //return conn;
        } catch (SQLException ex) {
             System.out.println(" dbutil catch not Connected to database !");
            Logger.getLogger(DBUTIL.class.getName()).log(Level.SEVERE, null, ex);
       
        }catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
           
 return con;
 */
      Connection con = null;
        System.out.println("Connecting to MySQL database...");
        try {
            // Load MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Get connection
            con = DriverManager.getConnection(dbUrl, user, pass);
            System.out.println("Connection established successfully!");
        } catch (SQLException ex) {
            System.err.println("Failed to connect to MySQL!");
            Logger.getLogger(DBUTIL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            System.err.println("MySQL JDBC Driver not found!");
            Logger.getLogger(DBUTIL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
}  
    
}

    

