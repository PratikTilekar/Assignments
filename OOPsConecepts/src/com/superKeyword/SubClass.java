package com.superKeyword;

class SuperClass
{
	int i;
	
	SuperClass(int j)
	{
		System.out.println("Super class constructor");
	}
	
	void superClassMethod()
	{
		System.out.println("Method from superclass");
	}
}

public class SubClass extends SuperClass
{
	SubClass()
	{
		super(10);
	}
	
	void subClassMethod()
	{
		System.out.println(super.i);
		super.superClassMethod();
		System.out.println("Sub class method");
	}

}
