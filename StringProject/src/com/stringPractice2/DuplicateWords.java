package com.stringPractice2;

public class DuplicateWords 
{
	public static void duplicateWords(String st)
	{
		st = st.toLowerCase();
		
		String words[] = st.split(" ");
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
				System.out.println(words[i] + "=" + count);
			}
			
		}
	}

	public static void main(String[] args) 
	{
		String s = "Big black bug bit a big black dog ";
		duplicateWords(s);
		

	}

}
