package com.book;

public class Book 
{
	private int id;
	private int price;
	private String name;
	
	Book()
	{
		
	}
	
	Book(int id,int price,String name)
	{
		this.id=id;
		this.price=price;
		this.name=name;
		
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	public int getPrice()
	{
		return price;
	}
	
	public void setPrice(int price)
	{
		this.price=price;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String toString()
	{
		return " Book id : " + id + " " + " Price : " + price + " " + "Name : " + name + " ";
	}
	

}
