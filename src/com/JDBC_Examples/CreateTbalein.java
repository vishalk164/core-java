package com.JDBC_Examples;

import java.sql.*;

public class CreateTbalein {

	public static void main(String[] args) {

		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "root");
			String sql3 = "create table emp111(empId int primary key,empName varchar(20))";

			Statement stmt = connection.createStatement();
			stmt.execute(sql3);

			System.out.println("Table Created Sucessfully");

			connection.close();

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
