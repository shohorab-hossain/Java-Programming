
package dbdemo;

import java.sql.*;

/**
 *
 * @author HASIB
 */
public class Dbdemo {
     private static final String USERNAME = "root";
     private static final String PASSWORD = "";
     private static final String CONN_STRING = "jdbc:mysql://127.0.01/youtube";
     
    
    public static void main(String[] args) throws ClassNotFoundException {
        Connection con = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
            System.out.println("connected");
            Statement stmt = (Statement) con.createStatement();
            String fname = "hasib";
            String lname = "hossain";
            String insert = "INSERT INTO 'youtube'.'user'('fname','lname') VALUES('"+fname+"','"+lname+"')";
            String query = "SELECT * FROM user";
            stmt.executeUpdate(insert);
            stmt.executeQuery(query);
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    
}
