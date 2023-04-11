package com.studenCousre;

public class Course 
{
	private int id;
	private String name;
	private float fees;
	
	Course()
	{
		
	}

	Course(int id, String name, float fees )
	{
		this.id = id;
		this.name = name;
		this.fees = fees;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name = name;
	}
	
	public void setFees(float fees)
	{
		this.fees = fees;
	}
	
	public float getFees()
	{
		return fees;
	}
	
	public String toString()
	{
		return " id : " + id + " " + " name : " + name + " " + " fees : " + fees + " ";
	}
}
