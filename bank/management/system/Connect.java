package bank.management.system;

import java.sql.*;

public class Connect {

	Connection connection = null;
	Statement statement = null;
	String url = "jdbc:mysql://localhost:3306/bankSystem";
    String userName = "root";
	String password = "root";

	Connect(){
        try{
            connection = DriverManager.getConnection(url, userName, password);
			statement = connection.createStatement();
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
	}

}
