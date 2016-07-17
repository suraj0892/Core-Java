package com.pkg1;

public class recursion {

	public int factorial(int n){
		
		int returnVal;
		
		if(n==0){
			return 1;
		}
		else{
			
			returnVal = factorial(n-1)*n;
			
		}
		
		
		return returnVal;
	}
	
	public static void main(String[] args) {
	
	recursion r = new recursion();
	int result = r.factorial(5);
	System.out.println("Factorial is : "+result);
	}
}
