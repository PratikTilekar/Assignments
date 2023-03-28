package com.constructer;

public class Supplier 
{
	private int supplyId;
	private String name;
	private String location;
	private String type;
	
	 Supplier()
	{
		
		
	}
	 Supplier(int supplyId,String name,String type)
	{
		this.supplyId = supplyId;
		this.name = name;
		this.type = type;
	}
	
	 Supplier(int supplyId,String name,String location,String type)
	{
		this.supplyId = supplyId;
		this.name = name;
		this.location = location;
		this.type = type;
	}
	
	public String toString()
	{
		return  " supplyId :" + supplyId + " " + "name :" + name + " "+ "location : "+ location + " "+" type :"+ type +" ";
	}
	
	public static void main(String [] args)
	{
		
		
		System.out.println(new Supplier(113," barfi"," pune ", "sweet dish").toString());
		
	}

}
