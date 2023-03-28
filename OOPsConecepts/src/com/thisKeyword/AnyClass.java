package com.thisKeyword;

public class AnyClass 
{
	int i;
	
	AnyClass()
	{
		System.out.println("Default constructor");
	}
	
	AnyClass(int j)
	{
		this();// constructor
		System.out.println("second constructor");
	}
	
	void methodOne()
	{
		System.out.println("Method one");
	}
	
	void methodTwo()
	{
		System.out.println(this.i); // variable
		this.methodOne();// method 
	}

}
