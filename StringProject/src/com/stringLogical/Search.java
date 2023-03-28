package com.stringLogical;

public class Search 
{
	public static boolean search(String str[],String word)
	{
		Boolean isPresent=true;
		for(int i=0;i<str.length;i++)
		{
			if(str[i].equals(word))
			{
				isPresent=true;
				break;
			}
		}
		return isPresent;
	}

	public static void main(String[] args) 
	{
		String s[] = {"hello welcome to java"}; 
		
		search(s, "to");
		
		boolean isP = search(s, "to");
		
		if(isP)
		{
			System.out.println("Word is present");
		}
		else
		{
			System.out.println("Word is not present");
		}

	}

}
