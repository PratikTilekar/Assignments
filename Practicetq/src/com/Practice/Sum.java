package com.Practice;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num = sc.nextInt();
		int i;
		int sum = 0;
		
		for(i=1;i<=num;i++)
		{
			sum = sum + i;
		}
		System.out.println(sum);
		

	}

}
