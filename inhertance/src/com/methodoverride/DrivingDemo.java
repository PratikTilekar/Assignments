package com.methodoverride;

class Drive
{
	void drive()
	{
		System.out.println(" I am driving ");
	}
}

class Bike extends Drive
{
	void drive()
	{
		System.out.println(" I am driving bike ");
	}
}

class Car extends Drive
{
	void drive()
	{
		System.out.println(" I am driving a Car ");
	}
}
public class DrivingDemo {

	public static void main(String[] args) 
	{
		Drive d;
		d = new Bike();
		d.drive();
		
		d = new Car();
		d.drive();

	}

}
