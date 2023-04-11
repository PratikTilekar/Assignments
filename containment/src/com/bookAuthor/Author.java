package com.bookAuthor;

public class Author 
{
	private int id;
	private String name;
	private int age;
	
	Author()
	{
		
	}
	
	Author(int id,String name,int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
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
	
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int age)
	{
		this.age=age;
	}
	
	public String toString()
	{
		return "Author id :" + id + " " + "Author name :" + name + " " + "Author age :" + age + " ";
	}

}
