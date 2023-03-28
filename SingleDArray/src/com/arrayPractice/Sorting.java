package com.arrayPractice;

public class Sorting {

	public static void main(String[] args) 
	{
		int arr[] = {10,-9,44,88,4,6,-78,7,2,12};
		System.out.print(" After sorting : " );
		
		// Sorting logic 
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				int temp = 0;
				if(arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.print(arr[i] + " ");
		}
	

	}

}
