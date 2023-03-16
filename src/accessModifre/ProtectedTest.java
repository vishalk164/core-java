package accessModifre;

public class ProtectedTest extends Test{
	
      protected final int id_Protected = 10;
      protected String name_Protected = "amol";
      
      protected void m1 () {
    	  System.out.println("---------m1 protected method------");
    	  
      }
      
      public static void main(String[] args) {
		ProtectedTest test = new ProtectedTest();
		System.out.println(test.id_Protected);
		System.out.println(test.name_Protected);
		test.m1();
	}
}
