package bank.management.system;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;


public class Login extends JFrame implements ActionListener{
    JLabel label1,label2,label3;
    JTextField textField2;
    JButton button1,button2,button3;
    JPasswordField passwordField3;
    Login(){
        super("Banking System");
        this.setSize(850,480);
        this.setLocation(260, 150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon image1 = new ImageIcon(ClassLoader.getSystemResource("images/bank.png"));
        Image image2 = image1.getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT);
        ImageIcon image3 = new ImageIcon(image2);
        JLabel image = new JLabel(image3);
        image.setBounds(350, 10, 100, 100);
        add(image);


        ImageIcon iimage1 = new ImageIcon(ClassLoader.getSystemResource("images/card.png"));
        Image iimage2 = iimage1.getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT);
        ImageIcon iimage3 = new ImageIcon(iimage2);
        JLabel iimage = new JLabel(iimage3);
        iimage.setBounds(630,350,100,100);
        add(iimage);
        
        label1 = new JLabel("Welcome To ATM");
        label1.setBounds(230,125,450,40);
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("AvantGarde",Font.BOLD,38));
        add(label1);

        label2 = new JLabel("Card No");
        label2.setBounds(150,190,375,30);
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("Raleway",Font.BOLD,28));
        add(label2);

        textField2 = new JTextField(15);
        textField2.setBounds(325, 190, 230, 30);
        textField2.setFont(new Font("Arial",Font.BOLD,14));
        add(textField2);


        label3 = new JLabel("PIN");
        label3.setBounds(150, 250, 375, 30);
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("Ralway",Font.BOLD,28));
        add(label3);

        passwordField3 = new JPasswordField(15);
        passwordField3.setBounds(325, 250, 230, 30);
        passwordField3.setFont(new Font("Arial",Font.BOLD,14));
        add(passwordField3);

        button1 = new JButton("SIGN IN");
        button1.setFont(new Font("Arial",Font.BOLD,14));
        button1.setForeground(Color.WHITE);
        button1.setBackground(Color.BLACK);
        button1.setBounds(300, 300, 100, 30);
        button1.addActionListener(this);
        add(button1);

        button2 = new JButton("CLEAR");
        button2.setFont(new Font("Arial",Font.BOLD,14));
        button2.setForeground(Color.WHITE);
        button2.setBackground(Color.BLACK);
        button2.setBounds(430,300,100,30);
        button2.addActionListener(this);
        add(button2);

        button3 = new JButton("SIGN UP");
        button3.setFont(new Font("Arial",Font.BOLD,14));
        button3.setForeground(Color.WHITE);
        button3.setBackground(Color.BLACK);
        button3.setBounds(300,350 , 230, 30);
        button3.addActionListener(this);
        add(button3);



        ImageIcon iiimage1 = new ImageIcon(ClassLoader.getSystemResource("images/backbg.png"));
        Image iiimage2 = iiimage1.getImage().getScaledInstance(850, 480, Image.SCALE_DEFAULT);
        ImageIcon iiimage3 = new ImageIcon(iiimage2);
        JLabel iiimage = new JLabel(iiimage3);
        iiimage.setBounds(0,0,850,480);
        add(iiimage);

        this.setLayout(null);
        //this.setUndecorated(true);
        this.setVisible(true);
        this.setResizable(false);
    }

    public void actionPerformed(ActionEvent e){
         try{
            if(e.getSource() == button1){
                try{
                   Connect connect = new Connect();
                   String cardNo = textField2.getText();
                   String pin = passwordField3.getText();
                   String sql = "Select * from login where card_no = '"+cardNo+"' and pin = '"+pin+"'";
                   ResultSet resultSet = connect.statement.executeQuery(sql);
                   if(resultSet.next()){
                    setVisible(false);
                    new Main_Class(pin);
                   }
                   else{
                    JOptionPane.showMessageDialog(null, "You Don't have an account please sign up to create a new account");
                    passwordField3.setText("");
                    textField2.setText("");
                   }
                }
                catch(Exception E){
                    E.printStackTrace();
                }
            }
            else if(e.getSource() == button2){
                textField2.setText("");
                passwordField3.setText("");
            }
            else if(e.getSource() == button3){
                new Signup();
                setVisible(false);
            }
         }
         catch(Exception E){
            E.printStackTrace();
         }
    }

    public static void main(String[] args) {
        new Login();
    }
}
