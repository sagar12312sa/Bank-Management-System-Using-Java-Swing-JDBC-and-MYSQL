package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.*;

public class Deposit extends JFrame implements ActionListener{
    String pin;
	TextField textField;
	JButton deposit,back;
	Deposit(String pin){
		this.pin = pin;
		ImageIcon image1 = new ImageIcon(ClassLoader.getSystemResource("images/atm2.png"));
		Image image2 = image1.getImage().getScaledInstance(1400, 830, Image.SCALE_DEFAULT);
		ImageIcon image3 = new ImageIcon(image2);
		JLabel image = new JLabel(image3);
		image.setBounds(0,0,1400,830);
		add(image);

		JLabel label1 = new JLabel("Enter the amount you want to deposit");
		label1.setForeground(Color.WHITE);
		label1.setFont(new Font("System",Font.BOLD,16));
		label1.setBounds(430,180,400,35);
		image.add(label1);

		textField = new TextField();
		textField.setBounds(420, 230, 320, 25);
		textField.setBackground(new Color(65,125,128));
		textField.setForeground(Color.WHITE);
		textField.setFont(new Font("Raleway",Font.BOLD,22));
		image.add(textField);

		deposit = new JButton("Deposit");
		deposit.setBounds(680, 362, 80, 35);
		deposit.setBackground(new Color(65,125,128));
		deposit.setForeground(Color.WHITE);
		deposit.addActionListener(this);
		image.add(deposit);

		back = new JButton("Back");
		back.setBounds(680, 406, 80, 35);
		back.setBackground(new Color(65,125,128));
		back.setForeground(Color.WHITE);
		back.addActionListener(this);
		image.add(back);


		setSize(1550,1000);
		setLocation(0,0);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e){
		try{
           String amount = textField.getText();
		   Date date = new Date();
		   if(e.getSource() == deposit){
			  if(textField.getText().equals("")){
				JOptionPane.showMessageDialog(null, "Please Enter the Amount");
			 }
			 else{
				Connect connect = new Connect();
				String sql = "insert into bank values('"+pin+"','"+date+"','Deposit','"+amount+"')";
				connect.statement.executeUpdate(sql);
				JOptionPane.showMessageDialog(null,"Rs "+amount+" Deposited Successfully");
				setVisible(false);
				new Main_Class(pin);

			 }
		   }
		   else if(e.getSource() == back){
			setVisible(false);
			new Main_Class(pin);
		   }
		}
		catch(Exception E){
            E.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Deposit("");

	}

}
