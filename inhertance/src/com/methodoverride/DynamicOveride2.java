package com.methodoverride;

class Shape
{
	void draw()
	{
		System.out.println(" Drawing ");
	}
}

class Rectangle extends Shape
{
	void draw()
	{
		System.out.println(" Drawing rectangle ");
	}
}

class Circle extends Shape
{
	void draw()
	{
		System.out.println(" Drawing circle ");
	}
}

class Square extends Shape
{
	void draw()
	{
		System.out.println(" Drawing square ");
	}
}
public class DynamicOveride2 {

	public static void main(String[] args) 
	{
		Shape s;
		s = new Rectangle();
		s.draw();
		
		s = new Circle();
		s.draw();
		
		s = new Square();
		s.draw();

	}

}
