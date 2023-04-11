package com.Practice;

import java.util.Scanner;

public class Disscount {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" total bill ");
		long bill = sc.nextLong();
		
		if (bill>=2000)
			System.out.println(" congrats you got 20% disscount");
		   
		    else if(bill>=1000)
		    	System.out.println(" congrats you got 10% disscount");
		
		else
			System.out.println(" congrats you got 5% disscount");
	

	}

}
