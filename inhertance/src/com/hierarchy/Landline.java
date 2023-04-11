package com.hierarchy;

public class Landline extends Phone 
{
	private String conn;
	private int area;
	
	Landline()
	{
		
	}
	
	Landline(int id,long num,int bill,String conn,int area)
	{
		super(id,num,bill);
		this.conn=conn;
		this.area=area;
	}
	
	

}
