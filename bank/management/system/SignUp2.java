package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SignUp2 extends JFrame implements ActionListener{
  
    String formNo;
	JComboBox<String> comboBox,comboBox2,comboBox3,comboBox4,comboBox5,comboBox6;
	JTextField textPan,textAadhar;
	JRadioButton radio1,radio2,radio3,radio4;
	JButton next;
	SignUp2(String formNo){
       super("APPLICATION FORM");

	   ImageIcon image1 = new ImageIcon(ClassLoader.getSystemResource("images/bank.png"));
	   Image image2 = image1.getImage().getScaledInstance(100,100 ,Image.SCALE_DEFAULT);
	   ImageIcon image3 = new ImageIcon(image2);
	   JLabel label = new JLabel(image3);
	   label.setBounds(150,5,100,100);
	   add(label);
       this.formNo = formNo;

	   JLabel l1 = new JLabel("Page 2 :-");
	   l1.setFont(new Font("Raleway",Font.BOLD,16));
	   l1.setBounds(300, 30, 600, 40);
	   add(l1);

	   JLabel l2 = new JLabel("Additional Details");
	   l1.setFont(new Font("Raleway",Font.BOLD,22));
	   l2.setBounds(300,60,600,40);
	   add(l2);

	   JLabel l3 = new JLabel("Religion");
	   l3.setFont(new Font("Raleway",Font.BOLD,22));
	   l3.setBounds(100, 120, 100, 30);
	   add(l3);

	   String[] religion = {"Hindu","Muslim","Christian","Jain","Others"};
	   comboBox = new JComboBox<String>(religion);
	   comboBox.setBackground(new Color(252,208,76));
	   comboBox.setFont(new Font("Raleway",Font.BOLD,14));
	   comboBox.setBounds(350,120,320,30);
	   add(comboBox);

	   JLabel l4 = new JLabel("Category");
	   l4.setFont(new Font("Raleway",Font.BOLD,22));
	   l4.setBounds(100, 170, 100, 30);
	   add(l4);

	   String[] category = {"General","OBC","SC","ST","Others"};
	   comboBox2 = new JComboBox<String>(category);
       comboBox2.setBackground(new Color(252,208,76));
	   comboBox2.setFont(new Font("Raleway",Font.BOLD,14));
	   comboBox2.setBounds(350,170,320,30);
	   add(comboBox2);

	   JLabel l5 = new JLabel("Income");
	   l5.setFont(new Font("Raleway",Font.BOLD,22));
	   l5.setBounds(100, 220, 100, 30);
	   add(l5);

	   String[] income = {"null","<1,50,000","<2,50,000","<5,00,000","<10,00,000","Above 10,00,000"};
       comboBox3 = new JComboBox<String>(income);
	   comboBox3.setBackground(new Color(252,208,76));
	   comboBox3.setFont(new Font("Raleway",Font.BOLD,14));
	   comboBox3.setBounds(350, 220, 320, 30);
	   add(comboBox3);

	   JLabel l6 = new JLabel("Education");
	   l6.setFont(new Font("Raleway",Font.BOLD,22));
	   l6.setBounds(100, 270, 150, 30);
	   add(l6);

	   String[] educational = {"Non Graduate","Graduate","Post Graduate","Doctrate","Other"};
	   comboBox4 = new JComboBox<String>(educational);
       comboBox4.setBackground(new Color(252,208,76));
	   comboBox4.setFont(new Font("Raleway",Font.BOLD,14));
	   comboBox4.setBounds(350, 270, 320, 30);
       add(comboBox4);

	   JLabel l7 = new JLabel("Occupation");
	   l7.setFont(new Font("Raleway",Font.BOLD,22));
	   l7.setBounds(100, 330, 150, 30);
	   add(l7);

	   String[] occupation = {"Salaried","Self-Employed","Business","Salaried","Student","Others"};
       comboBox5 = new JComboBox<String>(occupation);
	   comboBox5.setBackground(new Color(252,208,76));
	   comboBox5.setFont(new Font("Raleway",Font.BOLD,14));
	   comboBox5.setBounds(350, 330, 320, 30);
	   add(comboBox5);

	   JLabel l8 = new JLabel("PAN Number");
	   l8.setFont(new Font("Raleway",Font.BOLD,22));
	   l8.setBounds(100,390,150,30);
	   add(l8);

	   textPan = new JTextField();
	   textPan.setFont(new Font("Raleway",Font.BOLD,14));
	   textPan.setBounds(350,390,320,30);
	   add(textPan);

	   JLabel l9 = new JLabel("Aadhar Number");
	   l9.setFont(new Font("Raleway",Font.BOLD,22));
	   l9.setBounds(100,440,180,30);
	   add(l9);

	   textAadhar = new JTextField();
	   textAadhar.setFont(new Font("Raleway",Font.BOLD,14));
	   textAadhar.setBounds(350,440,320,30);
	   add(textAadhar);

	   JLabel l10 = new JLabel("Senior Citizen");
	   l10.setFont(new Font("Raleway",Font.BOLD,22));
	   l10.setBounds(100,490,180,30);
	   add(l10);

	   radio1 = new JRadioButton("Yes");
	   radio1.setFont(new Font("Raleway",Font.BOLD,14));
	   radio1.setBackground(new Color(252,208,76));
	   radio1.setBounds(350,490,100,30);
	   add(radio1);


	   radio2 = new JRadioButton("No");
	   radio2.setFont(new Font("Raleway",Font.BOLD,14));
	   radio2.setBackground(new Color(252,208,76));
	   radio2.setBounds(460,490,100,30);
	   add(radio2);

	   ButtonGroup buttonGroup = new ButtonGroup();
	   buttonGroup.add(radio1);
	   buttonGroup.add(radio2);

	   JLabel l11 = new JLabel("Existing Account");
	   l11.setFont(new Font("Raleway",Font.BOLD,22));
	   l11.setBounds(100,540,180,30);
	   add(l11);

	   radio3 = new JRadioButton("Yes");
	   radio3.setFont(new Font("Raleway",Font.BOLD,14));
	   radio3.setBackground(new Color(252,208,76));
	   radio3.setBounds(350,540,100,30);
	   add(radio3);


	   radio4 = new JRadioButton("No");
	   radio4.setFont(new Font("Raleway",Font.BOLD,14));
	   radio4.setBackground(new Color(252,208,76));
	   radio4.setBounds(460,540,100,30);
	   add(radio4);


	   ButtonGroup buttonGroup2 = new ButtonGroup();
	   buttonGroup2.add(radio3);
	   buttonGroup2.add(radio4);

	   JLabel l12 = new JLabel("Form No: ");
	   l12.setFont(new Font("Raleway",Font.BOLD,16));
	   l12.setBounds(600,10,100,30);
	   add(l12);

	   JLabel l13 = new JLabel(this.formNo);
	   l13.setFont(new Font("Raleway",Font.BOLD,16));
	   l13.setBounds(670,10,100,30);
	   add(l13);

	   next = new JButton("Next");
       next.setFont(new Font("Raleway",Font.BOLD,14));
	   next.setBackground(Color.WHITE);
	   next.setForeground(Color.BLACK);
	   next.setBounds(700,580,100,30);
	   next.addActionListener(this);
	   add(next);

	   setLayout(null);
       setSize(850,750);
	   setLocation(250, 30);
	   getContentPane().setBackground(new Color(252,208,76));
	   setDefaultCloseOperation(EXIT_ON_CLOSE);
	   setVisible(true);
	}

	public void actionPerformed(ActionEvent e){
		String religion = (String) comboBox.getSelectedItem();
		String category = (String) comboBox2.getSelectedItem();
		String income = (String) comboBox3.getSelectedItem();
		String education = (String) comboBox4.getSelectedItem();
		String occupation = (String) comboBox5.getSelectedItem();
		String pan = textPan.getText();
		String aadhar = textAadhar.getText();

		String seniorCitizen = null;
		if(radio1.isSelected()){
			seniorCitizen = "Yes";
		}
		else if(radio2.isSelected()){
			seniorCitizen = "No";
		}

		String existingAccount = null;
		if(radio3.isSelected()){
			existingAccount = "Yes";
		}
		else if(radio4.isSelected()){
			existingAccount = "No";
		}

		try{
           if(textPan.getText().equals("") || textAadhar.getText().equals("")){
			JOptionPane.showMessageDialog(null, "Fill all the details");

		   }
		   else{
			Connect connect = new Connect();
			String s = "INSERT INTO SignUpTwo VALUES ('" + formNo + "','" + religion + "','" + category + "','" + income + "','" + education + "','" + occupation + "','" + pan + "','" + aadhar + "','" + seniorCitizen + "','" + existingAccount + "')";

			connect.statement.executeUpdate(s);
			new SignUp3(formNo);
			setVisible(false);
		   }
		}
		catch(Exception E){
			E.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SignUp2("");
	}
}
