package com.supplierItem;

public class Item 
{
	private int id;
	private String name;
	private float unitPrice;
	private int qty;
	
	Item()
	{
		
	}
	
	Item(int id,String name,float unitPrice,int qty)
	{
		this.id=id;
		this.name=name;
		this.unitPrice=unitPrice;
		this.qty=qty;
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
	
	public float getUnitPrice()
	{
		return unitPrice;
	}
	
	public void setUnitPrice(float unitPrice)
	{
		this.unitPrice=unitPrice;
	}
	
	public int getQty()
	{
		return qty;
	}
	
	public void setQty(int qty)
	{
		this.qty=qty;
	}
	
	public String toString()
	{
		return "Item id : " + id + " " + "item name : " + name + " " + "Unit price : " + unitPrice + " " + " Quantity : " + qty + " ";
	}

}
