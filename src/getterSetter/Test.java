package getterSetter;

public class Test {
	public static void main(String[] args) {

		System.out.println("----------------Student Details------------------");
		Student s = new Student();
		s.setId(101);
		System.out.println(s.getId());
		s.setName("Vishal");
		System.out.println(s.getName());
		s.setAddress("Nagar");
		System.out.println(s.getAdress());
		s.setMbNo(90000000000000l);
		System.out.println(s.getMbNo());
		s.setFees(234.44);
		System.out.println(s.getFess());

		System.out.println("-------------------------------------");

		Employee e = new Employee();
		e.setEmpId(201);
		e.setEmpName("Sumit");
		e.seteMbNo(234567823456l);
		e.seteSalary(654534.34);
		e.setEmpAddress("pune");

		System.out.println("---------Employee Details------------");
		System.out.println(e.getEmpId() + " " + e.getEmpName() + " " + e.geteMbNo() + " " + e.getEmpAddress() + " "
				+ e.geteSalary());

		System.out.println("----------------Student Details------------------");
		System.out.println(s.getId() + " " + s.getName() + " " + s.getMbNo() + " " + s.getAdress() + " " + s.getFess());

	}

}
