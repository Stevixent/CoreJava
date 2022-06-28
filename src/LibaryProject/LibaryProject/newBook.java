package LibaryProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Statement;

public class newBook extends JFrame {
    Connection con;
    Statement stmt;
    String query;
     JComboBox<String> genreList;
     JComboBox<String> classList;
     JButton addBtn;
     JButton cancelBtn;
     JButton homeBtn;
     JButton issuebookBtn;
     JButton returnbookBtn;
     JButton issuedbookdetailsBtn;
     JButton bookdetailsBtn;
     JLabel bookIDLabel;
     JLabel bookNameLabel;
     JLabel authorLabel;
     JLabel genreLabel;
     JLabel classLabel;
     JLabel title;
     JTextField bookIdField;
     JTextField bookNameField;
     JTextField authorField;


    public newBook() {
        bookIDLabel = new JLabel();
        bookIdField = new JTextField();
        bookNameLabel = new JLabel();
        bookNameField = new JTextField();
        authorLabel = new JLabel();
        authorField = new JTextField();
        genreLabel = new JLabel();
        classLabel = new JLabel();
        addBtn = new JButton();
        cancelBtn = new JButton();
        genreList = new JComboBox<>();
        classList = new JComboBox<>();
        title = new JLabel();
        homeBtn = new JButton();
        issuebookBtn = new JButton();
        returnbookBtn = new JButton();
        issuedbookdetailsBtn = new JButton();
        bookdetailsBtn = new JButton();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setSize(250,260);

        bookIDLabel.setFont(new Font("Tahoma", 0, 14));
        bookIDLabel.setText("Book Id");

        bookIdField.setFont(new Font("Tahoma", 0, 14));

        bookNameLabel.setFont(new Font("Tahoma", 0, 14));
        bookNameLabel.setText("Book Name");

        bookNameField.setFont(new Font("Tahoma", 0, 14));

        authorLabel.setFont(new Font("Tahoma", 0, 14));
        authorLabel.setText("Author");

        authorField.setFont(new Font("Tahoma", 0, 14));

        genreLabel.setFont(new Font("Tahoma", 0, 14));
        genreLabel.setText("Genre");

        classLabel.setFont(new Font("Tahoma", 0, 14));
        classLabel.setText("Class");

        addBtn.setBackground(new Color(0, 102, 102));
        addBtn.setFont(new Font("Tahoma", 0, 14));
        addBtn.setForeground(new Color(255, 255, 255));
        addBtn.setText("Add");
        addBtn.addActionListener((ActionListener) this);

        cancelBtn.setBackground(new Color(204, 0, 0));
        cancelBtn.setFont(new Font("Tahoma", 0, 14));
        cancelBtn.setForeground(new Color(255, 255, 255));
        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener((ActionListener) this);

        genreList.setFont(new Font("Tahoma", 0, 14));
        genreList.setModel(new DefaultComboBoxModel<>(new String[]{"Select Genre", "Commerce", "Science", "Arts"}));
        genreList.addActionListener((ActionListener) this);

        classList.setFont(new Font("Tahoma", 0, 14)); //
        classList.setModel(new DefaultComboBoxModel<>(new String[]{"Select Class"}));
        classList.addActionListener((ActionListener) this);


        title.setForeground(Color.BLUE);
        title.setText("Add a New Book");

        homeBtn.setBackground(new Color(0, 102, 102));
        homeBtn.setFont(new Font("Tahoma", 0, 12));
        homeBtn.setForeground(new Color(255, 255, 255));
        homeBtn.setText("Home");
        homeBtn.addActionListener((ActionListener) this);

        issuebookBtn.setBackground(new Color(0, 102, 102));
        issuebookBtn.setFont(new Font("Tahoma", 0, 12)); // NOI18N
        issuebookBtn.setForeground(new Color(255, 255, 255));
        issuebookBtn.setText("Issue Book");
        issuebookBtn.addActionListener((ActionListener) this);

        returnbookBtn.setBackground(new Color(0, 102, 102));
        returnbookBtn.setForeground(new Color(255, 255, 255));
        returnbookBtn.setText("Return Book");
        returnbookBtn.addActionListener((ActionListener) this);

        issuedbookdetailsBtn.setBackground(new Color(0, 102, 102));
        issuedbookdetailsBtn.setForeground(new Color(255, 255, 255));
        issuedbookdetailsBtn.setText("Issued Book Details");
        issuedbookdetailsBtn.addActionListener((ActionListener) this);

        bookdetailsBtn.setBackground(new Color(0, 102, 102));
        bookdetailsBtn.setFont(new Font("Tahoma", 0, 12)); // NOI18N
        bookdetailsBtn.setForeground(new Color(255, 255, 255));
        bookdetailsBtn.setText("Book Details");
        bookdetailsBtn.addActionListener((ActionListener) this);

    }


    private void genreListactionPerformed(ActionEvent e) {//GEN-FIRST:event_c3ActionPerformed
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
    }




    private void addBtnactionPerformed(ActionEvent evt) {
        if(bookIdField.getText().equals(""))
            JOptionPane.showMessageDialog(this,"Please enter Book id");
        else if(bookNameField.getText().equals(""))
            JOptionPane.showMessageDialog(this,"Please enter Book name");
        else if(bookNameField.getText().equals(""))
            JOptionPane.showMessageDialog(this,"Please enter author name");
        else if(genreList.getSelectedItem().equals("Select Genre"))
            JOptionPane.showMessageDialog(this,"Please select Genre");
        else if(classList.getSelectedItem().equals("Select Class"))
            JOptionPane.showMessageDialog(this,"Please select class");
        else
        {
            try
            {
                connect();
                query="insert into books values('"+ bookIdField.getText()+"','"+ bookNameField.getText()+"','"+ authorField.getText()+"','"+ genreList.getSelectedItem()+"','"+ classList.getSelectedItem()+"','YES');";
                stmt.executeUpdate(query);

                disconnect();
                JOptionPane.showMessageDialog(this,"New book added to Library");
                bookIdField.setText("");
                bookNameField.setText("");
                authorField.setText("");
                genreList.setSelectedIndex(0);
                classList.removeAllItems();
                classList.addItem("Select Class");

            }
            catch(SQLException e)
            {
                if(e.getErrorCode()==1062)
                    JOptionPane.showMessageDialog(this,"BookId is a primary key\nduplicate entry is not allowed\nit should be unique");
                else
                    JOptionPane.showMessageDialog(this,"connection error");
            }
        }

    }




    public static void main(String args[]) {

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


}
