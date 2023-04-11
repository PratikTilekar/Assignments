package com.advance;

public class Cube implements Printable 
{
	
	int side;
	
	Cube()
	{
		
	}
	
	Cube(int side)
	{
		this.side=side;
	}
	
	public void area() 
	{
		System.out.println(" Area of cube is : " + (6*side*side));
		
	}

	public static void main(String[] args) 
	{
		Printable.show();
		
		Printable p;
		p=new Cube(6);
		p.area();
		p.displayVolume();
		

	}

	
}
