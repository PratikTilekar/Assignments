package com.arraydemo;

import java.util.Scanner;

public class MinumumOfArray {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size of array ");
		int size = sc.nextInt();
		
	    int a[] = new int[size];
	    
	    System.out.println("Enter array elements ");
	    for(int i=0;i<a.length;i++)
	    {
	    	a[i] = sc.nextInt();
	    }
	    
	    int minimum = a[0];
	    
	    for(int i=0;i<a.length;i++)
	    {
	    	if(a[i]< minimum)
	    	      minimum = a[i];
	    		
	    }
	    
	    System.out.println("Minimum value of array is : " + minimum);
	

	}

}
