package com.customArrayListDemo;

public class Order implements Comparable<Order>
{
	private int id;
	private String name;
	private float price;
	
	Order()
	{
		
	}
	
	Order(int id,String name,float price)
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
		this.id = id;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
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
		return "Order [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Order o) 
	{
		if(this.price==o.getPrice())
		return this.name.compareTo(o.getName());
		
		else
			if(this.price>o.getPrice())
				return 1;
		
			else
				return -1;
				
		
		
	}
	
	
	
	

}
