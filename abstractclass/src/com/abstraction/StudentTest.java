package com.abstraction;

abstract class Student
{
	Student()
	{
		System.out.println(" Student is getting ready for the exam ");
	}
	
	abstract void paper();
	
	void exam()
	{
		System.out.println(" Exam was ok ok  ");
	}
}

class Exam extends Student
{
	void paper()
	{
		System.out.println(" I am writting my test paper ");
	}
}
public class StudentTest {

	public static void main(String[] args) 
	{
		Student s;
		s = new Exam();
		s.paper();
		s.exam();
	

	}

}
