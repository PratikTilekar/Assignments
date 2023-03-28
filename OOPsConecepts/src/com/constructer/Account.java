package com.constructer;

public class Account 
{
	private int id;
	private String name;
	private float balance;
	private String bankName;

	Account()
	{
		
	}
	
	Account(int id,String name,float balance,String bankName)
	{
		this.id = id;
		this.name = name;
		this .balance = balance;
		this.bankName = bankName;
	}
	
	public int getId()
	{
		return id;
		
	}
	public String getName()
	{
		return name;
	}
	
	public float getBalance()
	{
		return balance;
	}
	
	public String getBankName()
	{
		return bankName;
	}
public String toString()
{
	return "id : " + id +" " + " name : " + name + " " + " balance :" + balance + " " + " bankName :" + bankName + " ";
	}
}
