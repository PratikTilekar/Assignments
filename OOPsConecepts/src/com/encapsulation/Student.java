package com.encapsulation;

public class Student 
{
	private int id;
	private String name;
	private int age;
	private float marks;
	
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
	
	public void setAge(int age)
	{
		this.age=age;
	}
	
	public int getAge()
	{
		return age;
	}
	
	static void incrMarks(Student s)
	{
		if(s.getMarks()<50)
		{
			s.setMarks(s.getMarks()+5);
		}
		
	}
	

}
