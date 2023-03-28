package com.bankCustomer;

public class Bank 
{
	private String bankName;
	private String branch;
	private Customer customer;
	
	Bank()
	{
		
	}
	
	Bank(String bankName,String branch,Customer customer)
	{
		this.bankName=bankName;
		this.branch=branch;
		this.customer=customer;
	}
	
	public String getBankName()
	{
		return bankName;
	}
	
	public void setBankName(String bankName)
	{
		this.bankName=bankName;
	}
	
	public String getBranch()
	{
		return branch;
	}
	
	public void setBranch(String branch)
	{
		this.branch=branch;
	}
	
	public Customer getCustomer()
	{
		return customer;
	}
	
	public void setCustomer(Customer customer)
	{
		this.customer=customer;
	}
	
	public String toString()
	{
		return "Bank name : " + bankName + " " + "Branch : " + branch + " " + "Customer : " + customer + " ";
	}
	

}
