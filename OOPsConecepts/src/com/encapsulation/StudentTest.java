package com.encapsulation;

import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) 	
	{
		Student s1 = new Student();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter id ");
		s1.setId(sc.nextInt());
		
		System.out.println(" Enter name ");
		s1.setName(sc.next());
		
		System.out.println(" Enter age ");
		s1.setAge(sc.nextInt());
		
		System.out.println(" Enter marks ");
		s1.setMarks(sc.nextFloat());
		
		
		
		System.out.println(s1.getName()+" "+s1.getMarks());
		

	}

}
