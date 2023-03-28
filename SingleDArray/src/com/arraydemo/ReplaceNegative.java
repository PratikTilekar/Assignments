package com.arraydemo;

import java.util.Scanner;

public class ReplaceNegative 
{
	static Scanner sc = new Scanner(System.in);
	
	public static void enterArray(int arr[])
	{
		System.out.println("Enter array elements :");
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
	}
	
	public static void replaceNegative(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
			{
				arr[i]=0;
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
		System.out.println("Enter array size");
		int size = sc.nextInt();
		int ar[] = new int[size];
		
		enterArray(ar);
		System.out.println("Before replacing :");
		printArray(ar);
		
		System.out.println("=====================");
		replaceNegative(ar);
		System.out.println("After replacing :");
		printArray(ar);

	}

}
