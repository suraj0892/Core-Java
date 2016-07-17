package com.coreJavaExample.Inheritance;

public class derived2  extends absractClss{

	int a = 99;
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.a =1235;
		System.out.println("inisde derived 2"+super.a + " " + this.a);
	}
	
	

}
