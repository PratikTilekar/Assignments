package com.daimond;

interface Student 
{
	void show();
	
	default void display()
	{
		System.out.println(" I am a student");
	}
	
}

interface Teacher
{
	void show();
	
	default void display()
	{
		System.out.println(" I am a teacher ");
	}

}

public class DaimondDemo implements Student,Teacher 
{
	public void display()
	{
		Student.super.display();
		Teacher.super.display();
	}
	
	public void show()
	{
		System.out.println("I am in a daimond problem ");
	}
	
	

	public static void main(String[] args) 
	{
		DaimondDemo d = new DaimondDemo();
		d.show();
		d.display();
		

	}

}
