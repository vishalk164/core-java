package com.serializableExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


public class Dpersist {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("Output.txt"));
		
		Employee e =(Employee) in.readObject();
		Employee e1 =(Employee) in.readObject();
		
		System.out.println(e.id+" "+e.name+" "+e.address);
		System.out.println(e1.id+" "+e1.name+" "+e1.address);
		
		in.close();
		
		
	}

}
