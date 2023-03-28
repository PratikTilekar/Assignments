package com.arraydemo;

import java.util.Scanner;

public class Alternate 
{
	static int i;
	static Scanner sc = new Scanner(System.in);
	
	public static void showAlternate(int arr[])
	{
		int addVal=1;
		for(i=0;i<(arr.length-addVal);i++)
		{
			arr[i] = arr[i]+arr[i+1];
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
		
		System.out.println(" Enter array elements ");
		{
			for(i=0;i<ar.length;i++)
			{
				ar[i] = sc.nextInt();
			}
		}
		
		System.out.println(" Before ");
		printArray(ar);
		
		
		showAlternate(ar);
		System.out.println("After");
		printArray(ar);
				
		
		

	}

}
