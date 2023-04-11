package com.hierarchy;

public class Phone 
{
	private int id;
	private long num;
	private int bill;
	
	Phone()
	{
		
	}
	
	Phone(int id,long num , int bill)
	{
		this.id= id;
		this.num=num;
		this.bill=bill;
	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setNum(long num)
	{
		this.num=num;
	}
	
	public long getNum()
	{
		return num;
	}
	
	public void setBill(int bill)
	{
		this.bill=bill;
	}
	
	public int getBill()
	{
		return bill;
	}
	
	public String toString()
	{
		return " Id : " + id + " " + " Phone number : " + num + " " + " bill : " + bill + " ";
	}
			

}
