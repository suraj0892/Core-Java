package com.pkg1;

public class Stud {

	int roll;
	String name;
	int m1,m2;
	int total;
	
	public Stud calcTotal(Stud s1){
		
		s1.total = s1.m1 + s1.m2;
		
		return s1;
		
	}

	@Override
	public String toString() {
		return "Stud [roll=" + roll + ", name=" + name + ", m1=" + m1 + ", m2="
				+ m2 + ", total=" + total + "]";
	}


	
}
