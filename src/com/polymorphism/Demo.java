package com.polymorphism;

public class Demo {
	private int m2(String s, int j) {
		System.out.println("--m2 method --");
		return 10;
	}

	public final void m2(int i, float f) {
		System.out.println("--m2 overload method--");
	}

	public static void main(String[] args) {

		Demo demo = new Demo();

		demo.m2(10, 10.123f);
		demo.m2("abc", 90);

		// Integer[] intArray = new Integer[1];
		// main(intArray);

	}

	public static void main(Integer[] args) {

		System.out.println("main method overload");
	}


}
