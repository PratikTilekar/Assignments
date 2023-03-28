package com.bankCustomer;

public class Customer 
{
	private int accountNo;
	private String name;
	private float balance;
	
	Customer()
	{
		
	}
	
	Customer(int accountNo,String name,float balance)
	{
		this.accountNo=accountNo;
		this.name=name;
		this.balance=balance;
	}
	
	public int getAccountNo()
	{
		return accountNo;
	}
	
	public void setAccountNo(int accountNo)
	{
		this.accountNo=accountNo;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public float getBalance()
	{
		return balance;
	}
	
	public void setBalance(float balance)
	{
		this.balance=balance;
	}
	
	public String toString()
	{
		return "Account number : " + accountNo + " " + "Name : " + name + " " + "Balance : " + balance + " ";
	}

	
}
