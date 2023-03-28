package com.arrayDemo2;

import java.util.Scanner;

public class Sorting 
{
	static Scanner sc = new Scanner(System.in);
	
	public static void sorting(int ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				int temp=0;
				if(ar[i]>ar[j])
				{
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
	}
	
	public static void printArray(int ar[])
	{
		for(int i:ar)
		{
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) 
	{
		System.out.println(" Enter size of array ");
		int size = sc.nextInt();
		
		int a[] = new int[size];
		
		System.out.println(" Enter array elements ");
		for(int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println(" Before sorting ");
		printArray(a);
		
		System.out.println("--------------///////////----------------");
		
		sorting(a);
		System.out.println(" After sorting ");
		printArray(a);
	
		

	}

}
