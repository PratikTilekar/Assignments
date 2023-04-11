package com.carDriver;

public class Car 
{
	private String name;
	private int year;  //// Manufacturing year
	private Driver driver;
	
	Car()
	{
		
	}
	
	Car(String name,int year,Driver driver)
	{
		this.name = name;
		this.year = year;
		this.driver = driver;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public int getYear() 
	{
		return year;
	}

	public void setYear(int year) 
	{
		this.year = year;
	}
	
	public Driver getDriver()
	{
		return driver;
	}
	
	public void setDriver(Driver driver)
	{
		this.driver = driver;
	}
	
	public String toString()
	{
 		return " name : " + name + " " + " year : " + year + " " + " driver " + driver + " ";
	}
	
	
	
	

}
