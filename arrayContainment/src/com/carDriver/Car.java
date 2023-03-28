package com.carDriver;

import java.util.Arrays;

public class Car 
{
	private int cid;
	private String cname;
	private int price;
	private Driver driver[];
	
	Car()
	{
		
	}
	
	Car(int cid,String cname,int price,Driver driver[])
	{
		this.cid=cid;
		this.cname=cname;
		this.price=price;
		this.driver=driver;
	}
	
	public int getCid()
	{
		return cid;
	}
	
	public void setCid(int cid)
	{
		this.cid=cid;
	}
	
	public String getCname()
	{
		return cname;
	}
	
	public void setCname(String cname)
	{
		this.cname=cname;
	}
	
	public int getPrice()
	{
		return price;
	}
	
	public void setPrice(int price)
	{
		this.price=price;
	}
	
	public Driver[] getDriver()
	{
		return driver;
	}
	
	public void setDriver(Driver[] driver)
	{
		this.driver=driver;
	}
	
	public String toString()
	{
		return "Car id : " + cid + " " + "Car name : " + cname + " " + "Car price : " + price + " " + Arrays.toString(driver) + " ";
	}

}
