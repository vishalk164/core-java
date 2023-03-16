package packageTwo;

import javaClass.*;

public class ClassTwo {
	public String Name = "From packageTwo File ";

	public static void main(String[] args) {
		System.out.println("----------This is class two----------");
		System.out.println("  ");
		DefaultConstructor u = new DefaultConstructor();
		System.out.println(u.b);
		u.m1();
		DefaultConstructor.main(args);

	}

}
