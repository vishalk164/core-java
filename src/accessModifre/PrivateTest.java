package accessModifre;

public class PrivateTest{
	
	private int id = 10;
	private String name = "Vishal";
	
	private PrivateTest() {
		
	}
	private void m1() {
		System.out.println("--------m1 private method----------");
	}
	
	public static void main(String[] args) {
		PrivateTest test =  new PrivateTest();
		System.out.println(test.id);
		System.out.println(test.name);
		test.m1();
	}

}
