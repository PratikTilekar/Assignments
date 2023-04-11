package com.studenCousre;

public class School {

	public static void main(String[] args) 
	{
		Course c1 = new Course(101," JAVA ",30000.00f);
		Course c2 = new Course(102," DOT NET " , 20000.00f);
		
		Student s1 = new Student(1," Pratik ", 24 , new Course(101," JAVA ",4500.0f));
		
		System.out.println(s1);
		
		Student s2 = new Student(2," mayur",28);
		System.out.println(s2);
		
		s2.setCourse(c2);
		
		System.out.println(s2);

	}

}
