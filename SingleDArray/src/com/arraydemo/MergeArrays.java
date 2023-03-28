package com.arraydemo;

import java.util.Arrays;

public class MergeArrays 
{
	public static void mergeArray(int ar1[],int ar2[])
	{
		int size1 = ar1.length;
		int size2 = ar2.length;
		
		int mar[] = new int[size1];
		
		int k=0;
		int i;
		int j;
		for( i=0;i<size1;i=i+2)
		{
			mar[k]=ar1[i];
			k=k+2;
		}
		System.out.println(Arrays.toString(mar));
		
		
		
	}

	public static void main(String[] args) 
	{
		int arr1[] = {40,50,60};
		int arr2[] = {10,20,30};
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));

	}

}
