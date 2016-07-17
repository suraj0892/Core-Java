package com.pkg1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class collDemo {

	
	public static void main(String[] args) {

		List<Student> arrList =  new ArrayList<Student>();
		
		Student s1 = new Student();
		s1.setId(1000);
		s1.setName("Suraj");
		
		Student s2 = new Student();
		s2.setId(1001);
		s2.setName("SurajKrish");
		
		Student s3 = new Student();
		s3.setId(1001);
		s3.setName("SurajKrish");
		
		arrList.add(s1);
		arrList.add(s2);
		
		Collections.sort(list);
		System.out.println(arrList);
		
		if(arrList.contains(s3)){
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}

	}
}
