package com.Practice;

import java.util.Scanner;

public class NumberPattern4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter rows ");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++)
			
			//for space
		{
			for(int j=1;j<=(n-i);j++)
			{
				System.out.print(" ");
			}
			// for number
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
