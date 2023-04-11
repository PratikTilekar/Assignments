package com.Practice;

import java.util.Scanner;

public class FactorialDemo {

	public static void main(String[] args) 
	{
		int i,fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num = sc.nextInt();
		
		for(i=1;i<=num;i++)
		{
			fact = fact*i;
		}
		System.out.println(" factorial of " + num + " is : " + fact);

	}

}
