package JDBC.Batch;

import java.sql.*;

public class BookInfo {
    public static void main(String[] args) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try (Connection con = DriverManager.getConnection("jdbc:sqlserver://sqlserver01;databaseName=Library;" +
                    "user=user1;password=password#1234");Statement stmt = con.createStatement())
            
            {
            { 
                con.setAutoCommit(false);
                stmt.addBatch("INSERT INTO books(book_id, book_name) VALUES ('B004', 'kane and Able')");
                stmt.addBatch("INSERT INTO books(book_id, book_name) VALUES ('B005'), 'The Ghost'");
                stmt.addBatch("INSERT INTO books(book_id, book_name) VALUES ('B006'), 'If Tommorrow Comes'");
                
                int[] results = stmt.executeBatch();
                    System.out.println(" ");
                    System.out.println("Using Statement Object");
                    System.out.println("---------------------------");
                    for (int  i=0; i < results.length; i++);
                    {
                        int i = 0;
                        System.out.println("Rows affected by " + (i + 1) + "INSERT Statement: " + results[i]);
                    }
                    
                    try (PreparedStatement ps = con.prepareStatement("INSERT INTO Books(book_id, price) VALUES(?, ?) "))
                    {
                        System.out.println("  ");
                        System.out.println("----------------------------------");
                        System.out.println("Using PreparedStatement object");
                        System.out.println("----------------------------------");
                        
                        ps.setString(1, "B007");
                        ps.setInt(2, 575);
                        ps.addBatch();
                        ps.setString(1, "B008");
                        ps.setInt(2, 350);
                        
                        ps.addBatch();
                        
                        int[] numUpdates = ps.executeBatch();
                        for (int i = 0; i< numUpdates.length; i++)
                        {
                            System.err.println("Rows affected by " + (i + 1) + "INSERT Statement: " + numUpdates[i]);
                        }
                        con.commit();
                        
                    }
                }
            }
        }catch (BatchUpdateException bue)
        {
            System.out.println("Error : " + bue);
        }
        catch (SQLException sqle)
        {
            System.out.println("Error : " + sqle);
        }
        catch (Exception e)
        {
            System.out.println("Error : " + e);
        }
    }
}
