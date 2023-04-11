package com.demo;

interface Drawable
{
	void draw();
}

class Recta implements Drawable
{
	public void draw()
	{
		System.out.println(" Drawing rectangle ");
	}
}

class Circle implements Drawable
{

	public void draw() 
	{
		System.out.println(" Drawing circle ");
	}
	
}

public class InterfaceTest {

	public static void main(String[] args) 
	{
		Drawable d;
		d = new Circle();
		d.draw();
		
		d = new Recta();
		d.draw();
			
	}

}
