package accessModifre;

    class DefaultTest {
    	
    	int id = 90;
    	String name = "Sumit";
    	
    	
    	void m1() {
    		System.out.println("---------m1 default methot----------");
    		
    	}
    	
    	public static void main(String[] args) {
    		
    		DefaultTest test = new DefaultTest();
    		System.out.println(test.id);
    		System.out.println(test.name);
    		test.m1();
			
		}
    	
	

}
