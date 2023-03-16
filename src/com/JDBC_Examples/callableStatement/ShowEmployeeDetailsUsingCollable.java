package com.JDBC_Examples.callableStatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

public class ShowEmployeeDetailsUsingCollable {
	
	public static void main(String[] args) {
		

	
	try {
		
	Connection connection = MyConnection.getConnetion();
	CallableStatement cs = connection.prepareCall("{ call get_employee_details()}");
	ResultSet rs = cs.executeQuery();
	System.out.println(" ID"+"\t\tNAME"+"\t\tADDRESS");
	System.out.println("----------------------------------------");
	while(rs.next()) {
		System.out.println("\n "+rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3));
	}
	connection.close();

	}catch(Exception e) {
		e.printStackTrace();
	}
	
	}
	
	

}
