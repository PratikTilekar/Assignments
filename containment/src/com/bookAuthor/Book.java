package com.bookAuthor;

public class Book 
{
	private String bname;
	private float price;
	private Author author;
	
	Book()
	{
		
	}
	
	Book(String bname,float price,Author author)
	{
		this.bname=bname;
		this.price=price;
		this.author=author;
	}
	
	public String getBname()
	{
		return bname;
	}
	
	public void setBname(String bname)
	{
		this.bname=bname;
	}
	
	public float getPrice()
	{
		return price;
	}
	
	public void setPrice(float price)
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
		return "Book name:" + bname + " " + "Book price :" + price + " " + "Author :" + author + " ";
	}

}
