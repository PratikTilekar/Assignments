package com.stringPractice2;

import java.util.Scanner;

public class Anagram 
{
	static Scanner sc = new Scanner(System.in);
	static int i,j;
	
	public static void sortArray(char ch[])
	{
		char temp;
		
		for(i=0;i<ch.length;i++)
		{
			for(j=i+1;j<ch.length;j++)
			{
				if(ch[i]>ch[j])
				{
					temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
	}
	
	public static boolean checkEqual(char ch1[],char ch2[])
	{
		boolean status=true;
		for(i=0;i<ch1.length;i++)
		{
			if(ch1[i]!=ch2[i])
			{
				status=false;
				break;
			}
		}
		
		return status;
	}
	
	public static void checkAnagram(String st1,String st2)
	{
		boolean status=false;
		
		st1=st1.toLowerCase();
		st2=st2.toLowerCase();
		
		if(st1.length() == st2.length())
		{
			char ch1[] = st1.toCharArray();
			char ch2[] = st2.toCharArray();
			
			sortArray(ch1);
			sortArray(ch2);
			
			if(checkEqual(ch1, ch2))
			{
				status=true;
				System.out.println("The String are Anagram");
			}
		}
		if(!status)
		{
			System.out.println("String are not anagram");
		}
	}
	

	public static void main(String[] args) 
	{
		System.out.println("Enter first String : ");
		String s1 = sc.next();
		
		System.out.println("Enter second String : ");
		String s2 = sc.next();
		
		checkAnagram(s1, s2);
	

	}

}
