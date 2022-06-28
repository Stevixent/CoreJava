package LibaryProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class welcomePage extends JFrame implements ActionListener {


        JButton issueBookBtn;
        JButton returnBookBtn;
        JButton newBookBtn;
        JButton registerBtn;
        JButton issuedBookDetailsBtn;
        JButton bookDetailsBtn;
        JLabel jLabel1;
        JLabel jLabel2;
        JLabel jLabel3;
        JLabel jLabel4;
        JLabel jLabel5;

        public welcomePage() {


            jLabel1 = new JLabel();
            jLabel2 = new JLabel();
            jLabel4 = new JLabel();
            jLabel3 = new JLabel();
            jLabel5 = new JLabel();
            issueBookBtn = new JButton();
            returnBookBtn = new JButton();
            newBookBtn = new JButton();
            registerBtn = new JButton();
            issuedBookDetailsBtn = new JButton();
            bookDetailsBtn = new JButton();

            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setBackground(new Color(255, 255, 255));
            setVisible(true);
            setSize(400,300);

            jLabel1.setText("University Library");


            jLabel2.setText("Library ");

            jLabel4.setIcon(new ImageIcon(getClass().getResource("Book Details.png")));

            jLabel3.setIcon(new ImageIcon(getClass().getResource("Issue Book.png")));

            jLabel5.setIcon(new ImageIcon(getClass().getResource("Return Books.png")));

            issueBookBtn.setBackground(new Color(0, 102, 102));
            issueBookBtn.setFont(new Font("Tahoma", 1, 24)); // NOI18N
            issueBookBtn.setForeground(new Color(255, 255, 255));
            issueBookBtn.setText("Issue Book");
            issueBookBtn.addActionListener(this);

            returnBookBtn.setBackground(new Color(0, 102, 102));
            returnBookBtn.setFont(new Font("Tahoma", 1, 24)); // NOI18N
            returnBookBtn.setForeground(new Color(255, 255, 255));
            returnBookBtn.setText("Return Book");
            returnBookBtn.addActionListener(this);

            newBookBtn.setBackground(new Color(0, 102, 102));
            newBookBtn.setFont(new Font("Tahoma", 0, 12)); // NOI18N
            newBookBtn.setForeground(new Color(255, 255, 255));
            newBookBtn.setText("Add New Books");
            newBookBtn.addActionListener(this);

            registerBtn.setBackground(new Color(0, 102, 102));
            registerBtn.setFont(new Font("Tahoma", 0, 12)); // NOI18N
            registerBtn.setForeground(new Color(255, 255, 255));
            registerBtn.setText("Student Registration");
            registerBtn.addActionListener(this);

            issuedBookDetailsBtn.setBackground(new Color(0, 102, 102));
            issuedBookDetailsBtn.setFont(new Font("Tahoma", 0, 12)); // NOI18N
            issuedBookDetailsBtn.setForeground(new Color(255, 255, 255));
            issuedBookDetailsBtn.setText("Issued Book Details");
            issuedBookDetailsBtn.addActionListener(this);

            bookDetailsBtn.setBackground(new Color(0, 102, 102));
            bookDetailsBtn.setFont(new Font("Tahoma", 1, 24)); // NOI18N
            bookDetailsBtn.setForeground(new Color(255, 255, 255));
            bookDetailsBtn.setText("Book Details");
            bookDetailsBtn.addActionListener(this);

            add(jLabel1);

        }


        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == registerBtn){
                new registerPage();
            }else if (e.getSource() == bookDetailsBtn){
                new BookDetails();
            }else if (e.getSource() == newBookBtn){
                new  newBook();
            }else if (e.getSource() == issueBookBtn){
                new IssueBook();
            }else if (e.getSource() == returnBookBtn){
                new returnBooks();
            }else if (e.getSource() == issuedBookDetailsBtn){
                new issuedBooks();
            }

        }


    public static void main(String[] args) {
        welcomePage run = new welcomePage();
    }

}



