package com.StringPractice3;

public class DuplicateCharacters 
{
	public static void duplicateCharacters(String s1)
	{
		s1 = s1.toLowerCase();
		
		String words[] = s1.split(" ");
		int count;
		
		for(int i=0;i<words.length;i++)
		{
			count = 1;
			
			for(int j=i+1;j<words.length;j++)
			{
				if(words[i].equals(words[j]))
				{
					count++;
					
					words[j]="0";
				}
			}
			
			if(count>1&&words[i]!="0")
			{
				System.out.println(words[i] + " = " + count);
			}
		}
	}
	

	public static void main(String[] args) 
	{
		String s = "Big black bug bit a big black dog ";
		duplicateCharacters(s);
		

	}

}
