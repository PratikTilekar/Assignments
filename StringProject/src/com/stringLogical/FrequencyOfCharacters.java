package com.stringLogical;

import java.util.Scanner;

public class FrequencyOfCharacters 
{
	static Scanner sc = new Scanner(System.in);
	
	public static void countFrequency(String s)
	{
		s=s.toLowerCase();
		char ch[] = s.toCharArray();
		
		int count;
		for(int i=0;i<ch.length;i++)
		{
			count=1;
			if(ch[i]=='\0')
				continue;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
					ch[j]='\0';
				}
			}
			
			System.out.println(ch[i]+" :"+count);
		}
	}
	

	public static void main(String[] args) 
	{
		System.out.println("Enter a String : ");
		String st = sc.next();
		
		countFrequency(st);
		

	}

}
