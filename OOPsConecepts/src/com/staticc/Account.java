package com.staticc;

public class Account 
{
	private int accNo;
	private String name;
	private float balance;
	
	static String bankName = "ICICI Bank";  //// static key word
	public static float iRate = 3.5f;
	
	public static void changeInterestRate(float newRate)
	{
		iRate = newRate;  //// static method
	}
	
	
	public Account() 
	{
		
	}
	
	public Account(int a,String n,float b)
	{
		accNo = a; name = n; balance = b;
	}
	
	void showDetails()
	{
		System.out.println("Customer name :" + name);
		System.out.println(" Account no :" + accNo + " linked with bank :" + Account.bankName);
		System.out.println(" Account balance :" + balance);
		System.out.println(" Interest rate is :" + iRate);
	}

}
