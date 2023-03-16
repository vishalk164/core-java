package com.Array;

public class DemoArray {
	
	public static void main(String[] args) {
		double[] arrayofDoubble = {1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8,9.9,10.10};
		System.out.println("lenght of double array = "+arrayofDoubble.length);
		System.out.println("\n7th index of double array = "+arrayofDoubble[7]);
		String [] arrayofString = {"vishal","sumit","karan","rahul"};
		System.out.println("\nleght of string array = "+arrayofString.length);
		System.out.println("\nindex array of 2 is = "+arrayofString[2]);
	System.out.println("\n\nArrayofdouble");
		for(int i = 0; i<arrayofDoubble.length;i++) {
			System.out.println(arrayofDoubble[i]);
		}
		
//		for each loop jdk1.7
		
		System.out.println("----  for each loop  ----");
		for (double d : arrayofDoubble) {
			System.out.println(d);
		}
		System.out.println("\nfor each loop String");
		for(String s : arrayofString) {
			System.out.println("\n"+s);
		}
		
		char[] charArray = { 65,66,67,68,69,70 };
		System.out.println("\nfor each loop char");
		for(char c : charArray) {
			System.out.println(c);
		}
		
	}

}
