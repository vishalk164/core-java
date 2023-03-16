package abstraction;

public class MS extends Vehicale {

	@Override
	public void specification() {
		System.out.println("MS specification");

	}

	public void m2() {
		System.out.println("m2 method of MS class");
	}

	public static void main(String[] args) {

		Vehicale v = new MS();
		v.tyre();
		v.specification();

	}
}
