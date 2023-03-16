package com.ExceptionHandling;

public class TryWithPipeOperator {

	public static void main(String[] args) {

		try {

			String s = args[0];
			System.out.println("value of s is  : " + s);
			int i = Integer.parseInt(s);
			int c = 10 / 0 ;
			String s1 = null;
			System.out.println(s1.length());
		} catch (ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException e) {
			e.printStackTrace();
		}
	}

}
