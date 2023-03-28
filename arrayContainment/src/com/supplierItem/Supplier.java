package com.supplierItem;

import java.util.Arrays;

public class Supplier 
{
	private int sid;
	private String sname;
	private int phno;
	private Item item[];
	
	Supplier()
	{
		
	}
	
	Supplier(int sid,String sname,int phno,Item item[])
	{
		this.sid=sid;
		this.sname=sname;
		this.phno=phno;
		this.item=item;
	}
	
	public int getSid()
	{
		return sid;
	}
	
	public void setSid(int sid)
	{
		this.sid=sid;
	}
	
	public String getSname()
	{
		return sname;
	}
	
	public void setSname(String sname)
	{
		this.sname=sname;
	}
	
	public int getPhno()
	{
		return phno;
	}
	
	public void setPhno(int phno)
	{
		this.phno=phno;
	}
	
	public Item[] getItem()
	{
		return item;
	}
	
	public void setItem(Item[] item)
	{
		this.item=item;
	}
	
	public String toString()
	{
		return  "supplier id : " + sid + " " + "Supplier name : " + sname + " " + "phone number : " + phno + " " + Arrays.toString(item) + " ";
	}


}
