package JDBC.Gift;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Create_Table {
    public static void main(String[] args) {
        try { Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/NIIT", "root", "");
            Statement statement = conn.createStatement();
            statement.executeUpdate("CREATE TABLE persons" + "(user_id int, firstName varchar(25), lastName varchar(25) );");
            System.out.println("database is connected");
            String query = "CREATE TABLE StudentDB(" + "ID INT PRIMARY KEY AUTO_INCREMENT NOT NULL, "
                    + "firstname VARCHAR (25) NOT NULL, "
                    + "lastname VARCHAR (25) NOT NULL," + "age INTEGER";

        }catch (Exception e){
            System.out.println("Database was unable to connect");
            e.printStackTrace();
        }
    }
}
