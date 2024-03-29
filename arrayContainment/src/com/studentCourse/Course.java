package com.studentCourse;

public class Course 
{
	private int cid;
	private String cname;
	private double fees;
	
	Course()
	{
		
	}
	
	Course(int cid,String cname,double fees)
	{
		this.cid=cid;
		this.cname=cname;
		this.fees=fees;
	}
	
	public int getCid()
	{
		return cid;
	}
	
	public void setCid(int cid)
	{
		this.cid=cid;
	}
	
	public String getCname()
	{
		return cname;
	}
	
	public void setCname(String cname)
	{
		this.cname=cname;
	}
	
	public double getFees()
	{
		return fees;
	}
	
	public void setFees(double fees)
	{
		this.fees=fees;
	}
	
	public String toString()
	{
		return "Course id : " + cid + " " + "Course name : " + cname + " " + " fees : " + fees + " ";
	}

}
