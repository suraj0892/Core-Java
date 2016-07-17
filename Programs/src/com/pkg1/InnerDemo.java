package com.pkg1;

class OutClass{
	
	int a;
	
	
	public void display(){
		
		System.out.println("Inside OutClass");

	}
	
	
	class InnerClass{
		
		int b;
		
		
		public void displayInner(){
			System.out.println("Inside Inner class");
		display();
		}
	}

	
	
}



public class InnerDemo {

	
	public static void main(String[] args) {
	
	OutClass oC = new OutClass();
	
	OutClass.InnerClass iC = oC.new InnerClass();
	
	iC.displayInner();

	
	}
	
	
}
