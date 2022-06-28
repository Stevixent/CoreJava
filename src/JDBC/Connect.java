package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
    public static void main(String[] args)  {
       try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection conn = null;
           conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/NIIT", "root", "");
           System.out.println("Database is connected");
           conn.close();
       }catch (Exception e) {
           System.out.println("Database was unable to connect");
           e.printStackTrace();
       }
    }
}
