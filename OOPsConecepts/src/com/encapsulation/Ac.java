package com.encapsulation;

public class Ac 
{
	private String brand;
	private String colour;
	private int price;
	
	public void setBrand(String brand)
	{
		this.brand = brand;
	}
	
	public String getBrand()
	{
		return brand;
	}
	
	public void setColour(String colour)
	{
		this.colour = colour;
	}
	
	public String getColour()
	{
		return colour;
	}
	
	public void setPrice(int price)
	{
		this.price = price;
	}
	
	public int getPrice()
	{
		return price;
	}
	
	public String toString()
	{
		return " brand : " + brand + " price : "+price + "colour :"+colour;
	}

}
