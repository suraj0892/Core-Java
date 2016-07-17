package com.pkg1;

public class AccessCtrl {

	
	private int a;
	public int b;
	
	AccessCtrl(){
		
		this.a = 100;
		this.b= 200;
	}
	
	
	
	public int getA() {
		return a;
	}



	public void setA(int a) {
		this.a = a;
	}



	public int getB() {
		return b;
	}



	public void setB(int b) {
		this.b = b;
	}



	@Override
	public String toString() {
		return "AccessCtrl [a=" + a + ", b=" + b + "]";
	}
	
	
	
}
