package com.hierarchy;

public class Student 
{
	private int id; 
	private String name;
	private float marks;
	private float fees;
	
	public Student() 
	{
		
	}

	Student(int id,String name,float marks,float fees)
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
		this.fees=fees;
	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setMarks(float marks)
	{
		this.marks=marks;
	}
	
	public float getMarks()
	{
		return marks;
	}
	
	public void setFees(float fees)
	{
		this.fees=fees;
	}
	
	public float getFees()
	{
		return fees;
	}
	
	public String toString()
	{
		return " id : " + id + " " + " name : " + name + " " + " marks : " + marks + " " + " fees : " + fees + " ";
	}
}
