package LibaryProject;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class issuedBooks extends JFrame {
    Connection con;
    Statement stmt;
    ResultSet rs;
    String query;

     javax.swing.JComboBox<String> genreList;
     javax.swing.JComboBox<String> classList;
     javax.swing.JButton homeBtn;
     javax.swing.JButton bookDetailsBtn;
     javax.swing.JButton addNewBookBtn;
     javax.swing.JButton issueBookBtn;
     javax.swing.JButton returnBookBtn;
     javax.swing.JButton studentRegBtn;
     javax.swing.JLabel jLabel1;
     javax.swing.JLabel genreLabel;
     javax.swing.JLabel classLabel;
     javax.swing.JScrollPane jScrollPane1;
     javax.swing.JTable table;

    public issuedBooks() {

        jLabel1 = new JLabel();
        jScrollPane1 = new JScrollPane();
        table = new JTable();
        homeBtn = new JButton();
        bookDetailsBtn = new JButton();
        addNewBookBtn = new JButton();
        issueBookBtn = new JButton();
        returnBookBtn = new JButton();
        studentRegBtn = new JButton();
        genreList = new JComboBox<>();
        classList = new JComboBox<>();
        genreLabel = new JLabel();
        classLabel = new JLabel();

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        jLabel1.setFont(new Font("Georgia", 0, 36));
        jLabel1.setForeground(new Color(0, 102, 102));
        jLabel1.setText("Issued Book Details");

        table.setModel(new DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "Student Id", "Student Name", "Book Id", "Book Name", "Student Address", "Issue Date"
                }
        ));
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setPreferredWidth(40);
            table.getColumnModel().getColumn(1).setPreferredWidth(150);
            table.getColumnModel().getColumn(2).setPreferredWidth(30);
            table.getColumnModel().getColumn(3).setPreferredWidth(150);
            table.getColumnModel().getColumn(4).setPreferredWidth(200);
            table.getColumnModel().getColumn(5).setPreferredWidth(60);
        }

        homeBtn.setBackground(new Color(0, 102, 102));
        homeBtn.setFont(new Font("Tahoma", 0, 12)); // NOI18N
        homeBtn.setForeground(new Color(255, 255, 255));
        homeBtn.setText("Home");
        homeBtn.addActionListener((ActionListener) this);

        bookDetailsBtn.setBackground(new Color(0, 102, 102));
        bookDetailsBtn.setFont(new Font("Tahoma", 0, 12)); // NOI18N
        bookDetailsBtn.setForeground(new Color(255, 255, 255));
        bookDetailsBtn.setText("Book Details");
        bookDetailsBtn.addActionListener((ActionListener) this);

        addNewBookBtn.setBackground(new Color(0, 102, 102));
        addNewBookBtn.setFont(new Font("Tahoma", 0, 12)); // NOI18N
        addNewBookBtn.setForeground(new Color(255, 255, 255));
        addNewBookBtn.setText("AddNewBook");
        addNewBookBtn.addActionListener((ActionListener) this);

        issueBookBtn.setBackground(new Color(0, 102, 102));
        issueBookBtn.setFont(new Font("Tahoma", 0, 12)); // NOI18N
        issueBookBtn.setForeground(new Color(255, 255, 255));
        issueBookBtn.setText("Issue Book");
        issueBookBtn.addActionListener((ActionListener) this);

        returnBookBtn.setBackground(new Color(0, 102, 102));
        returnBookBtn.setFont(new Font("Tahoma", 0, 12)); // NOI18N
        returnBookBtn.setForeground(new Color(255, 255, 255));
        returnBookBtn.setText("Return Book");
        returnBookBtn.addActionListener((ActionListener) this);

        studentRegBtn.setBackground(new Color(0, 102, 102));
        studentRegBtn.setFont(new Font("Tahoma", 0, 12)); // NOI18N
        studentRegBtn.setForeground(new Color(255, 255, 255));
        studentRegBtn.setText("Student Registration");
        studentRegBtn.addActionListener((ActionListener) this);

        genreList.setFont(new java.awt.Font("Tahoma", 0, 14));
        genreList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Genre", "Commerce", "Science", "Literature","History","Poetry" }));
        genreList.addActionListener((ActionListener) this);

        classList.setFont(new Font("Tahoma", 0, 14));
        classList.setModel(new DefaultComboBoxModel<>(new String[] { "Select Class" }));
        classList.addActionListener((ActionListener) this);

        genreLabel.setFont(new java.awt.Font("Tahoma", 0, 14));
        genreLabel.setText("Genre");

        classLabel.setFont(new java.awt.Font("Tahoma", 0, 14));
        classLabel.setText("Class");


    }



    private void genreListActionPerformed(ActionEvent e) {
        if(genreList.getSelectedItem()=="Science")
        {
            classList.removeAllItems();
            classList.addItem("Select Class");
            classList.addItem("FYBScCS");
            classList.addItem("SYBScCS");
            classList.addItem("TYBScCS");
        }
        if(genreList.getSelectedItem()=="Arts")
        {
            classList.removeAllItems();
            classList.addItem("Select Class");
            classList.addItem("FYBA");
            classList.addItem("SYBA");
            classList.addItem("TYBA");
        }
        if(genreList.getSelectedItem()=="Commerce")
        {
            classList.removeAllItems();
            classList.addItem("Select Class");
            classList.addItem("FYBCom");
            classList.addItem("SYBCom");
            classList.addItem("TYBCom");
        }
        if(genreList.getSelectedItem()=="Poetry")
        {
            classList.removeAllItems();
            classList.addItem("Select Class");
            classList.addItem("FYBCom");
            classList.addItem("SYBCom");
            classList.addItem("TYBCom");
        }
        if(genreList.getSelectedItem()=="Literature")
        {
            classList.removeAllItems();
            classList.addItem("Select Class");
            classList.addItem("FYBCom");
            classList.addItem("SYBCom");
            classList.addItem("TYBCom");
        }
        if(genreList.getSelectedItem()=="History")
        {
            classList.removeAllItems();
            classList.addItem("Select Class");
            classList.addItem("FYBCom");
            classList.addItem("SYBCom");
            classList.addItem("TYBCom");
        }
    }

    private void classListActionPerformed(ActionEvent e) {
        try
        {
            connect();
            query="select * from issue where genre='"+ genreList.getSelectedItem()+"' and class='"+ classList.getSelectedItem()+"';";
            rs=stmt.executeQuery(query);
            DefaultTableModel model=(DefaultTableModel)table.getModel();
            model.setRowCount(0);
            while(rs.next())
            {
                Object[] row = {rs.getString("StudentId"),rs.getString("StudentName"),rs.getString("BookId"),rs.getString("BookName"),rs.getString("Address"),rs.getString("IssueDate")};
                model.addRow(row);
            }
        }
        catch(Exception ex)
        {

        }
    }




    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(issuedBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(issuedBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(issuedBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(issuedBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new issuedBooks().setVisible(true);
//            }
//        });
    }

    public void connect()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/pankaj?useSSL=false&autoReconnect=true","root","8543998287");
            stmt=con.createStatement();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,"connection error");
        }
    }
    public void disconnect()
    {
        try
        {
            con.close();
        }
        catch(Exception e)
        {}

    }

}
