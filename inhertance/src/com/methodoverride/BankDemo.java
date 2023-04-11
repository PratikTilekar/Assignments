package com.methodoverride;

class Bank
{
	int balance = 100;
	
	public void display()
	{
		System.out.println(balance);
	}
	
}

class SavingAccount extends Bank
{
	public void display()
	{
	    double r = balance*0.3;
	    System.out.println("your balance is :" + (r+balance));
	    
	}
}

class CurrentAccount extends Bank
{
	public void display()
	{
		double r = balance*0.5;
		System.out.println("your balance is :" + (r+balance));
	}
}

public class BankDemo {

	public static void main(String[] args) 
	{
		Bank b;
		b = new SavingAccount();
		b.display();
		
		b= new CurrentAccount();
		b.display();
		
		

	}

}
