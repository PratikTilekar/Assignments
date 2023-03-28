package com.arraydemo;

public class Sorting 
{
	public static void sorting(int ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				int temp=0;
				if(ar[i]>ar[j])
				{
					temp = ar[i];
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
		int arr[] = {4,2,6,9,7,10,12,55,89,77,45,14};
		System.out.println(" Before sorting ");
		printArray(arr);
		
		
		System.out.println("--------------------/////////////////------------------");
		
		sorting(arr);
		System.out.println("After sorting");
		printArray(arr);
		
		

	}

}
