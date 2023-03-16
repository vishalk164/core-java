package typeCasting;

public class B {
	
	public static void main(String[] args) {
		
		double myDouble = 10.123d;
		
		int myInt = (int) myDouble;
		long l = (long) myDouble;
		float f = (float) myDouble;
		
		System.out.println(myDouble);
		System.out.println(myInt);
		System.out.println(l);
		System.out.println(f);
		
	}

}
