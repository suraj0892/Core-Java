package com.coreJavaExample.Inheritance;

public class Animal {

	private String isVertrbrate;
	private int noLegs;
	private String type;
	int voice;
	

	Animal(String isVer,int noLegs,String type){
		this.isVertrbrate = isVer;
		this.noLegs = noLegs;
		this.type = type;
	}

	public void display(){
		//this.voice = 123;
		System.out.println("Voice of an animal is " + this.voice);
	}
	@Override
	public String toString() {
		return "Animal [isVertrbrate=" + isVertrbrate + ", noLegs=" + noLegs
				+ ", type=" + type + "]";
	}
	
}
