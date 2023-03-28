package com.student;

import java.util.Scanner;

public class StudentTest 
{
	static Scanner sc = new Scanner(System.in);
	
	public static void enterDetails(Student s)
	{
		System.out.println("Enter student id :");
		s.setId(sc.nextInt());
		
		System.out.println("Enter Student name :");
		s.setName(sc.next());
		
		float m[] = new float[3];
		
		System.out.println("Enter marks of 3 subject :");
		
		for(int i=0;i<m.length;i++)
		{
			m[i] = sc.nextFloat();
		}
		
		s.setMarks(m);
	}

	public static void main(String[] args) 
	{
		Student std[] = new Student[3];
		
		for(int i=0;i<std.length;i++)
		{
			std [i] = new Student();
			enterDetails(std[i]);
		}
		
		for(Student s:std)
		{
			System.out.println(s);
		}
		
		
	/*	float m1[] = {40,55,60};
		std[0] = new Student(101,"Pratik",m1);
		
		float m2[] = {50,35,44};
		std[1] = new Student(102,"Mayur",m2);
		
		float m3[] = {42,55,60};
		std[2] = new Student(103,"Chanda",m3);
		
		for(Student s:std)
		{
			System.out.println(s);
		}*/
		

	}

}
