package com.JDBC_Examples.callableStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
	
	public static Connection connection = null;  //lasy
	
	
	private MyConnection() {

	}
	
	
	public static Connection getConnetion() throws ClassNotFoundException, SQLException {
		
		if(connection == null) {
		Class.forName("com.mysql.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://localhost/college", "root", "root");
		return connection;
		}else {
			return connection;
		}
		
	}

}
