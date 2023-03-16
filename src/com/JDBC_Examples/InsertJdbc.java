package com.JDBC_Examples;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class InsertJdbc{

	public static void main(String[] args) {

		try {

			Class.forName("com.mysql.jdbc.Driver");
			// step 2: create the connection
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "root");// URL
																													// ,
																													// UN
			Scanner sc = new Scanner(System.in);
			String sql = "insert into emp values (?,?,?)";

			System.out.println("Enter employee id ");
			int empid = sc.nextInt();
			System.out.println("Enter employee name ");
			String empname = sc.next();
			System.out.println("Enter Employee Address");
			String empaddress = sc.next();
			//
			PreparedStatement ps = connection.prepareStatement(sql);

			ps.setInt(1, empid);
			ps.setString(2, empname);
			ps.setString(3,empaddress);
			ps.execute();
			System.out.println("records inserted using ps ");
			connection.close();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

