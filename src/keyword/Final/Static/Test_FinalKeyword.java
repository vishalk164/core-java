package keyword.Final.Static;

public class Test_FinalKeyword {
	
	// final keyword
	// it is use to restrict the user data.
	// We can use final keyword before class , data_member(Variable) , method . 
	// when we use final keyword before class  then class can't extends in another class .
	// when we use final keyword before data_member(Variable) then the variable value can't be change and that value is constant .
	// when we use final keyword before method then the method cant't be override . 
	
	final int id = 20 ;  // now value of id is constant
	static int id1 = 100;
	
	public final void addproduct() {
		System.out.println(" addproduct method of Test_finalkeyword classs ");

	}
	
	public static void main(String[] args) {
		Test_FinalKeyword logic = new Test_FinalKeyword();
		// logic.id = 30 ;
		
	}
	
	

}
