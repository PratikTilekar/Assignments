package com.basics;

public class Car {
	int price;
	String model;
	int year;
	String colour;
	
	void entercarDetails(int p,String m,int y,String c)
	{
		price =p;
		model=m;
		year=y;
		colour=c;
	}
	void displayCar()
	{
		System.out.println("Price"+price);
		System.out.println("Model"+model);
		System.out.println("Year"+year);
		System.out.println("Colour"+ colour);
	}
	
	
	
	
	
	
	
	
	

}
