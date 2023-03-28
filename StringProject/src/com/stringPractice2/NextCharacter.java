package com.stringPractice2;

import java.util.Scanner;

public class NextCharacter 
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
		System.out.println("Enter a string : ");
		String s1 = sc.next();
		nextChar(s1);
		

	}

}
