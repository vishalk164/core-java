package keyword.Final.Static;

public class CounterStatic {
	static int counter = 0 ; // without static keyword this program output 1 1 1
	                         // with static keyword this program output is 1 2 3
	       
    public CounterStatic() {
		 counter++;
		System.out.println(counter);
		 
	}
    
    public static void main(String[] args) {
		CounterStatic c = new CounterStatic();
		CounterStatic c1 = new CounterStatic();
		CounterStatic c2 = new CounterStatic();
	}

}
