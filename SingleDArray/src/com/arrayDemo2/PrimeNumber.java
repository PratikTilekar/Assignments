package com.arrayDemo2;

import java.util.Scanner;

public class PrimeNumber 
{
	static Scanner sc = new Scanner(System.in);
	static int i ;
	
	public static void printArray(int arr[])
	{
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	public static void checkPrime(int num)
	{
		boolean status=true;
		if((num==0)||(num==1))
			status=false;
		else
		{
			for( i=2;i<num/2;i++)
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
		for(i=0;i<arr.length;i++)
		{
			checkPrime(i);
		}
	}

	public static void main(String[] args) 
	{
		System.out.println(" Enter size of array ");
		int size = sc.nextInt();
		
		int ar[] = new int[size];
		System.out.println("Enter array elements");
		for(i=0;i<ar.length;i++)
		{
			ar[i] = sc.nextInt();
		}
	
		printArray(ar);
		
		System.out.println("----------////////////---------------");
		System.out.println("Prime numbers from the array are :");
		checkArrayPrime(ar);
		

	}

}
