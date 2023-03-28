package com.EmployeeDepartment;

public class Employee 
{
	private int eid;
	private String name;
	private float salary;
	private Department dep;
	
	public Employee() 
	{
		
	}
	
	Employee(int eid,String name,float salary,Department dep)
	{
		this.eid=eid;
		this.name=name;
		this.salary=salary;
		this.dep=dep;
	}
	
	public int getEid()
	{
		return eid;
	}
	
	public void setEid(int eid)
	{
		this.eid=eid;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public float getSalary()
	{
		return salary;
	}
	
	public void setSalary(float salary)
	{
		this.salary=salary;
	}
	
	public Department getDep()
	{
		return dep;
	}
	
	public void setDep(Department dep)
	{
		this.dep=dep;
	}
	
	public String toString()
	{
		return " Employee id : " + eid + " " + " Employee name : " + name + " " + " Emp salary : " + salary + " " + " Department : " + dep + " ";
	}

}
