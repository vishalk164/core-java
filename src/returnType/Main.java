package returnType;

public class Main {

	// primitive data type , non , classes
	public void m1() {
		System.out.println("m1 method of main class");
	}

	public int m2() {
		return 10;
	}

	public String m3() {
		return "Amar";
	}

	public char m4() {
		// char c = 'A'; //local variable
		return 'F';
	}

	public double m5() {
		return 10.123d;
	}

	public boolean m6() {
		return true;
	}

	public float m7() {
		return 123.67f;
	}
	public Student addStudentDetails() {
		Student s = new Student();

		s.id = 201;
		s.name = "Akshay";
		s.address = "Pune";

		return s;
	}

	public Employee addEmployeeDetails() {
		
		Employee e = new Employee();// 0 null null
		
		e.empid = 502;
		e.empname = "Mahesh";
		e.dept = "ENTC";

		return e;
	}

	public static void main(String[] args) {
		Main m = new Main();// Object creations
		
		//Employee e1 = m.addEmployeeDetails();
		//System.out.println(e1.empid+" "+e1.empname+" "+e1.dept);
		
		m.m1();
		int i = m.m2();
		System.out.println(i);
		System.out.println(m.m2());//10

		String s = m.m3();
		System.out.println(s);

		char d = m.m4();
		System.out.println(d);
		String q = m.m3();
		System.out.println(q);

		char dd = m.m4();
		System.out.println(dd);
		double d1 = m.m5();
		System.out.println(d1);

		boolean b = m.m6();
		System.out.println(b);

		float f = m.m7();
		System.out.println(f);

		Student student = m.addStudentDetails();
		System.out.println(student.id + " " + student.name + " "
				+ student.address);

		Employee employee = m.addEmployeeDetails();
		System.out.println(employee.empid + " " + employee.empname + " "
				+ employee.dept);

	}

}
		
