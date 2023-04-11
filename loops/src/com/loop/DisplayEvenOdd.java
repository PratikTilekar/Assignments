package com.loop;

public class DisplayEvenOdd {

	public static void main(String[] args) 
	{
		int number = 229;
		System.out.println(" List of even numbers from 121 to"+number+ ":");
	    for (int i = 1; i<=number;i++)
		{
	    	if (i%2==0)
	    	{
	    		System.out.println(i + " ");
	    	}
		}

	}

}
