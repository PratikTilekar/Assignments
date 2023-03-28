package com.arraydemo;

import java.util.Scanner;

public class PrimeNumber 
{
	static Scanner sc = new Scanner(System.in);
	
	public static void checkPrime(int num)
	{
		boolean isPrime = true;
		if(num==0||num==1)
			isPrime = false;
		else
		{
			for(int i=2;i<=num/2;i++)
			{
				if(num%i==0) 
				{
					isPrime = false;
				
				break;
				}
			}

		}
		if(isPrime)
		{
			System.out.println(num);
		}
			
		
	}
	
	public static void printArray(int arr[])
	{
		for(int i:arr)
		{
			System.out.print(i +" ");
		}
		System.out.println();
	}

	public static void checkArrayPrime(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			checkPrime(arr[i]);
		}
	}
	public static void main(String[] args) 
	{
		System.out.println(" Enter size of array");
		int size = sc.nextInt();
		
		int ar[] = new int[size];
		
		System.out.println("Enter array elements");
		for(int i=0;i<ar.length;i++)
		{
			ar[i] = sc.nextInt();
		}
		
		printArray(ar);
		System.out.println("---------------/////////---------------");
		
		System.out.println("Prime numbers from array are : ");
		checkArrayPrime(ar);
		
		

	}

}
