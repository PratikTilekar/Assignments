package com.loosecoupling;

interface Drawable 
{
	void draw();
}

class Circle implements Drawable
{
	public void draw()
	{
		System.out.println("Drawing circle....");
	}
}

class Square implements Drawable
{
	public void draw()
	{
		System.out.println("Drawing square....");
	}
}
public class DrawTest {

	public static void main(String[] args) 
	{
		Drawable d = new Circle();
		d.draw();
		
		d = new Square();
		d.draw();

	}

}
