package typeCasting;

public class Test {
	
	public P getTest() {

		P p = new P();
		Q q = new Q();
		R r = new R();

		return r;

	}

	public static void main(String[] args) {

		Test test = new Test();

		P p = test.getTest();
		
		System.out.println("-----P class------");
		
		System.out.println(p.i);
		p.m1();

		System.out.println("-----Q class------");

		Q q = (Q) test.getTest();
		System.out.println(q.i);
		System.out.println(q.j);
		q.m1();
		q.m2();

		System.out.println("------R class-----");

		R r = (R) test.getTest();
		System.out.println(r.i);
		System.out.println(r.j);
		System.out.println(r.k);

		r.m1();
		r.m2();
		r.m3();

	}
}
