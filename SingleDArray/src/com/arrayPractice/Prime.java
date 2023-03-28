package com.arrayPractice;

import java.util.Scanner;

public class Prime 
{
	
	static Scanner sc = new Scanner(System.in);
	
	public static void checkPrime(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			boolean isPrime = true;
			for(int j=2;j<arr[i];j++)
			{
				if(arr[i]%j==0)
				{
					isPrime=false;
					break;
				}
			}
			if(isPrime)
			{
				System.out.println(arr[i]);
			}
		}
		
	}
	
	public static void printArray(int arr[])
	{
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) 
	{
		int ar[] = new int[5];
		
		System.out.println("Enter array elements");
		for(int i=0;i<ar.length;i++)
		{
			ar[i] = sc.nextInt();
		}
		
		System.out.println("Prime numbers from the array are :");
		checkPrime(ar);

	}

}
