package com.conditions.Statement;

import java.util.Scanner;

public class ForLoop {
	

	public static int sum(int a, int b) {
		int c = a + b;
		return c;
	}

	public static void main(String[] args) {

		System.out.println("---- Calculating Sum From Two NO -----\n");
		ForLoop forLoop = new ForLoop();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First No : ");
		int p = sc.nextInt();
		System.out.print("\nEnter Second No : ");
		int q = sc.nextInt();
		
        System.out.println("\n-------------    Loop is Working Strted : ->    -------------\n");  
		int add = 0;

		for (int i = p; i <= q; i++) {
			System.out.println("Inside of For loop  i : " + i);
			int sum = p + q ;
			sum = sum(add, i);
			
			System.out.println("Addition : " + sum);
		}
		
		System.out.println("\n----------    Addition of Two No : " +p+ " And " +q+ " is "+ add+"");

	}


	

}
