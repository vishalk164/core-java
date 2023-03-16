package com.conditions.Statement;

import java.util.Scanner;

public class AccessModifire_Info {

	// static int i = 5

    void pm() {

		System.out.println("-------- Public AccessModifire ---------");
		System.out.println("Public:\n The public access modifier is accessible everywhere. It has the widest scope among all other modifiers.");

	}

	static void sm() {

		System.out.println("\npls Enter Correct value 1 to 4 only");

	}

	public static void main(String[] args) {

		AccessModifire_Info s = new AccessModifire_Info();
		

		System.out.println("\n----------------^--------->  Access Modifire Info  <-------------^---------------\n");
		
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter Your Name : " );
		String name = sc.next();
		System.out.print(" Password        : " );
		int pass = sc.nextInt();

		System.out.println("\nEnter 1 for Private AccessModifire         Enter 2 for Default AccessModifire");
		System.out.println("Enter 3 for Protected AccessModifire       Enter 4 for Public AccessModifire\n");

		System.out.print(" Enter No. : ");

		int i = sc.nextInt();
		
		// int i = 5;
		if(pass == 1234) {
			System.out.println("\n Hi " +name);
		if (i <= 1) {
			System.out.println("--------Private AccessModifire---------");
			System.out.println(" Private:\n The private access modifier is accessible only within the class. ");
		} else if (i <= 2) {
			System.out.println("--------Default AccessModifire---------");
			System.out.println("Default:\n If you don't use any modifier, it is treated as default by default.\n The default modifier is accessible only within package.\n It cannot be accessed from outside the package.\n It provides more accessibility than private. But, it is more restrictive than protected, and public.");
		} else if (i <= 3) {
			System.out.println("--------Protected AccessModifire---------");
			System.out.println("Protected:\n The protected access modifier is accessible within package and outside the package but through inheritance only.\n The protected access modifier can be applied on the data member, method and constructor.\n It can't be applied on the class");
		} else if (i <= 4) {
			s.pm();
		} else {
			sm();
		}
		}else {
			System.out.println(" You Enter wrong password "+pass);
		}
		
		System.out.print("\n\nboolean :");
		boolean a = sc.nextBoolean();
		if( a ) {
			System.out.println("boolean is " +a);
		}else {
			System.out.println("boolean is " +a);
		}
	}

}
