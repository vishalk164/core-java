package com.JDBC_Examples.callableStatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class insertRecord {

	public static void main(String[] args) {
		
		try {
			Connection connection = MyConnection.getConnetion();
			CallableStatement cs = connection.prepareCall("{ call insert_emp_details(?,?,?) }");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your id : ");
			int id = sc.nextInt();
			System.out.println("Enter your name : ");
			String name = sc.next();
			System.out.println("Enter your Address");
			String address = sc.next();
			cs.setInt(1, id);
			cs.setString(2, name);
			cs.setString(3, address);
			cs.execute();
			System.out.println("Record Inserted");
			connection.close();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
