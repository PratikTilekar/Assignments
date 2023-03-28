package com.encapsulation;

public class Book 
{
	private int bookId;
	private String bookName;
	private String author;
	private Float price;
	
	public void setBookId(int bookId)
	{
		this.bookId = bookId;
	}
	
	public int getBookId()
	{
		return bookId;
	}
	
	public void setBookName(String bookName)
	{
		this.bookName = bookName;
	}
	
	public String getBookName()
	{
		return bookName;
	}
	
	public void setAuthor(String author)
	{
		this.author = author;
	}
	
	public String getAuthor()
	{
		return author;
	}
	
	public void setPrice(Float price)
	{
		this.price = price;
	}
	
	public Float getPrice()
	{
		return price;
	}
	
	public String toString()
	{
		return " bookId :" + bookId + "  "+ "BookName : " + bookName + " "+" Author :"+ author + " "+ " Price: "+ price + " ";
		
	}

}
