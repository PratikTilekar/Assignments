package com.stringPractice;

import java.util.Scanner;

public class nextCharacter 
{
	static Scanner sc = new Scanner(System.in);
	
	public static void nextChar(String st)
	{
		char ch[] = st.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			ch[i]++;
		}
		System.out.println(ch);
	}

	public static void main(String[] args) 
	{
		System.out.println("Enter First String : ");
		String s1 = sc.next();
		
		System.out.println("Enter second String : ");
		String s2 = sc.next();
		
		nextChar(s1);
		
		System.out.println("============================");
		
		nextChar(s2);
		

	}

}
