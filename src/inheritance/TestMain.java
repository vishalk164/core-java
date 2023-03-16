package inheritance;

 class TestMain {
	
	  public static void main(String[] args) {
		
		  Child c = new Child();
		  System.out.println(c.j);
		  c.m2();
		  System.out.println(c.i);
		  c.m1(20);
	}

}
