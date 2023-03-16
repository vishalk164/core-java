package com.polymorphism;

public class MainClass {
	
	//A B extends A , C extedns A

	public void m1(Object o) {
		System.out.println("---object class---");
	}

	public void m1(String s) {
		System.out.println("-----string class---");
	}
	
//	public void m1(Integer s) {
//		System.out.println("-----string class---");
//	}

	public static void main(String[] args) {
		MainClass cLass = new MainClass();
		
		//String s = new String();
		//Object o = new Object();
		
		cLass.m1(null);
	}


}
