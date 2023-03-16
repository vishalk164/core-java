package com.JDBC_Examples;

import java.sql.*;


public class jdbcConnection {
	
	 public static void main(String[] args) {
		
		 try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
			String sql = "insert into student values(280,'shrisha','arngaon/bhalawani')";
			String sql1 = "alter table student modify address varchar(56) not null";
			String sql2 = "update student set name = 'karan' where id = 103";
			String sql3= "create table emp(empId int primary key,empName varchar(20))";

			Statement stmt = connection.createStatement();
			stmt.execute(sql3);
			stmt.executeUpdate(sql2);
			
			connection.close();
			System.out.println("Insert record Sucessfully");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}

}
