package com.arrayDemo3;

import java.util.Scanner;

public class PrimeNumber 
{
	static Scanner sc = new Scanner(System.in);
	
	public static void enterArrayElements(int arr[])
	{
		System.out.println("Enter array elements :");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
	}
	
	public static void checkPrime(int num)
	{
		boolean status=true;
		if(num==0||num==1)
		status=false;
		
		else
		{
			for(int i=2;i<=num/2;i++)
			{
				if(num%i==0)
				status=false;
			}
		}
		if(status)
		{
			System.out.println(num);
		}
			
	}
	
	public static void checkArrayPrime(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			checkPrime(arr[i]);
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
		System.out.println("Enter array size : ");
		int size = sc.nextInt();
		
		int ar[] = new int[size];
		
		enterArrayElements(ar);
		printArray(ar);
		System.out.println("===========PRIME NUMBER FROM ARRAY ARE=========");
		checkArrayPrime(ar);
		
		

	}

}
