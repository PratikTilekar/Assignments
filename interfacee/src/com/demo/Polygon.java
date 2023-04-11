package com.demo;

public interface Polygon 
{
	void getArea();

}

class Rectangle implements Polygon
{
	public void getArea()
	{
		int length = 6;
		int breadth = 5;
		
		int area = length*breadth;
		System.out.println("Area of rectangle is : " + area);
		
	}
}

class Square implements Polygon
{
	public void getArea()
	{
		int length = 5;
		
		int area = length*length;
		System.out.println("Area of Square is : " + area);
		
	}

}


