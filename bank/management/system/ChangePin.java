package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangePin extends JFrame implements ActionListener{

	JButton deposit,back;
	JPasswordField p1,p2;
	String pin;

	ChangePin(String pin){
		this.pin = pin;
        ImageIcon image1 = new ImageIcon(ClassLoader.getSystemResource("images/atm2.png"));
		Image image2 = image1.getImage().getScaledInstance(1400, 830, Image.SCALE_DEFAULT);
		ImageIcon image3 = new ImageIcon(image2);
		JLabel image = new JLabel(image3);
		image.setBounds(0,0,1400,830);
		add(image);

		JLabel label1 = new JLabel("Change Your Pin");
		label1.setForeground(Color.WHITE);
		label1.setFont(new Font("System",Font.BOLD,16));
		label1.setBounds(430,180,400,35);
		image.add(label1);


		JLabel label2 = new JLabel("New Pin");
		label2.setForeground(Color.WHITE);
		label2.setFont(new Font("System",Font.BOLD,16));
		label2.setBounds(430,220,400,35);
		image.add(label2);

		p1 = new JPasswordField();
	    p1.setBounds(430, 250, 200, 35);
		p1.setBackground(new Color(65,125,128));
		p1.setForeground(Color.WHITE);
		p1.setFont(new Font("Raleway",Font.BOLD,22));
		image.add(p1);

		JLabel label3 = new JLabel("Re Enter New Pin");
		label3.setForeground(Color.WHITE);
		label3.setFont(new Font("System",Font.BOLD,16));
		label3.setBounds(430,300,400,35);
		image.add(label3);

		p2 = new JPasswordField();
	    p2.setBounds(430, 330, 200, 35);
		p2.setBackground(new Color(65,125,128));
		p2.setForeground(Color.WHITE);
		p2.setFont(new Font("Raleway",Font.BOLD,22));
		image.add(p2);

		deposit = new JButton("Change Pin");
		deposit.setBounds(660, 362, 100, 35);
		deposit.setBackground(new Color(65,125,128));
		deposit.setForeground(Color.WHITE);
		deposit.addActionListener(this);
		image.add(deposit);

		back = new JButton("Back");
		back.setBounds(660, 406, 100, 35);
		back.setBackground(new Color(65,125,128));
		back.setForeground(Color.WHITE);
		back.addActionListener(this);
		image.add(back);


		setSize(1400,800);
		setLocation(0,0);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
    public void actionPerformed(ActionEvent e){
         try{
            String pin1 = p1.getText();
			String pin2 = p2.getText();
			if(e.getSource() == back){
				setVisible(false);
				new Main_Class(pin);
			}
			if(!pin1.equals(pin2)){
               JOptionPane.showMessageDialog(null, "Pin Does Not Match");
			   p1.setText("");
			   p2.setText("");
			   return ;
			}
			if(e.getSource() == deposit){
				if(p1.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Please Enter Both the Fields");
					p1.setText("");
					p2.setText("");
					return;
				}
				if(p1.getText().equals("")){
					JOptionPane.showMessageDialog(null, "Please Enter Both the Fields");
					p1.setText("");
					p2.setText("");
					return;
				}
				Connect connect = new Connect();
				String sql1 = "Update bank set pin = '"+pin1+"' where pin = '"+pin+"'";
				String sql2 = "Update login set pin = '"+pin1+"' where pin = '"+pin+"'";
				String sql3 = "Update signupthree set pin = '"+pin1+"' where pin = '"+pin+"'";

				connect.statement.executeUpdate(sql1);
				connect.statement.executeUpdate(sql2);
				connect.statement.executeUpdate(sql3);

				JOptionPane.showMessageDialog(null, "Pin Changed Successfully");
				setVisible(false);
				new Main_Class(pin1);
			}
		 }
		 catch(Exception E){
			E.printStackTrace();
		 }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         new ChangePin("");
	}

}
