package com.advance;

public class Square implements Printable

{
	int side;
	
	Square()
	{
		
	}
	
	Square(int side)
	{
		this.side=side;
	}
	
	public void area()
	{
		System.out.println("Area of square is : " + (side*side));
	}

	public static void main(String[] args) 
	{
		Printable.show();
		
		Printable p;
		p = new Square(6);
		p.area();		
        p.displayVolume();
        
	}

}
