package com.JDBC_Examples.callableStatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Scanner;

public class EmployeeDetails_Insert_Find {
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			System.out.println("Find Employee by using id Enter : 1");
			System.out.println("Find Employee by using Name Enter : 2");
			System.out.println("Show All Records Enter : 3");
			System.out.println("Insert Record Enter : 4");
			System.out.println("Delete EmpDetails Using Name Enter: 5");
			System.out.println("Delete EmpDetails Using Id Enter: 6");
			System.out.println("Exit enter : 7");

			System.out.print("\nEnter no : ");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				ByUsingId();
				break;
			case 2:
				ByUsingName();
				break;
			case 3:
				AllRecord();
				break;
			case 4:
				InsertRecord();
				break;
			case 5:
				DeleteEmployeeByUsingName();
				break;
			case 6:
				DeleteEmployeeByUsingId();
				break;
			case 7:
				flag = false;
				System.out.println("Exit");
				break;
			default:
				System.out.println("Unexcepted Value " + ch + "\n---------------------\n");
			}
		}

	}

	public static void ByUsingId() {
		try {
			
			Scanner sc = new Scanner(System.in);
			Connection connection = MyConnection.getConnetion();
			CallableStatement cs = connection.prepareCall("{ call get_employee_particular_details(?)}");
			System.out.print("Enter Employee id : ");
			int id = sc.nextInt();
			cs.setInt(1, id);
			ResultSet rs = cs.executeQuery();
			System.out.println("\n ID" + "\t\tNAME" + "\t\tADDRESS");
			System.out.println("----------------------------------------");
			while (rs.next()) {
				System.out.println("\n " + rs.getInt(1) + "\t\t" + rs.getString(2) + "\t\t" + rs.getString(3));
			}
			System.out.println("----------------------------------------\n");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void ByUsingName() {
		try {
			
			Scanner sc = new Scanner(System.in);
			Connection connection = MyConnection.getConnetion();
			CallableStatement cs = connection.prepareCall("{ call get_employee_ByUsingName(?)}");
			System.out.print("Enter Employee Name : ");
			String Name = sc.next();
			cs.setString(1, Name);
			ResultSet rs = cs.executeQuery();
			System.out.println(" ID" + "\t\tNAME" + "\t\tADDRESS");
			System.out.println("----------------------------------------");
			while (rs.next()) {
				System.out.println("\n " + rs.getInt(1) + "\t\t" + rs.getString(2) + "\t\t" + rs.getString(3));
			}
			System.out.println("----------------------------------------\n");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void AllRecord() {
		try {

			Connection connection = MyConnection.getConnetion();
			CallableStatement cs = connection.prepareCall("{ call get_employee_details()}");
			ResultSet rs = cs.executeQuery();
			System.out.println(" ID" + "\t\tNAME" + "\t\tADDRESS");
			System.out.println("----------------------------------------");
			while (rs.next()) {
				System.out.println("\n " + rs.getInt(1) + "\t\t" + rs.getString(2) + "\t\t" + rs.getString(3));
			}
			System.out.println("----------------------------------------\n");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void InsertRecord() {
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

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void DeleteEmployeeByUsingName() {
		try {
			
			Scanner sc = new Scanner(System.in);
			Connection connection = MyConnection.getConnetion();
			CallableStatement cs = connection.prepareCall("{ call Delete_employee_ByUsingName(?)}");
			System.out.print("Enter Employee Name : ");
			String Name = sc.next();
			cs.setString(1, Name);
			cs.executeQuery();
			System.out.println("Employee Deleted Sucssesfully ");
			System.out.println("----------------------------------------\n");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void DeleteEmployeeByUsingId() {
		try {
			
			Scanner sc = new Scanner(System.in);
			Connection connection = MyConnection.getConnetion();
			CallableStatement cs = connection.prepareCall("{ call Delete_employee_ByUsingId(?)}");
			System.out.print("Enter Employee Id : ");
			int eid = sc.nextInt();
			cs.setInt(1, eid);
			cs.executeQuery();
			System.out.println("Employee Deleted Sucssesfully ");
			System.out.println("----------------------------------------\n");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
