package inheritance;

public class Child extends Parent {
	
	int j = 200;
	
	int i = 40;
	
	public void m2() {
		System.out.println("m2 method of Child class....");
	}
	
	@Override
	public void m1(int i) {
		System.out.println("override method m1......");

	}
	
	

}
