package com.containment;

public class Book 
{
	private int id;
	private int price;
	private Author author;
	
	Book()
	{
		
	}
	
	Book(int id,int price,Author author)
	{
		this.id=id;
		this.price=price;
		this.author=author;
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
	
}
