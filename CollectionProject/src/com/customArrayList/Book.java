package com.customArrayList;

public class Book implements Comparable<Book>
{
	private int id;
	private String name;
	private float price;
	
	Book()
	{
		
	}
	
	Book(int id,String name,float price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}

	public float getPrice() 
	{
		return price;
	}

	public void setPrice(float price) 
	{
		this.price = price;
	}


	public String toString() 
	{
		return "Book [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Book b) 
	{
		if(this.price == b.price )
		return 0;
		
		if(this.price>b.price)
		return 1;
		
		else
		return-1;	
	
	}
	
	

}
