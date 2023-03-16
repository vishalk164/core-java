package com.polymorphism;

public class Test {
	
	public void m1(int i) {
		System.out.println("m1 single parameter method");
	}

	public void m1(int i, int j) {
		System.out.println("m1 douoble parameter method");
	}

	public static void main(String[] args) {

		Test test = new Test();
		test.m1(10, 80);// saving account
		// test.m1(10,20);//current account

		System.out.println("10");// System - class , out - static object
									// printstreams , println() - method -
									// printstreams

		System.out.println(10);
		System.out.println(10.123d);
		System.out.println('C');
		System.out.println(true);
		System.out.println(10.34f);
		System.out.println(98l);

	}


}
