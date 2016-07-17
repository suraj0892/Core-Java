package com.pkg1;

class OutDemo{
	
	public void displayOut(){
		System.out.println("Inside Outer class");
		
	}
	
	
	class InnerDemo{
		
		public void displayInner(){
			System.out.println("Inside Inner class");
			displayOut();
		}
		
	}
}




public class InnerDemoClass {


	public static void main(String[] args) {
	
		OutDemo OD = new OutDemo();
		
		OutDemo.InnerDemo ID = OD.new InnerDemo();
		
		ID.displayInner();
		
		
		//OD.displayOut();
	}
}
