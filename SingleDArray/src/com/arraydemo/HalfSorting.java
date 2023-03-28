package com.arraydemo;

import java.util.Scanner;

public class HalfSorting 
{
	static int i,j,temp;
	static Scanner sc = new Scanner(System.in);
	
	public static void enterArray(int arr[])
	{
		System.out.println("Enter array elements");
		for(i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
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
	
	public static void sortHalfArray(int arr[])
	{
		for(i=0;i<arr.length/2;i++)
		{
			for(j=i+1;j<arr.length/2;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
							
				}
			}
		}
		for(i=arr.length/2;i<arr.length;i++)
		{
			for(j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
							
				}
			}
		}
	}

	public static void main(String[] args) 
	{
		System.out.println("Enter size of array : ");
		int size = sc.nextInt();
		int ar[] = new int[size];
		
		enterArray(ar);
		System.out.println("Before sorting :");
		printArray(ar);
		
		System.out.println("===============================");
		sortHalfArray(ar);
		System.out.println("After sorting :");
		printArray(ar);
		
		

	}

}
