package inheritance;

public class B extends A {

	 int j = 20;

	 public void m2() {
	  System.out.println("m2 method of B class");
	 }

	 public static void main(String[] args) {

	  // Parent class
	  A a = new A();
	  System.out.println(a.i);
	  a.m1();

	  // child class
	  B b = new B();
	  System.out.println(b.i);
	  System.out.println(b.j);
	  b.m1();
	  b.m2();

	 }

}
