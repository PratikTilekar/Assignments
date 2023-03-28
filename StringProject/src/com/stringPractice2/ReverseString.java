package com.stringPractice2;

import java.util.Scanner;

public class ReverseString 
{
	static Scanner sc = new Scanner(System.in);
	
	public static void reverseString(String str)
	{
		char ch[] = str.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
	
	}
	

	public static void main(String[] args) 
	{
		System.out.println("Enter a String :");
		String s1 = sc.next();
		
		reverseString(s1);

	}

}
