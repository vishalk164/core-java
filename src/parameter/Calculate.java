package parameter;

public class Calculate {
	public int addition(int i , int j) {
		int c = i + j ;
		return c;
	}
	public int subtraction(int i, int j) {
		int d = i - j ;
		return d;
	}
 public static void main(String[] args) {
	Calculate c = new Calculate();
	int add  = c.addition(70, 50);
	System.out.println("Addition of 2 no :" + add);
	int sub =c.subtraction(30233, 3456);
	System.out.println("Subtraction of 2 no :" + sub);
}

}
