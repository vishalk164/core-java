package com.conditions.Statement;

public class IfElseiF {
	
	
	public static void main(String[] args) {
		System.out.println("------------Mian started---------");
		// Condition -- boolean == true / false 
		
		boolean flag = false;
		if(flag) {
			System.out.println("Inside If condtion__");
		}else {
			System.out.println("Inside else Condition----");
		}
		
		int marks = 100;
		if(marks >= 70) {
			System.out.println("You are in distinction class....");
		}
		else if (marks >= 60) {
		    System.out.println("You are in first class....");
		}
		else if (marks >= 50) {
		    System.out.println("You are in second class....");
		}
		else if (marks >= 35) {
		    System.out.println("You are Pass....");
		}
		else {
			System.out.println("You are fail....");
		}
		
		
		
		
		
		System.out.println("----------- Mian Complete--------");
		
	}


}
