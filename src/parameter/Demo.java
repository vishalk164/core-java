package parameter;

public class Demo {
	Demo() {
		System.out.println("Default const");
		
	}
Demo(int i ){
	System.out.println("Single parameter const");
	System.out.println(i);
}
Demo(int i, String s,float f, char c){
	System.out.println("Multiple parameter const");
	System.out.println(i+s+f+c);
	System.out.println(s);
	System.out.println(f);
	System.out.println(c);
}
public static void main(String[] args) {
	Demo d = new Demo();
	Demo d1 = new Demo(10);
	Demo d2 = new Demo(232,"Gaurav",123.45f,'c');
	
    
}
}
