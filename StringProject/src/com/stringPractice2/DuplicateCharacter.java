package com.stringPractice2;

public class DuplicateCharacter 
{
	public static void findDuplicate(String str)
	{
		str = str.toLowerCase();
		int count = 0;
		String noSpaceStr[] = str.split(" ");
		
		System.out.println("The String is : " + str);
		System.out.println("The duplicates for String are : ");
		
		for(int i=0;i<noSpaceStr.length;i++)
		{
			for(int j=i+1;j<noSpaceStr.length;j++)
			{
				if(noSpaceStr[i]==noSpaceStr[j])
				{
					System.out.println(noSpaceStr[j] + "=" + count);
					count++;
					break;
				}
			}
		}
		
	}

	public static void main(String[] args) 
	{
		String s1 = " I love my self and my parents";
		findDuplicate(s1);

	}

}
