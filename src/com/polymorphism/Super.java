package com.polymorphism;

public class Super {
	
	public void m1() {
		System.out.println("--Parent Class method--");

	}
	
    public void add(int i, int k) {
    	int c = i + k;
    	System.out.println("Addition : "+c);
    }
    
    public Super multiplication(int p, int q) {
    	System.out.println("this is multiplication method");
    	return  new Super() ;
    }

}
