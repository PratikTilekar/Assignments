package com.customerOrder;

import java.util.Arrays;

public class Customer 
{
	private String name;
	private Order order[];
	
	Customer()
	{
		
	}
	
	Customer(String name,Order order[])
	{
		this.name=name;
		this.order=order;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public Order[] getOrder() 
	{
		return order;
	}

	public void setOrder(Order[] order) 
	{
		this.order = order;
	}

	public String toString() 
	{
		return "Customer [name=" + name + ", order=" + Arrays.toString(order) + "]";
	}
	
	

}
