package com.coreJavaExample.Inheritance;

public class abstractClassDemo {

	public static void main(String[] args) {
	
	 // absractClss ab = new absractClss(); not possible
		
		abstractClassDerived ab = new abstractClassDerived();
		
		ab.a =100;
		
		ab.display();
		
		ab.print();
		
		derived2 d = new derived2();
		
		d.print();
	}
}
