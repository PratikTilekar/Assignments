package com.stringLogical;

import java.util.Arrays;

public class SortingAccrdingAlphabet 
{
	public static void sortStringAccToAlphabet(String str[])
	{
		int i,j;
		String temp;
		
		for(i=0;i<str.length;i++)
		{
			for(j=i+1;j<str.length;j++)
			{
				if(str[i].compareTo(str[j])>1)
				{
					temp=str[i];
					str[i] = str[j];
					str[j] = temp;
					
				}
			}
		}
	}
	
	public static void sortArrayAccLength(String str[])
	{
		int i,j;
		String temp;
		
		for(i=0;i<str.length;i++)
		{
			for(j=i+1;j<str.length;j++)
			{
				if(str[i].length()>str[j].length())
				{
					temp=str[i];
					str[i] = str[j];
					str[j] = temp;
					
				}
			}
		}
	}

	public static void main(String[] args) 
	{
		String game[] = {"Cricket","Football","Table tennis","Hockey","Run"};
		
		sortStringAccToAlphabet(game);
		System.out.println(Arrays.toString(game));
		
		System.out.println("------------//////////////-------------------");
		
		sortArrayAccLength(game);
		System.out.println(Arrays.toString(game));
		

	}

}
