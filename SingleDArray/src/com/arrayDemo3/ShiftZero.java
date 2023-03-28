package com.arrayDemo3;

import java.util.Arrays;

public class ShiftZero 
{
	public static void Sort(int ar[])
	{
		int temp;
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
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
		int arr[] = {5,0,10,8,0,6,7,0,1};
		
		printArray(arr);
		Sort(arr);
		System.out.println("=========AFTER SORTING=======");
		printArray(arr);
		
		

	}

}
