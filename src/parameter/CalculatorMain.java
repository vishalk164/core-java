package parameter;

public class CalculatorMain {
	public static void main(String[] args) {
		CalculatorMain cal = new CalculatorMain();
		int sum = cal.addition(200, 50);//250
		//System.out.println("Sum is : "+sum);
		int newSum = cal.addition(sum, 50);//300
		newSum = cal.addition(newSum, 500);
		System.out.println(newSum);
		
		cal.m1(100, 900);
		
	}
	public void m1(int i, int j) {
		
		System.out.println("inside m1, s1: "+i+ "  , b1: "+j);
	}
	
	public int addition(int a, int b) {
		int c = a+b;
		System.out.println("sum : "+ c);
		return c;
	}

}
