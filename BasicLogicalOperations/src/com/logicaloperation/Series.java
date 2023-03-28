package com.logicaloperation;

import java.util.Scanner;

public class Series {
	
	public static void displaySeries()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter number till you want series ");
		int n = sc.nextInt();
		
		int i,series;
		
		for(i=1;i<=n;i++)
		{
			series = i*i-1;
			System.out.println(i + "*" + i + "-1" + "=" + series);
		}
		
	}

	public static void main(String[] args) 
	{
		displaySeries();
		
}
}