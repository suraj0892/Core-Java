package com.coreJavaExample.Inheritance;

public class Cat extends Animal{

	String color;
	String food;
	int voice;

	Cat(String color,String food,String isVertebrate,String type,int noLegs){
		super(isVertebrate,noLegs,type);
		this.color = color;
		this.food =food;
		
	}
	
	public void display(){
		super.voice =65321;
		super.display();
		this.voice = 1;
		System.out.println("num of voice for cat is "+ this.voice);
	}

	@Override
	public String toString() {
		return "Cat [color=" + color + ", food=" + food + super.toString() + "]";
	}
	
	
}
