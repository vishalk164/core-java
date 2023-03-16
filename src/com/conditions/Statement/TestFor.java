package com.conditions.Statement;

public class TestFor {
	
	public static void main(String[] args) {
		System.out.println("main method started----");
		TestFor f = new TestFor();
		// statement1: intialization, 2: Condition 3. increment/decrement
		int add =0;
		
		//int n = scanner;
		
		// Home work -- calculate sum from 100 to 200 
		for(int i =1; i<=10 ; i++ ) {//1+1=2, 2+1=3, 10,11 
			System.out.println("Inside For loop, i: "+ i);//1, 2,3...10
			add = f.sum(add, i);//add = 1, 3, 6...
			System.out.println("addition : "+add);//1, 3, 6...
		}
		int add1 = 0;
		for(int i =10; i>=0 ; i-- ) {//1+1=2, 2+1=3, 10,11 
			System.out.println("Inside For loop, i: "+ i);//1, 2,3...10
			add1 = f.sum(add1, i);//add = 1, 3, 6...
			System.out.println("addition : "+add1);//1, 3, 6...
		}
		
		System.out.println("Final Sum is : "+add1);
		
		
		
		System.out.println("main method Completed----");
	}
	
	public int sum(int a, int b) {
		int c  = a+b;
        return c;

	}

}
