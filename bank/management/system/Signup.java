package bank.management.system;

import javax.swing.*;
import com.toedter.calendar.JDateChooser;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class Signup extends JFrame implements ActionListener{
    Random ran = new Random();
    long first4 = (ran.nextLong()%9000L)+1000L;
    String first = " "+Math.abs(first4);
    JTextField textField1,textField2,textField3,textField5,textField6,textField7,textField8;
    JDateChooser date;
    JRadioButton radio1,radio2,radio3,radio4,radio5;
    JButton next;
	
    Signup(){
        super ("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);
        
        JLabel label1 = new JLabel("APPLICATION FORM NO."+first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Raleway",Font.BOLD,38));
        add(label1);

        JLabel label2 = new JLabel("Page1");
        label2.setFont(new Font("Raleway",Font.BOLD,22));
        label2.setBounds(330, 70, 600, 30);
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Raleway",Font.BOLD,22));
        label3.setBounds(290,100,600,30);
        add(label3);        

        JLabel labelName = new JLabel("Name :");
        labelName.setFont(new Font("Raleway",Font.BOLD,20));
        labelName.setBounds(100,150, 100, 30);
        add(labelName);

        textField1 = new JTextField();
        textField1.setFont(new Font("Raleway",Font.BOLD,14));
        textField1.setBounds(300,150,400,30);
        add(textField1);

        JLabel fatherName = new JLabel("Father's Name :");
        fatherName.setFont(new Font("Raleway",Font.BOLD,20));
        fatherName.setBounds(100,190,200,30);
        add(fatherName);

        textField2 = new JTextField();
        textField2.setFont(new Font("Raleway",Font.BOLD,14));
        textField2.setBounds(300,190,400,30);
        add(textField2);

        JLabel dob = new JLabel("Date Of Birth :");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100, 230, 200, 30);
        add(dob);

        date = new JDateChooser();
        date.setForeground(new Color(105,105,105));
        date.setBounds(300,230,400,30);
        add(date);

        JLabel gender = new JLabel("Gender :");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100, 270, 200, 30);
        add(gender);

        radio1 = new JRadioButton("Male");
        radio1.setFont(new Font("Raleway",Font.BOLD,14));
        radio1.setBackground(new Color(222,255,228));
        radio1.setBounds(300,270,60,30);
        add(radio1);

        radio2 = new JRadioButton("Female");
        radio2.setFont(new Font("Raleway",Font.BOLD,14));
        radio2.setBackground(new Color(222,255,228));
        radio2.setBounds(390, 270, 100, 30);
        add(radio2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radio1);
        buttonGroup.add(radio2);

        JLabel email = new JLabel("Email id :");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100, 310, 200, 30);
        add(email);

        textField3 = new JTextField();
        textField3.setFont(new Font("Raleway",Font.BOLD,14));
        textField3.setBounds(300,310,400,30);
        add(textField3);

        JLabel maritalStatus = new JLabel("Marital Status :");
        maritalStatus.setFont(new Font("Raleway",Font.BOLD,20));
        maritalStatus.setBounds(100,350,200,30);
        add(maritalStatus);

        radio3 = new JRadioButton("Married");
        radio3.setFont(new Font("Raleway",Font.BOLD,14));
        radio3.setBackground(new Color(222,255,228));
        radio3.setBounds(300, 350, 100, 30);
        add(radio3);

        radio4 = new JRadioButton("Single");
        radio4.setFont(new Font("Raleway",Font.BOLD,14));
        radio4.setBackground(new Color(222,255,228));
        radio4.setBounds(400, 350, 100, 30);
        add(radio4);

        radio5 = new JRadioButton("Others");
        radio5.setFont(new Font("Raleway",Font.BOLD,14));
        radio5.setBackground(new Color(222,255,228));
        radio5.setBounds(500, 350, 100, 30);
        add(radio5);

        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(radio3);
        buttonGroup2.add(radio4);
        buttonGroup2.add(radio5);


        JLabel address = new JLabel("Address :");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100,390,200,30);
        add(address);

        textField5 = new JTextField();
        textField5.setFont(new Font("Raleway",Font.BOLD,14));
        textField5.setBounds(300, 390, 400, 30);
        add(textField5);

        JLabel city = new JLabel("City :");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,430,200,30);
        add(city);

        textField6 = new JTextField();
        textField6.setFont(new Font("Raleway",Font.BOLD,14));
        textField6.setBounds(300, 430, 400, 30);
        add(textField6);

        JLabel pinCode = new JLabel("Pin Code :");
        pinCode.setFont(new Font("Raleway",Font.BOLD,20));
        pinCode.setBounds(100,470,200,30);
        add(pinCode);

        textField7 = new JTextField();
        textField7.setFont(new Font("Raleway",Font.BOLD,14));
        textField7.setBounds(300,470,400,30);
        add(textField7);

        JLabel state= new JLabel("State");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,510,200,30);
        add(state);

        textField8 = new JTextField();
        textField8.setFont(new Font("Raleway",Font.BOLD,14));
        textField8.setBounds(300, 510, 400, 30);
        add(textField8);

        next = new JButton("NEXT");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(660,580,80,30);
        next.addActionListener(this);
        add(next);




        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        getContentPane().setBackground(new Color(222,255,228));
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){
        String formNo = first;
        String name = textField1.getText();
        String fatherName = textField2.getText();
        String dob = ((JTextField) date.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(radio1.isSelected()){
           gender = "Male";
        }
        else if(radio2.isSelected()){
            gender = "Female";
        }

        String email = textField3.getText();
        String marital = null;
        if(radio3.isSelected()){
            marital = "Married";
        }
        else if(radio4.isSelected()){
            marital = "Single";
        }
        else if(radio5.isSelected()){
            marital = "Others";
        }

        String address = textField5.getText();
        String city = textField6.getText();
        String pinCode = textField7.getText();
        String state = textField8.getText();

        try{
           if(textField1.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Fill all the details");
           }
           if(textField2.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Fill all the details");
           }
           else{
             Connect connect = new Connect();
             String sql = "INSERT INTO SignUp VALUES('"+formNo+"','"+name+"','"+fatherName+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pinCode+"','"+state+"')";
             connect.statement.executeUpdate(sql);
             new SignUp2(formNo);
             this.setVisible(false);
           }
        }
        catch(Exception E){
            E.printStackTrace();
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          new Signup();
	}

}
