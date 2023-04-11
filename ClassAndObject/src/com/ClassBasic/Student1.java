package com.ClassBasic;

public class Student1 
{
	String name;
	int age;
	float marks;
	char grade;
	
	void enterDetails(String n,int a,float m, char g)
	{
		
		name=n;
		age = a;
		marks = m;
		grade = g;
	}
	
	void showDetails()
	{
		System.out.println(" student name is "+name);
		System.out.println("student age is "+age);
		System.out.println(" student marks are "+marks);
		if(grade=='f')
			System.out.println(" FAIL");
		else
			System.out.println(" student grade is "+grade);
		
	}
	
	void calculateGrade()
	{
		
		if(marks>=80)
			grade = 'A';
		  else if(marks>=60)
			  grade = 'B';
		    else if(marks>=40)
			    grade = 'C';
		else
			grade = 'F';
	}
	public static void main(String []args)
	{
		Student1 s1 = new Student1();
		s1.enterDetails("pratik", 22, 86,' ');
		s1.showDetails();
		s1.calculateGrade();
	}

}
