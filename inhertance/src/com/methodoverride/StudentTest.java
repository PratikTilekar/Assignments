package com.methodoverride;

public class StudentTest {

	public static void main(String[] args) 
	{
		SchoolStudent s1 = new SchoolStudent(111," Pratik" , 85.06f, 10000f, " Sadhna", 9);
		CollegeStudent c1 = new CollegeStudent(101," Mohan ", 88f, 20000f, " bsc ", 2);
		
		System.out.println(s1);	
		System.out.println("--------///////-------------");
		System.out.println(c1);

	}

}
