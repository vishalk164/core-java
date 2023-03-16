package abstraction;

public class B extends A {
	
	@Override
	public void m1() {
		System.out.println("-- overrided in child class --");
		
	}
	

	public static void main(String[] args) {
		
		A a = new B(); // parent child mix 
		a.m1();
		a.m2();
		
		System.out.println("-- Child class object --");
		B b = new B();
		b.m1();
		b.m2();


	}

}
