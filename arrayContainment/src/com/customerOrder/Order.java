package com.customerOrder;

public class Order 
{
	private int id;
	private String type;
	private int qty;
	
	Order()
	{
		
	}
	
	Order(int id,String type,int qty)
	{
		this.id=id;
		this.type=type;
		this.qty=qty;
	}

	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public String getType() 
	{
		return type;
	}

	public void setType(String type) 
	{
		this.type = type;
	}

	public int getQty() 
	{
		return qty;
	}

	public void setQty(int qty) 
	{
		this.qty = qty;
	}


	public String toString() 
	{
		return "Order [id=" + id + ", type=" + type + ", qty=" + qty + "]";
	}
	
	


}
