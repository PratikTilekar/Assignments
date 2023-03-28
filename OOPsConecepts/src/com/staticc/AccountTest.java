package com.staticc;

public class AccountTest {

	public static void main(String[] args) 
	{
		Account a1 = new Account(121224," Pratik ",13000.00f);
		Account a2 = new Account(124512," Mayur ",2000.00f);
		
		Account.changeInterestRate(4.6f);
		
		a1.showDetails();
		System.out.println("---------//////---------");
		a2.showDetails();

	}

}
