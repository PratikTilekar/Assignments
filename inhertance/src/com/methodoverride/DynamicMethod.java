package com.methodoverride;

class Person
{
	public void display()
	{
		System.out.println(" I am a person ");
	}
}

class Actor extends Person
{
	public void display()
	{
		System.out.println(" I am a Actor ");
	}
}

class Politician extends Person
{
	public void display()
	{
		System.out.println(" I am a politician ");
	}
}

public class DynamicMethod {

	public static void main(String[] args) 
	{  
		Person p;
		p = new Actor();
		p.display();
		
		p = new Politician();
		p.display();

	}

}
