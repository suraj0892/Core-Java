package com.coreJavaExample.package2;

import com.coreJavaExample.package1.Group;

public class InterfaceExample implements Group{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
		System.out.println("Hello" + a);
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("World");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("school interface");
	}

	
	
}
