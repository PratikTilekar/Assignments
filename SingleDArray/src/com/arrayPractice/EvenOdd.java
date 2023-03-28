package com.arrayPractice;

import java.util.Scanner;

public class EvenOdd 
{
	static Scanner sc = new Scanner(System.in);
	
	public static void displayEvenOdd(int arr[])
	{
		System.out.println(" Enter array elements ");
		int i;
		for(i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
			
			if(arr[i]%2==0)
			{
				System.out.println(" Even number " + arr[i] + " ");
			}
			
			if(arr[i]%2!=0)
			{
				System.out.println("Odd numbers : " + arr[i] + " ");
			}
		}
	}

	public static void main(String[] args) 
	{
	 System.out.println("Enter size of array");
	 int size = sc.nextInt();
	 
	 int ar[] = new int[size];
	 
	 displayEvenOdd(ar);
	 System.out.println(ar);
	 
	

	}

}
