package com.Practice;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows ");
		int n = sc.nextInt();
		int i;
		int j;
		
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=(n-i);j++)
			{
				System.out.print(" ");
			}
			
			for (j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	}

