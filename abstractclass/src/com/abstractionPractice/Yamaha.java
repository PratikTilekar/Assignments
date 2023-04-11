package com.abstractionPractice;

abstract class Bikee
{
	void run()
	{
		System.out.println("Running at speed 50");
	}
}

public class Yamaha extends Bikee
{
	void run()
	{
		System.out.println("Running safely");
	}

	public static void main(String[] args) 
	{
		Bikee b = new Yamaha();
		b.run();
				
		

	}

}
