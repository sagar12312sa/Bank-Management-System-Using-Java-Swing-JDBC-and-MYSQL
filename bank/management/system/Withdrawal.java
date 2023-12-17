package bank.management.system;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class Withdrawal extends JFrame implements ActionListener{
	String pin;
    TextField textField;
	JButton deposit,back;
	Withdrawal(String pin){
		this.pin = pin;
        ImageIcon image1 = new ImageIcon(ClassLoader.getSystemResource("images/atm2.png"));
		Image image2 = image1.getImage().getScaledInstance(1400, 830, Image.SCALE_DEFAULT);
		ImageIcon image3 = new ImageIcon(image2);
		JLabel image = new JLabel(image3);
		image.setBounds(0,0,1400,830);
		add(image);

		JLabel label1 = new JLabel("Maximum Withdrwal is Rs 10000");
		label1.setForeground(Color.WHITE);
		label1.setFont(new Font("System",Font.BOLD,16));
		label1.setBounds(450,180,400,35);
		image.add(label1);

		JLabel label2 = new JLabel("Please enter the amount");
		label2.setForeground(Color.WHITE);
		label2.setFont(new Font("System",Font.BOLD,16));
		label2.setBounds(450,220,400,35);
		image.add(label2);

		textField = new TextField();
		textField.setBounds(420, 260, 320, 25);
		textField.setBackground(new Color(65,125,128));
		textField.setForeground(Color.WHITE);
		textField.setFont(new Font("Raleway",Font.BOLD,22));
		image.add(textField);

		deposit = new JButton("Withdraw");
		deposit.setBounds(680, 362, 90, 35);
		deposit.setBackground(new Color(65,125,128));
		deposit.setForeground(Color.WHITE);
		deposit.addActionListener(this);
		image.add(deposit);

		back = new JButton("Back");
		back.setBounds(680, 406, 90, 35);
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
		if(e.getSource() == deposit){
        try{
           String amount = textField.getText();
		   Date date = new Date();
		   if(textField.getText().equals("")){
			JOptionPane.showMessageDialog(null,"Please Enter the Amount");
		   }
		   else{
			Connect connect = new Connect();
			String sql = "select * from bank where pin = '"+pin+"'";
			ResultSet resultSet = connect.statement.executeQuery(sql);
			int balance = 0;
			while(resultSet.next()){
				if(resultSet.getString("type").equals("Deposit")){
					balance += Integer.parseInt(resultSet.getString("Amount"));
				}
				else{
					balance -= Integer.parseInt(resultSet.getString("Amount"));
				}
			}
			if(balance < Integer.parseInt(amount)){
				JOptionPane.showMessageDialog(null, "Insufficient Balance");
				return;
			}
			String sql2 = "insert into bank values('"+pin+"','"+date+"','Withdraw','"+amount+"')";
			connect.statement.executeUpdate(sql2);
			JOptionPane.showMessageDialog(null, "Rs : "+amount+ "Debited Successfully");
			setVisible(false);
			new Main_Class(pin);
		   }
		}
		catch(Exception E){
			E.printStackTrace(); 
		}
	  }
	  else if(e.getSource() == back){
          setVisible(false);
		  new Main_Class(pin);
	  }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new Withdrawal("");
	}

}
