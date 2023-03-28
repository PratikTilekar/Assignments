package com.studentCourse;

public class Student 
{
	private int sid;
	private String name;
	private float marks;
	private Course course;
	
	Student()
	{
		
	}
	
	Student(int sid,String name,float marks,Course course)
	{
		this.sid=sid;
		this.name=name;
		this.course=course;
		this.marks=marks;
	}
	
	public float getMarks()
	{
		return marks;
	}
	
	public void setMarks(float marks)
	{
		this.marks=marks;
	}
	
	public int getSid()
	{
		return sid;
	}
	
	public void setSid(int sid)
	{
		this.sid=sid;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public Course getCourse()
	{
		return course;
	}
	
	public void setCourse(Course course)
	{
		this.course=course;
	}
	
	public String toString()
	{
		return "Student id : " + sid + " " + "Student name : " + name + " " + "Marks : " + marks + " " + " Course : " + course + " ";
	}
	

}
