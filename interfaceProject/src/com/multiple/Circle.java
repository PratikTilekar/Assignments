package com.multiple;

public class Circle implements Printable,Showable
{
	public void calcArea()
	{
		int radius = 5;
		
		int area = radius*radius;
		System.out.println("circle radius is : " + radius);
		
	}
	public void show() 
	{
		System.out.println("Drawing a circle");
		
	}
	

	public static void main(String[] args) 
	{
		Circle c = new Circle();
		c.show();
		c.calcArea();
		
		System.out.println("-----------------");
		
		Printable p = new Circle();
		p.show();
		
		
		System.out.println("-----------------");
		Showable s = new Circle();
		s.show();

	}

	

}
