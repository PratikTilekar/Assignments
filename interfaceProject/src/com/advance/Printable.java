package com.advance;

public interface Printable 
{
	float pi = 3.147f;
	
	void area();
	
	default void displayVolume()
	{
		System.out.println(" Volume method ");
		
	}
	
	static void show()
	{
		System.out.println(" Geometry shape interface ");
	}
	
	private void display()
	{
		System.out.println(" made by : pratik ");
	}

}
