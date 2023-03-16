package accessModifre2;

import accessModifre.ProtectedTest;

public class Demo extends ProtectedTest{
	
	//int id_Protected = 20;
	String name_Protected = "karan" ;
	
	public static void main(String[] args) {
		
		//DefaultTest test = new DefaultTest();
		//System.out.println(test.id);
		//System.out.println(test.name);
		//test.m1();
		
		//ProtectedTest t = new ProtectedTest();
	    //System.out.println(t.id_Protected);
		//System.out.println(t.name);
		//t.m1();
		
		Demo demo = new Demo();
		System.out.println(demo.id_Protected);
		System.out.println(demo.name_Protected);
		demo.m1();
		System.out.println(demo.id_Protected);
		System.out.println(demo.name_Protected);
		
		
	}
	

}
