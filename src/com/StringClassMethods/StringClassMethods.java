package com.StringClassMethods;

public class StringClassMethods {
	
	public static void main(String[] args) {
		
		String s = "   Hi I am ViShal   ";
		System.out.println(s);
		s=s.trim();
		System.out.println(s);
		s = s.concat( " kamble ");
		System.out.println(s);
		s = s.toLowerCase();
		System.out.println(s);
		s = s.toUpperCase();
		System.out.println(s);
		int i = s.indexOf('A');
		System.out.println("Index of A is : " +i);
		s = s.replace('A', 'a');
		System.out.println(s);
		int a = 3;
		s = s.repeat(a);
		System.out.println(s);
		String ss = "   hi i Sumit ";
		s = s.replaceFirst(s, ss);
		System.out.println(s);
		s = s.replaceFirst(ss,"Hi I am Vishal");
		System.out.println(s);

		
				
	}

}
