package com.overloading;

public class MethodOverloading 
{
	void area(int side)
	{
		System.out.println(" Area of square is :" + (side*side));
	}
	
	void area(int lenth , int breadth)
	{
		System.out.println(" Area of rectangle is : "+(lenth*breadth));
	}
	
	void area(float radius)
	{
		System.out.println(" Area of circle is :"+3.147*(radius*radius));
	}
	
	
	
	
	
	
	
}