package com.hierarchy;

public class SchoolStudent extends Student 
{
	private String schoolName;
	private int std;
	
	public SchoolStudent() 
	{
		
	}
	
	SchoolStudent(int id, String name , float marks , float fees,String schoolName,int std)
	{
		super(id,name,marks,fees);
		this.schoolName=schoolName;
		this.std=std;
		
	}
	
	public void setSchoolName(String schoolName)
	{
		this.schoolName=schoolName;
	}
	
	public String getSchoolName()
	{
		return schoolName;
	}
	
	public void setStd(int std)
	{
		this.std=std;
	}
	
	public int getStd()
	{
		return std;
	}
	
	public String toString()
	{
		return super.toString() + " schoolname : " + schoolName + " " + " Std : " + std + " ";
	}

}
