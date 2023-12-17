package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SignUp3 extends JFrame implements ActionListener{
   
	JRadioButton radio1,radio2,radio3,radio4;
	JCheckBox c1,c2,c3,c4,c5,c6;
	JButton submit,cancel;
	String formNo;

	SignUp3(String formNo){
	   super("Application Form");
	   this.formNo = formNo;
       ImageIcon image1 = new ImageIcon(ClassLoader.getSystemResource("images/bank.png"));
	   Image image2 = image1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
	   ImageIcon image3 = new ImageIcon(image2);
	   JLabel label = new JLabel(image3);
	   label.setBounds(150,5,100,100);
	   add(label);


	   JLabel l1 = new JLabel("Page 3:");
	   l1.setFont(new Font("Raleway",Font.BOLD,22));
	   l1.setBounds(280, 40, 400, 40);
	   add(l1);


	   JLabel l2 = new JLabel("Account Details");
	   l2.setFont(new Font("Raleway",Font.BOLD,22));
	   l2.setBounds(280, 70, 400, 40);
	   add(l2);


	   JLabel l3 = new JLabel("Account Type");
	   l3.setFont(new Font("Raleway",Font.BOLD,18));
	   l3.setBounds(100, 140, 200, 30);
	   add(l3);

	   radio1 = new JRadioButton("Savings Account");
	   radio1.setFont(new Font("Raleway",Font.BOLD,16));
	   radio1.setBackground(new Color(215,252,252));
       radio1.setBounds(100,180,150,30);
	   add(radio1);

	   radio2 = new JRadioButton("Fixed Deposit Account");
	   radio2.setFont(new Font("Raleway",Font.BOLD,16));
	   radio2.setBackground(new Color(215,252,252));
       radio2.setBounds(350,180,300,30);
	   add(radio2);

	   radio3 = new JRadioButton("Current Account");
	   radio3.setFont(new Font("Raleway",Font.BOLD,16));
	   radio3.setBackground(new Color(215,252,252));
       radio3.setBounds(100,220,250,30);
	   add(radio3);

	   radio4 = new JRadioButton("Recurring Deposit Account");
	   radio4.setFont(new Font("Raleway",Font.BOLD,16));
	   radio4.setBackground(new Color(215,252,252));
       radio4.setBounds(350,220,250,30);
	   add(radio4);
	   

	   ButtonGroup buttonGroup = new ButtonGroup();
	   buttonGroup.add(radio1);
	   buttonGroup.add(radio2);
	   buttonGroup.add(radio3);
	   buttonGroup.add(radio4);

	   JLabel l4 = new JLabel("Card Number");
	   l4.setFont(new Font("Raleway",Font.BOLD,18));
	   l4.setBounds(100, 300, 200, 30);
	   add(l4);

	   JLabel l5 = new JLabel("(Your 16-digit Card Number)");
	   l5.setFont(new Font("Raleway",Font.BOLD,12));
	   l5.setBounds(100, 330, 200, 20);
	   add(l5);

	   JLabel l6 = new JLabel("XXXX-XXXX-XXXX-4841");
	   l6.setFont(new Font("Raleway",Font.BOLD,18));
	   l6.setBounds(330, 300, 250, 30);
	   add(l6);

	   JLabel l7 = new JLabel("(it would appear on atm card/passbook and statements)");
	   l7.setFont(new Font("Raleway",Font.BOLD,12));
	   l7.setBounds(330, 330, 500, 20);
	   add(l7);

	   JLabel l8 = new JLabel("PIN");
	   l8.setFont(new Font("Raleway",Font.BOLD,18));
	   l8.setBounds(100, 370, 200, 30);
	   add(l8);

	   JLabel l9 = new JLabel("XXXX");
	   l9.setFont(new Font("Raleway",Font.BOLD,18));
	   l9.setBounds(330, 370, 200, 30);
	   add(l9);

	   JLabel l10 = new JLabel("(4-digit Password)");
	   l10.setFont(new Font("Raleway",Font.BOLD,12));
	   l10.setBounds(100, 400, 200, 20);
	   add(l10);

	   JLabel l11 = new JLabel("Services Required");
	   l11.setFont(new Font("Raleway",Font.BOLD,20));
	   l11.setBounds(100, 450, 200, 20);
	   add(l11);

	   c1 = new JCheckBox("ATM Card");
	   c1.setBackground(new Color(215,252,252));
	   c1.setFont(new Font("Raleway",Font.BOLD,16));
	   c1.setBounds(100, 480, 200, 30);
	   add(c1);


	   c2 = new JCheckBox("Internet Banking");
	   c2.setBackground(new Color(215,252,252));
	   c2.setFont(new Font("Raleway",Font.BOLD,16));
	   c2.setBounds(350, 480, 200, 30);
	   add(c2);

	   c3 = new JCheckBox("Mobile Banking");
	   c3.setBackground(new Color(215,252,252));
	   c3.setFont(new Font("Raleway",Font.BOLD,16));
	   c3.setBounds(100, 510, 200, 30);
	   add(c3);

	   c4 = new JCheckBox("Emial Alerts");
	   c4.setBackground(new Color(215,252,252));
	   c4.setFont(new Font("Raleway",Font.BOLD,16));
	   c4.setBounds(350, 510, 200, 30);
	   add(c4);

	   c5 = new JCheckBox("Cheque Book");
	   c5.setBackground(new Color(215,252,252));
	   c5.setFont(new Font("Raleway",Font.BOLD,16));
	   c5.setBounds(550, 480, 200, 30);
	   add(c5);

	   c6 = new JCheckBox("E Statement");
	   c6.setBackground(new Color(215,252,252));
	   c6.setFont(new Font("Raleway",Font.BOLD,16));
	   c6.setBounds(550, 510, 200, 30);
	   add(c6);

	   JCheckBox c7 = new JCheckBox("I hereby declare that the imformation entered is true to the best of my knowledge",true);
	   c7.setBackground(new Color(215,252,252));
	   c7.setFont(new Font("Raleway",Font.BOLD,16));
	   c7.setBounds(100, 560, 680, 20);
	   add(c7);

	   JLabel l12 = new JLabel("Form No: ");
	   l12.setFont(new Font("Raleway",Font.BOLD,18));
	   l12.setBounds(600, 10, 100, 30);
	   add(l12);

	   JLabel l13 = new JLabel(formNo);
	   l13.setFont(new Font("Raleway",Font.BOLD,18));
	   l13.setBounds(690, 10, 60, 30);
	   add(l13);

	   submit = new JButton("Submit");
	   submit.setFont(new Font("Raleway",Font.BOLD,14));
	   submit.setBackground(Color.BLACK);
	   submit.setForeground(Color.WHITE);
	   submit.setBounds(250, 600, 100, 30);
	   submit.addActionListener(this);
	   add(submit);

	   cancel = new JButton("Cancel");
	   cancel.setFont(new Font("Raleway",Font.BOLD,14));
	   cancel.setBackground(Color.BLACK);
	   cancel.setForeground(Color.WHITE);
	   cancel.setBounds(420, 600, 100, 30);
	   cancel.addActionListener(this);
	   add(cancel);

	   setLayout(null);
       setSize(850,800);
	   setLocation(250, 30);
	   getContentPane().setBackground(new Color(215,252,252));
	   setDefaultCloseOperation(EXIT_ON_CLOSE);
	   setVisible(true);
	}

	public void actionPerformed(ActionEvent e){
         String accountType = null;
		 if(radio1.isSelected()){
			accountType = "Savings Account";
		 }
		 else if(radio2.isSelected()){
			accountType = "Fixed Deposit Account";
		 }
		 else if(radio3.isSelected()){
			accountType = "Current Account";
		 }
		 else if(radio4.isSelected()){
			accountType = "Recurring Deposit Account";
		 }

		 Random random = new Random();
		 long first7 = (random.nextLong()%90000000L)+1409963000000000L;
		 String cardNo = ""+Math.abs(first7);
		 long first3 = (random.nextLong()%9000L)+1000L;
		 String pin = ""+Math.abs(first3);

		 String services = null;
		 if(c1.isSelected()){
			services += "ATM Card";
		 }
		 if(c2.isSelected()){
			services += "Internet Banking";
		 }
		 if(c3.isSelected()){
			services += "Mobile Banking";
		 }
		 if(c4.isSelected()){
			services += "Emial Alerts";
		 }
		 if(c5.isSelected()){
			services += "Cheque Book";
		 }
		 if(c6.isSelected()){
			services += "E Statement";
		 }
		 try{
            if(e.getSource() == submit){
				if(accountType.equals("")){
					JOptionPane.showMessageDialog(null, "Fill all the fields");
				}
				else{
					Connect connect = new Connect();
					String sql1 = "Insert into SignUpThree Values('"+formNo+"','"+accountType+"','"+cardNo+"','"+pin+"','"+services+"')";
					String sql2 = "Insert into login values('"+formNo+"','"+cardNo+"','"+pin+"')";
					connect.statement.executeUpdate(sql1);
					connect.statement.executeUpdate(sql2);
					JOptionPane.showMessageDialog(null,"Card Number : "+cardNo+"\n Pin: "+pin);
					new Deposit(pin);
					setVisible(false);
				}
			}
			else if(e.getSource() == cancel){
				System.exit(0);
			}
		 }
		 catch(Exception E){
			E.printStackTrace();
		 }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         new SignUp3("");
	}

}
