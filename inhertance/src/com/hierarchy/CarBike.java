package com.hierarchy;

 class Vehicle
{
	double basePrice = 10000;
	
	public void showPrice()
	{
		System.out.println(" The price of vehicle is : Rs." + basePrice);
	}

}

class TwoWheeler extends Vehicle
{
	double increasePriceBy = 0.20;
	
	void finalPrice()
	{
		basePrice = basePrice + (basePrice * increasePriceBy);
		System.out.println(" After modification thr price of bike is : Rs." + basePrice);
	}
	
}

class FourWheeler extends Vehicle
{
	double increasePriceBy = 1;
	
	void finalPrice()
	{
		basePrice = basePrice+(basePrice*increasePriceBy);
		System.out.println(" After modification the price of car is : Rs." + basePrice);
	}
}

public class CarBike
{
	public static void main(String [] args)
	{
		TwoWheeler bike = new TwoWheeler();
		FourWheeler car = new FourWheeler();
		
		bike.showPrice();
		bike.finalPrice();
		
		System.out.println("-----------------///////////-----------------");
		
		car.showPrice();
		car.finalPrice();
	}
	
}