package com.customException;

class Account
{
	private int id;
	private int accNo;
	private float balance;
	
	Account()
	{
		
	}
	
	Account(int id,int accNo,float balance)
	{
		this.id=id;
		this.accNo=accNo;
		this.balance=balance;
	}

	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public int getAccNo() 
	{
		return accNo;
	}

	public void setAccNo(int accNo) 
	{
		this.accNo = accNo;
	}

	public float getBalance() 
	{
		return balance;
	}

	public void setBalance(float balance) 
	{
		this.balance = balance;
	}
	
	void deposit(float amount)
	{
		this.balance = balance + amount;
		System.out.println("Amount deposited :" + amount);
		System.out.println("Current balance is :" + this.balance);
	}
	
	void Withdraw(float amount) 
	{
		if(this.balance-amount<0)
	    try
		{
			throw new InsufficiantBalanceException("Cant withdraw balance is low");
		}
		catch(InsufficiantBalanceException e)
		{
			System.out.println(e);
		}
		else
		{
			this.balance = balance-amount;
			System.out.println("Amount withdrawn :" + amount);
			System.out.println("Current balance " + this.balance);
		}
	}

	@Override
	public String toString() 
	{
		return "Account [id=" + id + ", accNo=" + accNo + ", balance=" + balance + "]";
	}
	
	
}

public class AccountTest {

	public static void main(String[] args) 
	{
		Account a = new Account();
		a.setId(101);
		a.setAccNo(112233);
		a.setBalance(1000f);
		
		a.deposit(500f);
		
		a.Withdraw(2500);
		
		a.Withdraw(1000);
		
	}

}
