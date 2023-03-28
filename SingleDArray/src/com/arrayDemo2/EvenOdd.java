package com.arrayDemo2;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter size of array ");
		int size = sc.nextInt();
		
		int ar[] = new int[size];
		
		System.out.println("Enter array elements");
		
		for(int i=0;i<ar.length;i++)
		{
			ar[i] = sc.nextInt();
		}
		
		System.out.println("Even numbers are ");
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%2==0)
				System.out.println(ar[i] + " ");
		}
		
		System.out.println("Odd numbers are");
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%2!=0)
				System.out.println(ar[i] + " ");
		}
		
				
	

	}

}
