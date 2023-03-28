package com.arrayDemo3;

import java.util.Arrays;

public class SeprateEvenOdd 
{
	public static void SeprateEO(int arr[])
	{
		int left=0;
		int right = arr.length-1;
		
		while(left<right)
		{
			while(arr[left]%2==0 && left<right)
			left++;
			while(arr[right]%2!=0 && left<right)
			right--;
			
			if(left<right)
			{
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				
			}
				
			
		}
	}

	public static void main(String[] args) 
	{
		int ar[] = {4,5,6,8,7,3,2,10};
		
		System.out.println(Arrays.toString(ar));
		SeprateEO(ar);
		System.out.println(Arrays.toString(ar));
	

	}

}
