package com.studentCourse;

import java.util.Scanner;

public class StudentCourse 
{
	static Scanner sc = new Scanner(System.in);
	
	public static void enterStudentDetail(Student s)
	{
		System.out.println("Enter student id : ");
		s.setSid(sc.nextInt());
		
		System.out.println("Enter student name : ");
		s.setName(sc.next());
		
		System.out.println("Enter student marks : ");
		s.setMarks(sc.nextFloat());
		
		s.setCourse(new Course());
		
		System.out.println("Enter course id : ");
		s.getCourse().setCid(sc.nextInt());
		
		System.out.println("Enter course name : ");
		s.getCourse().setCname(sc.next());
		
		System.out.println("Enter course fees : ");
		s.getCourse().setFees(sc.nextDouble());
	}
	
	public static void printDetail(Student s[])
	{
		for(Student std:s)
		{
			System.out.println(std);
		}
		System.out.println();
	}
	
	public static void sortMarks(Student s[])
	{
		Student temp;
		for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i].getMarks()<s[j].getMarks())
				{
					temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
	  
	}
	
	

	public static void main(String[] args) 
	{
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		
		Student s1[] = new Student[size];
		
		for(int i=0;i<s1.length;i++)
		{
			s1[i] = new Student();
			enterStudentDetail(s1[i]);
		}
		
		printDetail(s1);
		
		System.out.println("After sorting...................................");
		sortMarks(s1);
		printDetail(s1);
		

	}

}
