package com.carDriver;

public class Driver 
{
	private int id,age;
	private String name;
	
	Driver()
	{
		
	}
	
	Driver(int id,int age,String name)
	{
		this.id = id;
		this.age = age;
		this.name = name;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String toString()
	{
		return " id : " + id + " " + " age : " + age + " " + " name : " + name + " "; 
	}

}
