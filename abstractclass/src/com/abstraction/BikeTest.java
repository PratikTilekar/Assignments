package com.abstraction;

abstract class Bike
{
	Bike()
	{
		System.out.println(" Bike is done with the modification ");
	}
	
	abstract void run();
	
	void changeGear()
	{
		System.out.println(" Gear is changed ");
	}
	
}

class Suzuki extends Bike
{
	void run()
	{
		System.out.println(" Running at speed 80kmph and performance is good ");
	}
}

public class BikeTest {

	public static void main(String[] args) 
	{
		Bike b;
		b = new Suzuki();
		b.changeGear();
		b.run();
	

	}

}
