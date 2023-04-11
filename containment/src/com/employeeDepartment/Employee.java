package com.employeeDepartment;

public class Employee 
{
	private int id;
	private String name;
	private float salary;
	private Department department;
	
	Employee()
	{
		
	}
	
	Employee(int id,String name,float salary,Department department)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
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
		return name;
	}
	
	public void setSalary(float salary)
	{
		this.salary = salary;
	}
	
	public float getSalary()
	{
		return salary;
	}
	
	public void setDepartmet(Department department)
	{
		this.department = department;
	}
	
	public Department getDepartment()
	{
		return department;
	}
	
	public String toString()
	{
		return " id : " + id + " " + " name : " + name + " " + " salary : " + salary + " " + " department : " + department + " "; 
	}
	

}
