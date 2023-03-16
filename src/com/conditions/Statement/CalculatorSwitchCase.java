package com.conditions.Statement;

import java.util.Scanner;

public class CalculatorSwitchCase {
	
	
	public static void main(String[] args) {
		CalculatorSwitchCase f = new CalculatorSwitchCase();
		
		System.out.println( " --------------   CALCULATOR   --------------- \n");
		
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter First No : ");
		int a = sc.nextInt();
		System.out.print(" Enter Secound No : ");
		int b = sc.nextInt();
		
		System.out.println("Entre 1 for sum ;   Entre 2 for sub ;\nEntre 3 for mul ;  Entre 4 for div ;\n ");
		System.out.print("Enter Your No. : ");
		int cal = sc.nextInt();
		
		switch (cal) {
		case 1 : {
			long calulator = a + b ;
			System.out.println("Sum of " + a + " And " + b + " : " +calulator );
			break;
		}
		case 2 : {
			int calulator = a - b ;
			System.out.println("sub of " + a + " And " + b + " : " +calulator );
			break;
		}
		case 3 : {
			int calulator = a * b ;
			System.out.println("Mul of " + a + " And " + b + " : " +calulator );
			break;
		}
		case 4 : {
			double calulator = a / b ;
			System.out.println("Div of " + a + " And " + b + " : " +calulator);
			break;
		}

		default:
		   System.out.println("pls Enter 1 to 4 only ");
		}
			
			
	}

}
