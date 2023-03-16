package com.ExceptionHandling;

public class TryCatchFinalReturnExmple {

	public static int m1() {
		System.out.println("m1 method TryCatch Class");
		try {
			System.out.println("--------Try Block---------");
		    int c = 10 / 0 ;
		    return c;
		} catch (Exception e) {
			System.out.println("---catch block-----");
			return 20;
			
		}finally {
			return 30;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(m1());
	}
}
