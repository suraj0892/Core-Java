package com.coreJavaExample.controlStmts;

import java.util.Scanner;

//example to demostrate Switch Case statement
public class switchCaseExample {

	

	public static void main(String[] args) {
	
		//declare variables
		int choice,a,b;
		//Scanner class is used get input from user
		Scanner in = new Scanner(System.in);
		System.out.println("Enter choice 1 for add 2 for subract");
		choice = in.nextInt();
		System.out.println("Enter a value");
		a = in.nextInt();
		System.out.println("Enter b value");
		b= in.nextInt();
	switch(choice){
	
	case 1:
		System.out.println("addition of two number : " + (a+b));
		break;
	case 2:
		System.out.println("multiplication of two numbers"+ (a*b));
		break;
	default:
		System.out.println("Enter correct choice");
		}
	}
}
