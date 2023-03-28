package com.arrayDemo2;

import java.util.Scanner;

public class ArrayPassing2 
{
	public static void change(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = arr[i] + arr[i];
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int ar[]=new int[5];
		
		System.out.println(" Enter array elements ");
		for(int i=0;i<ar.length;i++)
		{
			ar[i] = sc.nextInt();
		}
				
		change(ar);
		{
			for(int i=0;i<ar.length;i++)
			{
				ar[i] = ar[i] + ar[i];
			}
			
			for(int i=0;i<ar.length;i++)
			{
				System.out.print(ar[i] + " ");
			}
			System.out.println();
		}

	}

}
