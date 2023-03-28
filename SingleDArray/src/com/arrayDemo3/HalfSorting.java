package com.arrayDemo3;

import java.util.Scanner;

public class HalfSorting 
{
	static Scanner sc = new Scanner(System.in);
	static int i,j,temp;
	
	public static void enterArray(int ar[])
	{
		System.out.println("Enter array elements : ");
		for(i=0;i<ar.length;i++)
		{
			ar[i] = sc.nextInt();
		}
	}
	
	public static void halfSorting(int ar[])
	{
		for(i=0;i<ar.length/2;i++)
		{
			for(j=i+1;j<ar.length;j++)
			{
				if(ar[i]>ar[j])
				{
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
			
	}
		for(i=ar.length/2;i<ar.length;i++)
		{
			for(j=i+1;j<ar.length;j++)
			{
				if(ar[i]<ar[j])
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
			System.out.print(i+" ");
		}
		System.out.println();

	}

	public static void main(String[] args) 
	{
		System.out.println("Enter array size :");
		int size = sc.nextInt();
		int a[] = new int[size];
		
		enterArray(a);
		System.out.println("Before sorting :");
		printArray(a);
		
		System.out.println("==============================");
		halfSorting(a);
		System.out.println("After sorting :");
		printArray(a);

	}

}
