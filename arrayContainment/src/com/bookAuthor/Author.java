package com.bookAuthor;

public class Author 
{
	private int authorId;
	private String aname;
	private int age;
	
	Author()
	{
		
	}
	
	Author(int authorId,String aname,int age)
	{
		this.authorId = authorId;
		this.aname= aname;
		this.age = age;
	}
	
	public void setAuthorId(int authorId)
	{
		this.authorId = authorId;
	}
	
	public int getAuthorId()
	{
		return authorId;
	}
	
	public void setAname(String aname)
	{
		this.aname = aname;
	}
	
	public String getAname()
	{
		return aname;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	public int getAge()
	{
		return age;
	}

	public String toString()
	{
		return "authorId :" + authorId + " " + " aname :" + aname + " " + " age : " + age + " "; 
	}
  
  
	  
  
	
		
	
	

}
