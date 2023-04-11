package com.ClassBasic;

public class Student 
{
	String studentName;
	int age;
	int Class;
	char div;
	
	void acceptDetails(String s,int a,int C,char d)
	{
		studentName = s;
		age = a;
		Class = C;
		div = d;
	}
	
	void showDetails()
	{
		System.out.println(" student name is "+ studentName);
		System.out.println("student age is "+ age);
		System.out.println("student Class is "+ Class);
		System.out.println(" student divison is " + div);
	}
	
	public static void main(String []args)
	{
		Student s1 = new Student();
		s1.acceptDetails(" pratik ", 24, 12, 'b');
		s1.showDetails();
		
		Student s2 = new Student();
		s2.acceptDetails(" mayur ", 29, 12, 'c');
		s2.showDetails();
	}

}
