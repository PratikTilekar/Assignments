package com.stringLogical;

import java.util.Scanner;

public class Anagram 
{
	static Scanner sc = new Scanner(System.in);
	
	public static void SortArray(char ch[])
	{
		char temp;
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]>ch[j])
				{
					temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
	}
	
	public static void checkAnagram(String st1,String st2)
	{
		boolean status = true;
		
		st1 = st1.toLowerCase();
		st2 = st2.toLowerCase();
		
		if(st1.length()==st2.length())
		{
			char ch1[] = st1.toCharArray();
			char ch2[] = st2.toCharArray();
			
			SortArray(ch1);
			SortArray(ch2);
			
			System.out.println(ch1);
			System.out.println(ch2);
			
			if(checkEqual(ch1, ch2))
			{
				status=true;
				System.out.println("The String are anagram");
			}
			
		}
		if(!status)
		{
			System.out.println("The Strings are anagram");
		}
	}
	
	public static boolean checkEqual(char ch1[],char ch2[])
	{
		boolean status=true;
		for(int i=0;i<ch1.length;i++)
		{
			if(ch1[i]!=ch2[i])
			{
				status=false;
				break;
			}
		}
		return status;
	}

	public static void main(String[] args) 
	{
		System.out.println("Enter the firts String : ");
		String s1 = sc.next();
		
		System.out.println("Enter the second String : ");
		String s2 = sc.next();
		
		checkAnagram(s1, s2);
		

	}

}
