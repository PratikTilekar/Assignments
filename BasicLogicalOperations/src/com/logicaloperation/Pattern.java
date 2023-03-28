package com.logicaloperation;


public class Pattern {

	public static void main(String[] args) 
	{ 
		int n = 5;
		int i,j;
		for(i=(n-1);i>=0;i--)
		{
			char ch = 'E';
			for(j=0;j<=i;j++)
			{
				System.out.print(ch + " ");
				ch--;
			}
			System.out.println();
		}
		
		

	}

}
