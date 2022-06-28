package LibaryProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class registerPage extends JFrame implements ActionListener {
    Connection con;
    Statement stmt;
    ResultSet rs;
    String query;

       JTextArea addressTextarea;
       JComboBox<String> genreList;
       JComboBox<String> classList;
       JButton registerBtn;
       JButton cancelBtn;
       JButton homeBtn;
       JButton issuebookBtn;
       JButton returnbookBtn;
       JButton jButton6;
       JButton bookDetailsBtnActionPerformed;
       JLabel title;
       JLabel studentIdLabel;
       JLabel studentNameLabel;
       JLabel genreLabel;
       JLabel classLabel;
       JLabel addressLabel;
       JScrollPane jScrollPane1;
       JTextField studentIdField;
        JTextField studentNameField;

    public registerPage() {

        title = new JLabel();
        studentIdLabel = new JLabel();
        studentNameLabel = new JLabel();
        genreLabel = new JLabel();
        classLabel = new JLabel();
        addressLabel = new JLabel();
        studentIdField = new JTextField();
        studentNameField = new JTextField();
        genreList = new JComboBox<>();
        classList = new JComboBox<>();
        jScrollPane1 = new JScrollPane();
        addressTextarea = new JTextArea();
        registerBtn = new JButton();
        cancelBtn = new JButton();
        homeBtn = new JButton();
        issuebookBtn = new JButton();
        returnbookBtn = new JButton();
        jButton6 = new JButton();
        bookDetailsBtnActionPerformed = new JButton();

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        title.setFont(new Font("Georgia", 0, 36));
        title.setForeground(new Color(0, 102, 102));
        title.setText("Student Registration");

        studentIdLabel.setFont(new Font("Tahoma", 0, 14));
        studentIdLabel.setText("Student Id");

        studentNameLabel.setFont(new Font("Tahoma", 0, 14));
        studentNameLabel.setText("Student Name");

        genreLabel.setFont(new Font("Tahoma", 0, 14));
        genreLabel.setText("Genre");

        classLabel.setFont(new Font("Tahoma", 0, 14));
        classLabel.setText("Class");

        addressLabel.setFont(new Font("Tahoma", 0, 14));
        addressLabel.setText("Address");

        studentIdField.setFont(new Font("Tahoma", 0, 14));
        studentIdField.addActionListener((ActionListener) this);

        studentNameField.setFont(new java.awt.Font("Tahoma", 0, 14));

        genreList.setFont(new java.awt.Font("Tahoma", 0, 14));
        genreList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Genre", "Commerce", "Science", "Literature","History","Poetry" }));
        genreList.addActionListener((ActionListener) this);

        classList.setFont(new Font("Tahoma", 0, 14));
        classList.setModel(new DefaultComboBoxModel<>(new String[] { "Select Class" }));

        addressTextarea.setColumns(20);
        addressTextarea.setFont(new Font("Monospaced", 0, 14));
        addressTextarea.setRows(5);
        jScrollPane1.setViewportView(addressTextarea);

        registerBtn.setBackground(new Color(0, 102, 102));
        registerBtn.setFont(new Font("Tahoma", 0, 14));
        registerBtn.setForeground(new Color(255, 255, 255));
        registerBtn.setText("Register");
        registerBtn.addActionListener((ActionListener) this);

        cancelBtn.setBackground(new Color(204, 0, 0));
        cancelBtn.setFont(new Font("Tahoma", 0, 14));
        cancelBtn.setForeground(new Color(255, 255, 255));
        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener((ActionListener) this);

        homeBtn.setBackground(new Color(0, 102, 102));
        homeBtn.setFont(new Font("Tahoma", 0, 12));
        homeBtn.setForeground(new Color(255, 255, 255));
        homeBtn.setText("Home");
        homeBtn.addActionListener((ActionListener) this);

        issuebookBtn.setBackground(new java.awt.Color(0, 102, 102));
        issuebookBtn.setFont(new java.awt.Font("Tahoma", 0, 12));
        issuebookBtn.setForeground(new java.awt.Color(255, 255, 255));
        issuebookBtn.setText("Issue Book");
        issuebookBtn.addActionListener((ActionListener) this);

        returnbookBtn.setBackground(new java.awt.Color(0, 102, 102));
        returnbookBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        returnbookBtn.setForeground(new java.awt.Color(255, 255, 255));
        returnbookBtn.setText("Return Book");
        returnbookBtn.addActionListener((ActionListener) this);

        jButton6.setBackground(new Color(0, 102, 102));
        jButton6.setFont(new Font("Tahoma", 0, 12));
        jButton6.setForeground(new Color(255, 255, 255));
        jButton6.setText("Issued Book Details");
        jButton6.addActionListener((ActionListener) this);

        bookDetailsBtnActionPerformed.setBackground(new Color(0, 102, 102));
        bookDetailsBtnActionPerformed.setFont(new Font("Tahoma", 0, 12));
        bookDetailsBtnActionPerformed.setForeground(new Color(255, 255, 255));
        bookDetailsBtnActionPerformed.setText("Book Details");
        bookDetailsBtnActionPerformed.addActionListener((ActionListener) this);


    }// </editor-fold>//GEN-END:initComponents


    private void studentIdFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed



    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {
        if(studentIdField.getText().equals(""))
            JOptionPane.showMessageDialog(this,"Please enter StudentId");
        else if(studentNameField.getText().equals(""))
            JOptionPane.showMessageDialog(this,"Please enter Student Name");
        else if(genreList.getSelectedItem()=="Select Stream")
            JOptionPane.showMessageDialog(this,"Please select stream");
        else if(classList.getSelectedItem()=="Select Class")
            JOptionPane.showMessageDialog(this,"Please select class");
        else if(addressTextarea.getText().equals(""))
            JOptionPane.showMessageDialog(this,"Please enter Address");
        else
        {
            connect();
            try
            {
                query="insert into student values('"+ studentIdField.getText()+"','"+ studentNameField.getText()+"','"+ genreList.getSelectedItem()+"','"+ classList.getSelectedItem()+"','"+ addressTextarea.getText()+"');";
                stmt.executeUpdate(query);
                JOptionPane.showMessageDialog(this,"Thank you "+ studentIdField.getText()+"\nYou are registered now");

            }
            catch(SQLException e)
            {
                if(e.getErrorCode()==1062)
                    JOptionPane.showMessageDialog(this,"StudentId is a primary key, duplicate entry is not allowed\nIt should be unique");
                else
                    JOptionPane.showMessageDialog(this,"connection error");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void genreListActionPerformed(java.awt.event.ActionEvent evt) {
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




    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new registerPage().setVisible(true);
            }

        });

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

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
