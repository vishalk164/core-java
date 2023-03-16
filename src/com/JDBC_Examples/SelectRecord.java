package com.JDBC_Examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectRecord {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/college", "root", "root");
			String sql = "select * from emp";
			Statement smt = connection.createStatement();
			ResultSet rs = smt.executeQuery(sql);
			System.out.println("Employee ID"+"\t\tEmployee Name");
			while(rs.next()) {
				System.out.println("\n "+rs.getInt(1)+"\t\t\t"+rs.getString("empname"));
			}
			connection.close();
			
			
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
		
	}

}
