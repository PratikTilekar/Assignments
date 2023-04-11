package com.studenCousre;

public class Student 
{
	private int id;
	private String name;
	private int age;
	private Course course;
	
	Student()
	{
		
	}
	
	Student(int id , String name , int age , Course course)
	{
		this.id = id;
		this.name = name;
		this.age = age;
		this.course = course;
	}
	
	Student(int id , String name , int age)
	{
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void setCourse(Course course)
	{
		this.course = course;
	}
	
	public Course getCourse()
	{
		return course;
	}
	
	public String toString()
	{
		return "id : " + id + " " + " name : " + name + " " + " age :" + age + " " + "course :" + course + " ";
	}
	
	

}
