package com.abstractionPractice;

abstract class Bike
{
	abstract void run(); 
}

class Honda extends Bike
{

	void run() 
	{
		System.out.println("Running honda bike");
		
	}
	
}

class Suzuki extends Bike
{
	void run()
	{
		System.out.println("Runnung suzuki bike ");
	}
}

public class BikeTest {

	public static void main(String[] args) 
	{
		Bike b;
		b = new Honda();
		b.run();
		System.out.println("-----------------/////////////-------------");
		b = new Suzuki();
		b.run();
		

	}

}
