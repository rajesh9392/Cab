package com.ola.Booking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectionManager {
	
  public static Connection conn; 
	
	public static Connection getConnection() {
	String url = "jdbc:mysql://127.0.0.1:3306/mydb";
	String username = "root";
	String password = "mysql";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;		
	}

}
