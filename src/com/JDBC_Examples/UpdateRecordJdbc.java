package com.JDBC_Examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateRecordJdbc {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/college","root","root");
			Scanner sc = new Scanner(System.in);
			String sql = "update emp set empname = ? where empid = ?";
			System.out.println("Enter name for update : ");
			String empname = sc.next();
			System.out.println("Enter employee id whos name u want to update");
			int empid = sc.nextInt();
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, empname);
			ps.setInt(2, empid);
			System.out.println("Record Updated ");
			ps.executeUpdate();
			connection.close();
			
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

}
