package com.abstraction;

abstract class Loan
{
	abstract int getRateOfInterest();
	
}

class GoldLoan extends Loan
{
	int getRateOfInterest()
	{
		return 8;
	}
}

class HomeLoan extends Loan
{
	int getRateOfInterest()
	{
		return 10;
	}
}

public class LoanTest {

	public static void main(String[] args) 
	{
		GoldLoan g = new GoldLoan();
		g.getRateOfInterest();
		System.out.println(" Gold loan Rate of interest is : " + g.getRateOfInterest() + "%");
		
		System.out.println("---------///////------------");
		
		HomeLoan h = new HomeLoan();
		h.getRateOfInterest();
		System.out.println("Home loan Rate of interest is : " + h.getRateOfInterest() + " % ");

	}

}
