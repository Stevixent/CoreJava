package LibaryProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class returnBooks extends Component {
    Connection con;
    Statement stmt;
    ResultSet rs;
    String query;
    Date date=new Date();
    SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy");

    JButton returnBtn;
    JButton jButton2;
    JButton jButton3;
    JButton jButton4;
    JButton jButton5;
    JButton jButton6;
    JLabel title;
    JLabel studentIdLabel;
    JLabel jLabel3;
    JLabel bookIdLabel;
    JLabel bookNameLabel;
    JLabel returnDateLabel;
    JLabel issuedOnLabel;
    JTextField studentIdField;
    JTextField studentNameField;
    JTextField bookIdField;
    JTextField bookNameField;
    JTextField issuedOnField;
    JTextField returnDateField;


    public returnBooks() {

        title = new JLabel();
        studentIdLabel = new JLabel();
        studentIdField = new JTextField();
        jLabel3 = new JLabel();
        studentNameField = new JTextField();
        bookIdLabel = new JLabel();
        bookIdField = new JTextField();
        bookNameLabel = new JLabel();
        bookNameField = new JTextField();
        returnDateLabel = new JLabel();
        returnDateField = new JTextField();
        returnBtn = new JButton();
        jButton2 = new JButton();
        jButton3 = new JButton();
        jButton4 = new JButton();
        jButton5 = new JButton();
        jButton6 = new JButton();
        issuedOnLabel = new JLabel();
        issuedOnField = new JTextField();



        title.setFont(new java.awt.Font("Georgia", 0, 36));
        title.setForeground(new java.awt.Color(0, 102, 102));
        title.setText("Return Book");

        studentIdLabel.setFont(new java.awt.Font("Tahoma", 0, 14));
        studentIdLabel.setText("Student Id");

        studentIdField.setFont(new Font("Tahoma", 0, 14));
        studentIdField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                studentIdFieldActionPerformed(e);
            }
        });
        studentIdField.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                t1KeyReleased(e);
            }
        });

        jLabel3.setFont(new Font("Tahoma", 0, 14));

        studentNameField.setFont(new Font("Tahoma", 0, 14));
        studentNameField.setEnabled(false);

        bookIdLabel.setFont(new Font("Tahoma", 0, 14));
        bookIdLabel.setText("Book Id");

        bookIdField.setFont(new Font("Tahoma", 0, 14));
        bookIdField.setEnabled(false);

        bookNameLabel.setFont(new Font("Tahoma", 0, 14));
        bookNameLabel.setText("Book name");

        bookNameField.setFont(new Font("Tahoma", 0, 14));
        bookNameField.setEnabled(false);

        returnDateLabel.setFont(new Font("Tahoma", 0, 14));
        returnDateLabel.setText("Return Date");

        returnDateField.setFont(new Font("Tahoma", 0, 14));
        returnDateField.setEnabled(false);


        issuedOnLabel.setFont(new Font("Tahoma", 0, 14));
        issuedOnLabel.setText("Issued On");

        issuedOnField.setFont(new Font("Tahoma", 0, 14));
        issuedOnField.setEnabled(false);


        returnBtn.setBackground(new Color(0, 102, 102));
        returnBtn.setFont(new Font("Tahoma", 0, 14));
        returnBtn.setForeground(new Color(255, 255, 255));
        returnBtn.setText("Return");
        returnBtn.addActionListener((ActionListener) this);

        jButton2.setBackground(new java.awt.Color(204, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cancel");
        jButton2.addActionListener((ActionListener) this);

        jButton3.setBackground(new java.awt.Color(0, 102, 102));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Home");
        jButton3.addActionListener((ActionListener) this);

        jButton4.setBackground(new java.awt.Color(0, 102, 102));
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Book Details");
        jButton4.addActionListener((ActionListener) this);

        jButton5.setBackground(new java.awt.Color(0, 102, 102));
        jButton5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Issue Book");
        jButton5.addActionListener((ActionListener) this);

        jButton6.setBackground(new java.awt.Color(0, 102, 102));
        jButton6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Issued Book Details");
        jButton6.addActionListener((ActionListener) this);

    }

    private void studentIdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        welcomePage wp=new welcomePage();
        wp.setVisible(true);
      //  this.setVisible(false);
    }



    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        welcomePage mn=new welcomePage();
        mn.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(ActionEvent evt) {
        BookDetails bd=new BookDetails();
        bd.setVisible(true);
        this.setVisible(false);
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        IssueBook ib=new IssueBook();
        ib.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        issuedBooks ibs=new issuedBooks();
        ibs.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void t1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t1KeyReleased
        try
        {
            connect();
            query="select * from issue where StudentId='"+ studentIdField.getText()+"';";
            rs=stmt.executeQuery(query);
            int i=0;
            while(rs.next())
            {
                i++;
                studentNameField.setText(rs.getString("StudentName"));
                bookIdField.setText(rs.getString("BookId"));
                bookNameField.setText(rs.getString("BookName"));
                issuedOnField.setText(rs.getString("IssueDate"));
            }
            disconnect();
            if(i==0)
            {
                studentNameField.setText("");
                bookIdField.setText("");
                bookNameField.setText("");
                issuedOnField.setText("");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        returnDateField.setText(format.format(date));
    }//GEN-LAST:event_t1KeyReleased

    private void returnBtn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try
        {
            connect();
            query="select * from issue where StudentId='"+ studentIdField.getText()+"';";
            rs=stmt.executeQuery(query);

            if(rs.next())
            {
                query="insert into returndetail values('"+ studentIdField.getText()+"','";
                query+= studentNameField.getText()+"','"+ bookIdField.getText()+"','"+ bookNameField.getText()+"','"+ issuedOnField.getText()+"','"+ returnDateField.getText()+"');";
                stmt.executeUpdate(query);
                query="delete from issue where StudentId='"+ studentIdField.getText()+"';";
                stmt.executeUpdate(query);
                query="update books set Available='YES' where BookId='"+ bookIdField.getText()+"';";
                stmt.executeUpdate(query);
                disconnect();
                JOptionPane.showMessageDialog(this,"Thank you! visit again");
                bookNameField.setText("");
                studentIdField.setText("");
                studentNameField.setText("");
                bookIdField.setText("");
                issuedOnField.setText("");
            }
            else
            {
                JOptionPane.showMessageDialog(this,"No book is issued on this id currently");
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(this,e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ReturnBook().setVisible(true);
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
            System.out.println(e);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables


}
