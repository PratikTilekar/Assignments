package com.arrayDemo2;

import java.util.Scanner;

public class AlternateNum 
{
	static Scanner sc = new Scanner(System.in);
	static int i;
	
	public static void enterArray(int arr[])
	{
		System.out.println("Enter array elements :");
		
		for(i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
	}
	
	public static void alternateNum(int arr[])
	{
		for(i=0;i<arr.length;i++)
		{
			if(i%2==0)
			{
				System.out.print(arr[i]+ " ");
			}
		}
		System.out.println();
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
		System.out.println("Enter array size");
		int size = sc.nextInt();
		int ar[] = new int[size];
		
		enterArray(ar);
		System.out.println("Before");
		printArray(ar);
		
		System.out.println("======================");
		
		System.out.println("After");
		alternateNum(ar);
		
	

	}

}
