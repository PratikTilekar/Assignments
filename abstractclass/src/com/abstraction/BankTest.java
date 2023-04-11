package com.abstraction;

abstract class Bank
{
	abstract int getRateOfInterest();
}

class ICICI extends Bank
{
	int getRateOfInterest()
	{
		return 5;
	}
}

class AXIS extends Bank
{
	int getRateOfInterest()
	{
		return 7;
	}
}

public class BankTest {

	public static void main(String[] args) 
	{
		Bank b;
		b = new ICICI();
		System.out.println(" Rate of interest is : " + b.getRateOfInterest() + " % " );
		
		System.out.println("-------------//////////////----------------------");
		
		b = new AXIS();
		System.out.println(" Rate of interest is : " + b.getRateOfInterest() + " % ");

	}

}
