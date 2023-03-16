package accessModifre;

public class Test {
	public static void main(String[] args) {
		
		//PrivateTest test = new PrivateTest();
		//System.out.println(test.id);
		//System.out.println(test.name);
		//test.m1();
		
		System.out.println(":--------------default access modifire-----------");
		DefaultTest test = new DefaultTest();
		System.out.println(test.id);
		System.out.println(test.name);
		test.m1();
		
		
		
		
		ProtectedTest ProtectedTest = new ProtectedTest();
		System.out.println(ProtectedTest.id_Protected);
		System.out.println(ProtectedTest.name_Protected);
		ProtectedTest.m1();
		
		

	}

}
