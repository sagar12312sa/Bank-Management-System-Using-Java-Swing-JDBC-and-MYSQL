package bank.management.system;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.*;
import java.util.Date;
import java.sql.ResultSet;

public class FastCash extends JFrame implements ActionListener{
    JButton button1,button2,button3,button4,button5,button6,button7;
	String pin;
 	FastCash(String pin){
		this.pin = pin;
        ImageIcon image1 = new ImageIcon(ClassLoader.getSystemResource("images/atm2.png"));
		Image image2 = image1.getImage().getScaledInstance(1400, 700, Image.SCALE_DEFAULT);
		ImageIcon image3 = new ImageIcon(image2);
		JLabel image = new JLabel(image3);
		image.setBounds(0, 0, 1400, 700);
        add(image);
		

		JLabel label = new JLabel("Select Withdrwal Amount");
		label.setBounds(460, 180, 500, 25);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("System",Font.BOLD,20));
		image.add(label);

		button1 = new JButton("100");
		button1.setForeground(Color.WHITE);
		button1.setBackground(new Color(65,125,128));
		button1.setBounds(370, 230, 150, 30);
		button1.addActionListener(this);
		image.add(button1);

		button2 = new JButton("500");
		button2.setForeground(Color.WHITE);
		button2.setBackground(new Color(65,125,128));
		button2.setBounds(620, 230, 150, 30);
	    button2.addActionListener(this);
		image.add(button2);

		button3 = new JButton("1000");
		button3.setForeground(Color.WHITE);
		button3.setBackground(new Color(65,125,128));
		button3.setBounds(370, 270, 150, 30);
		button3.addActionListener(this);
		image.add(button3);

		button4 = new JButton("2000");
		button4.setForeground(Color.WHITE);
		button4.setBackground(new Color(65,125,128));
		button4.setBounds(620, 270, 150, 30);
		button4.addActionListener(this);
		image.add(button4);

		button5 = new JButton("5000");
		button5.setForeground(Color.WHITE);
		button5.setBackground(new Color(65,125,128));
		button5.setBounds(370, 310, 150, 30);
		button5.addActionListener(this);
		image.add(button5);

		button6 = new JButton("10000");
		button6.setForeground(Color.WHITE);
		button6.setBackground(new Color(65,125,128));
		button6.setBounds(620, 310, 150, 30);
		button6.addActionListener(this);
		image.add(button6);

		button7 = new JButton("Back");
		button7.setForeground(Color.WHITE);
		button7.setBackground(new Color(65,125,128));
		button7.setBounds(620, 350, 150, 30);
		button7.addActionListener(this);
		image.add(button7);




		setSize(1400,800);
		setLocation(0,0);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e){
         if(e.getSource() == button7){
			setVisible(false);
			new Main_Class(pin);
		 }
		 else{
			String amount = e.getActionCommand();
			Date date = new Date();
			String sql = "Select * from bank where pin = '"+pin+"'";
			try{
               Connect connect = new Connect();
			   ResultSet resultset = connect.statement.executeQuery(sql);
			   int balance = 0;
			   while(resultset.next()){
				if(resultset.getString("type").equals("Deposit")){
					balance += Integer.parseInt(resultset.getString("amount"));
				}
				else{
					balance -= Integer.parseInt(resultset.getString("amount"));
				}
			   }
			   if(e.getSource() != button7 && balance < Integer.parseInt(amount)){
				JOptionPane.showMessageDialog(null, "Insufficient balance");
				return;
			   }
               String sql2 = "Insert into bank values('"+pin+"','"+date+"','withdraw','"+amount+"')";
			   connect.statement.executeUpdate(sql2);
			   JOptionPane.showMessageDialog(null, "Rs "+amount+"Debited Successfully");
			}
			catch(Exception E){
				E.printStackTrace();;
			}
			setVisible(false);
			new Main_Class(pin);
		 }

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new FastCash("");
	}

}
