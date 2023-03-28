package com.arraydemo;

import java.util.Scanner;

public class AlternateNumber 
{
	static Scanner sc = new Scanner(System.in);

	
	public static void enterArray(int arr[])
	{
		System.out.println(" Enter elements of array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
	}
	
	public static void showAlternate(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			if(i%2==0)
			{
				System.out.print(arr[i]+" ");
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
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		
		int ar[] = new int[size];
		enterArray(ar);
		
		printArray(ar);
		System.out.println("----------/////////---------------");
		System.out.println("Showing alternate:");
		showAlternate(ar);		

	}

}
