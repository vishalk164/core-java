package abstraction;

public class Tata extends Vehicale {
	
	@Override
	public void specification() {
		System.out.println("---- Tata Specification ----");
		
	}
	
	public static void main(String[] args) {
		Vehicale v = new Tata();
		v.tyre();
		v.specification();
		
		
		Tata tata = new Tata();
		tata.tyre();
		tata.specification();
	}

}
