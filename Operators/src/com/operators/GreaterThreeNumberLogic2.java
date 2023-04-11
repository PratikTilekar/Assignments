package com.operators;

public class GreaterThreeNumberLogic2 {

	public static void main(String[] args) 
	{
		int a = 48;
		int b = 67;
		int c = 73;
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("a is greatest");
			}
			else
			{
				System.out.println("c is greatest");
			}
			
		}
		else
		{
			if(b>c)
			{
				System.out.println("b is greatest");
			}
			else
			{
				System.out.println("c is greatest");
			}
		}
		
	}

}
