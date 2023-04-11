package com.HashMap;

public class Author 
{
	private int aid;
	private String name;
	
	Author()
	{
		
	}
	
	Author(int id,String name)
	{
		this.aid=aid;
		this.name=name;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Author [aid=" + aid + ", name=" + name + "]";
	}
	
	

}
