package com.bookAuthor;

public class Book 
{
	private int id;
	private String bname;
	private int price;
	private Author author;
	
	Book()
	{
		
	}

	Book(int id , String bname , int price , Author author)
	{
		this.id = id;
		this.bname = bname;
		this.price = price;
		this.author = author;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public String getBName()
	{
		return bname;
	}
	
	public void setBName(String bname)
	{
		this.bname=bname;
	}
	
	public int getPrice()
	{
		return price;
	}
	
	public void setPrice(int price)
	{
		this.price=price;
	}
	
	public Author getAuthor()
	{
		return author;
	}
	
	public void setAuthor(Author author)
	{
		this.author=author;
	}
	
	public String toString()
	{
		return " Book id : " + id + " " + " book name : " + bname + " " + " Price : " + price + " " + " Author : " + author + " ";
	}
}
