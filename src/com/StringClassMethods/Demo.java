package com.StringClassMethods;

public class Demo {
	
	public static void main(String[] args) {

		String s = "Java";// CPA
		// s = s.toUpperCase();// JAVA
		String s1 = new String("Java");// Heap
		String s5 = new String("Java").intern();// Heap

		String s2 = new String("java");

		String s3 = s;// Java

		String s4 = "java";

		// 1st way equals();

		System.out.println(s.equals(s1));// true
		System.out.println(s.equals(s2));// false
		System.out.println(s1.equals(s3));// true

		System.out.println(s.equalsIgnoreCase(s2));

		// 2nd by == operator//reference //address
		System.out.println("------==----operator example-----");
		System.out.println(s == s3);// true
		System.out.println(s == s1);// false
		System.out.println(s1 == s5);// false
		System.out.println(s == s5);// false

	}


}
