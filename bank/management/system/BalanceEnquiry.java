package bank.management.system;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BalanceEnquiry extends JFrame implements ActionListener{
    JLabel label2;
	JButton deposit;
	String pin;
	BalanceEnquiry(String pin){
	    
        this.pin = pin;
		ImageIcon image1 = new ImageIcon(ClassLoader.getSystemResource("images/atm2.png"));
		Image image2 = image1.getImage().getScaledInstance(1400, 830, Image.SCALE_DEFAULT);
		ImageIcon image3 = new ImageIcon(image2);
		JLabel image = new JLabel(image3);
		image.setBounds(0,0,1400,830);
		add(image);

		JLabel label1 = new JLabel("Your Current Balance is:");
		label1.setForeground(Color.WHITE);
		label1.setFont(new Font("System",Font.BOLD,16));
		label1.setBounds(430,180,400,35);
		image.add(label1);

		label2 = new JLabel();
		label2.setForeground(Color.WHITE);
		label2.setFont(new Font("System",Font.BOLD,16));
		label2.setBounds(430,220,400,35);
		image.add(label2);

		deposit = new JButton("Back");
		deposit.setBounds(620, 406, 150, 35);
		deposit.setBackground(new Color(65,125,128));
		deposit.setForeground(Color.WHITE);
		deposit.addActionListener(this);
		image.add(deposit);

		int balance = 0;
		try{
			Connect connect = new Connect();
			String sql = "Select * from bank where pin = '"+pin+"'";
            ResultSet resultSet = connect.statement.executeQuery(sql);
			while(resultSet.next()){
				if(resultSet.getString("type").equals("Deposit")){
					balance += Integer.parseInt(resultSet.getString("Amount"));
				}
				else{
					balance -= Integer.parseInt(resultSet.getString("Amount"));
				}
			}
			label2.setText(String.valueOf(balance));
		}
		catch(Exception E){
			E.printStackTrace();
		}
		
		setSize(1550,1000);
		setLocation(0,0);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e){
        setVisible(false);
		new Main_Class(pin);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new BalanceEnquiry("");
	}

}
