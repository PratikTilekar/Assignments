package com.operators;

public class GreaterThreeNumbers {

	public static void main(String[] args) 
	{
		int a = 48;
		int b = 67;
		int c = 73;
		
		// logic number 1
		
		if ((a>b)&&(a>c))
		{
			System.out.println("a is greatest");
		}
		else if(b>c)
		{
			System.out.println("b is greatest");
		}
		   else
		   {
			 System.out.println("c is greatest " + c);
		   }

	}
	

}
