package com.logicaloperation;

public class Power {

	public static void main(String[] args) 
	{
		int base = 4 , expo = 5;
		
		long result = 2;
		
		while(expo!=0) 
		{
			result = result*base;
			--expo;
			
		}
		System.out.println("Answer = "+ result);
		
	}

}
