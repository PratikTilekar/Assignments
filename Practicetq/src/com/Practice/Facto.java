package com.Practice;

public class Facto {

	public static void main(String[] args) 
	{
		int num = 5;
		int i, fact = 1;
		
		for( i=1;i<=num;i++)
		{
			fact *=i;
		}
		System.out.println(" factorial of " + num + " is : " + fact);

	}

}
