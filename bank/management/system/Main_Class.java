package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main_Class extends JFrame implements ActionListener{

	JButton button1,button2,button3,button4,button5,button6,button7;
	String pin;
    Main_Class(String pin){
         this.pin = pin;
		ImageIcon image1 = new ImageIcon(ClassLoader.getSystemResource("images/atm2.png"));
		Image image2 = image1.getImage().getScaledInstance(1400, 700, Image.SCALE_DEFAULT);
		ImageIcon image3 = new ImageIcon(image2);
		JLabel image = new JLabel(image3);
		image.setBounds(0, 0, 1400, 700);
        add(image);
		

		JLabel label = new JLabel("Please Select Your Transaction");
		label.setBounds(420, 180, 500, 25);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("System",Font.BOLD,20));
		image.add(label);

		button1 = new JButton("Deposit");
		button1.setForeground(Color.WHITE);
		button1.setBackground(new Color(65,125,128));
		button1.setBounds(370, 230, 150, 30);
		button1.addActionListener(this);
		image.add(button1);

		button2 = new JButton("Cash Withdrawal");
		button2.setForeground(Color.WHITE);
		button2.setBackground(new Color(65,125,128));
		button2.setBounds(620, 230, 150, 30);
	    button2.addActionListener(this);
		image.add(button2);

		button3 = new JButton("Fast Cash");
		button3.setForeground(Color.WHITE);
		button3.setBackground(new Color(65,125,128));
		button3.setBounds(370, 270, 150, 30);
		button3.addActionListener(this);
		image.add(button3);

		button4 = new JButton("Mini Statement");
		button4.setForeground(Color.WHITE);
		button4.setBackground(new Color(65,125,128));
		button4.setBounds(620, 270, 150, 30);
		button4.addActionListener(this);
		image.add(button4);

		button5 = new JButton("Pin Change");
		button5.setForeground(Color.WHITE);
		button5.setBackground(new Color(65,125,128));
		button5.setBounds(370, 310, 150, 30);
		button5.addActionListener(this);
		image.add(button5);

		button6 = new JButton("Balance Enquiry");
		button6.setForeground(Color.WHITE);
		button6.setBackground(new Color(65,125,128));
		button6.setBounds(620, 310, 150, 30);
		button6.addActionListener(this);
		image.add(button6);

		button7 = new JButton("Exit");
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
        if(e.getSource() == button1){
			new Deposit(pin);
			setVisible(false);
		}
		else if(e.getSource() == button7){
			System.exit(0);
		}
		else if(e.getSource() == button2){
			new Withdrawal(pin);
		}
		else if(e.getSource() == button6){
			new BalanceEnquiry(pin);
			setVisible(false);
		}
		else if(e.getSource() == button3){
			new FastCash(pin);
			setVisible(false);
		}
		else if(e.getSource() == button5){
			new ChangePin(pin);
			setVisible(false);
		}
		else if(e.getSource() == button4){
			new MiniStatement(pin);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main_Class("");

	}

}
