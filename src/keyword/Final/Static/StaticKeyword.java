package keyword.Final.Static;

public class StaticKeyword {

	int rollno;
	String name;
	static String collegeName = "D Y Patil"; // here we used static keyword so variable created common memory for all
												// object
												// we can use static variable in another class without creating object
												// directly call static variable in another class also
	final static String collegeAddress = "PUNE"; // we used static and final keyword now this variable value can't
													// change and create common memory

	public static void m1() {
		System.out.println("m1 method of staticKeyword class....");  // static method can't be override
		                                                             // when we use this static method then we don't need to create object for calling this method
	}
	
	public void m2() {             
		//  this is non static method we not used static keyword in this method m2
	    //	in this method we can call global variable without creating object
		
		System.out.println(rollno);
		System.out.println(name);
		System.out.println(collegeName);

	}

	public static void main(String[] args) {
		StaticKeyword s = new StaticKeyword();
		s.rollno = 10;
		s.name = "Akash";
		collegeName = "D Y Patil PUNE";

		StaticKeyword s1 = new StaticKeyword();
		s1.rollno = 20;
		s1.name = "Akshay";

		System.out.println("Roll NO : " + s.rollno + "\nName : " + s.name + "\nCollege Name : " + collegeName);
		s.m1();
		s.m2();
		
		// we don't need to create object for static variable


	}

}
