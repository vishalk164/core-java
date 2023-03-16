package returnType;

public class B {
	
	
	int p = 90;
	int q = 70;
	int r;
	
	public B m2()
	{
		B b = new B();//90 70 0
		int p =10;//local variable 
		int q=20;//local variable 
		int r=30;//local variable
		b.p = r;//30
		b.q= p;//10
		b.r= q;//20
		System.out.println(p+" "+b.p+" "+r);//10 30 30 
		B b1 =new B();//90 70 0 
		//b1.p = 100;
		//b1.q = 200;
		//b1.r = 300;
		return b1;
	}
	
	public static void main(String[] args) {
		
		B b = new B();//
		System.out.println(b.p+" "+b.q+" "+b.r);//90 70 0
		B b2 = b.m2();
		System.out.println(b2.p+" "+b2.q+" "+b2.r);//90 70 0
		
	}


}
