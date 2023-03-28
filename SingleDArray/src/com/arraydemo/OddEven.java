package com.arraydemo;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter array size : ");
		int size = sc.nextInt();
		
		int ar[] = new int[size];
		
		System.out.println(" Enter array elements : ");
		for(int i=0;i<ar.length;i++)
		{
			ar[i] = sc.nextInt();
		}
		
		System.out.println("odd elements from array : ");
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%2!=0)
				System.out.println(ar[i] + " ");
		}
		
		System.out.println(" Even number from array are : ");
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%2==0)
				System.out.println(ar[i] + " ");
		}

	}

}
