package com.hierarchy;

public class CollegeStudent extends Student
{
	private String course;
	private int sem;
	
	public CollegeStudent() 
	{
	
	}
	
	CollegeStudent(int id,String name,float marks,float fees,String course,int sem)
	{
		super(id,name,marks,fees);
		this.course=course;
		this.sem=sem;
	}
	
	public void setCourse(String course)
	{
		this.course=course;
	}
	
	public String getCourse()
	{
		return course;
	}
	
	public void setSem(int sem)
	{
		this.sem=sem;
	}

	public int getSem()
	{
		return sem;
	}
	
	public String toString()
	{
		return super.toString() + " Course : " + course + " " + " Sem : " + sem + " ";
	}
}
