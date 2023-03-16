package com.Array;

import java.util.Scanner;

public class Array {
	
	public static void main(String[] args) {
		
		int [] arrayOfInts = new int[5];
		
		arrayOfInts[0] = 10;
		arrayOfInts[1] = 34;
		arrayOfInts[3] = 87;
		arrayOfInts[4] = 31;
		arrayOfInts[2] = 56;
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
//		arrayOfInts[s];
		
		System.out.println(arrayOfInts.length);
		
		System.out.println(arrayOfInts[2]);
		System.out.println(arrayOfInts[3]);
		
		System.out.println("\n\n-------- Array ---------\n");
		
		for(int i = 0 ; i<arrayOfInts.length;i++ ) {
			System.out.println(i+" index of array = "+arrayOfInts[i]);
		}
		
	}

}
