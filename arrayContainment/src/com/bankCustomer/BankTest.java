package com.bankCustomer;

import java.util.Scanner;

public class BankTest 
{

	static Scanner sc = new Scanner(System.in);

	public static void enterDetails(Bank b)
	{
		System.out.println("Enter bank name : ");
		b.setBankName(sc.next());
		
		System.out.println("Enter branch : ");
		b.setBranch(sc.next());
		
		b.setCustomer(new Customer());
		
		System.out.println("Enter customer acoount number : ");
		b.getCustomer().setAccountNo(sc.nextInt());
		
		System.out.println("Enter customer name : ");
		b.getCustomer().setName(sc.next());
		
		System.out.println("Enter customer balance : ");
		b.getCustomer().setBalance(sc.nextFloat());
		
		
	}
	
	public static void printDetails(Bank b[])
	{
		for(Bank b1:b)
		{
			System.out.println(b1);
		}
	
	}
	
	public static void sortAccordingBankName(Bank b[])
	{
		Bank temp;
		
		for(int i=0;i<b.length;i++)
		{
			for(int j=i+1;j<b.length;j++)
			{
				if(b[i].getCustomer().getBalance() > b[j].getCustomer().getBalance())
				{
					temp=b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
		}
	}
		
	

	public static void main(String[] args) 
	{
		System.out.println("Enter array size : ");
		int size = sc.nextInt();
		
		Bank b1[] = new Bank[size];
		
		for(int i=0;i<b1.length;i++)
		{
			b1[i] = new Bank();
			enterDetails(b1[i]);
		}
		
		sortAccordingBankName(b1);
		System.out.println("After sorting acc to balance : ");
		printDetails(b1);
		
	}
}
