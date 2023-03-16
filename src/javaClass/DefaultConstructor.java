package javaClass;

import packageTwo.ClassTwo;

public class DefaultConstructor {

	public DefaultConstructor() {
		System.out.println("----------Default Contructor of file DefaultContructor----------");
	}

	public byte b = 127;
	public short s = 32767;
	public int i = 2147483;
	float f = 3.14f;
	long l = 922337203685477580l;
	double d = 1123422;
	boolean boo = true;

	String name = "vishal kamble 123 @#$%%%^&*()";

	public void m1() {
		System.out.println("  ");
		System.out.println("---------------This is m1 method started_______________");
		int NO = 101;
		String name = "Vishal kamble";
		System.out.println(NO);
		System.out.println(name);

		System.out.println("  ");
		System.out.println("------------------this is m1 methoad end__________________");
		System.out.println("  ");
	}

	public static void main(String[] args) {
		System.out.println("-------------This is main method started_______________");
		System.out.println("  ");
		DefaultConstructor df = new DefaultConstructor();
		System.out.println("  ");
		df.m1();
		System.out.println("byte = " + df.b + "  Short =" + df.s + "  int = " + df.i + "  float = " + df.f + "  long = "
				+ df.l + "  double = " + df.d + "  boolean = " + df.boo);
		System.out.println(df.boo);
		System.out.println(df.name);
		System.out.println("  ");
		ClassTwo v = new ClassTwo();
		System.out.println(v.Name);

		System.out.println("main methodde end_________________");
	}

}
