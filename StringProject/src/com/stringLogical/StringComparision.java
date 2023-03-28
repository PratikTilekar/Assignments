package com.stringLogical;

public class StringComparision 
{
	public static void compareStrings(String str1[],String str2[])
	{
		boolean found = true;
		for(String s:str2)
		{
			found=false;
			for(String si:str1)
			{
				if(s.equals(si))
				{
					found =true;
					break;
				}
			}
			if(!found)
			{
				System.out.println(s);
			}
		}
	}

	public static void main(String[] args) 
	{
		String s1[] = {"Rahul","Sachin","Ishika","Pooja"};
		String s2[] = {"Pratik","Ishika","Sachin","Rahul"};
		
		compareStrings(s1, s2);


	}

}
