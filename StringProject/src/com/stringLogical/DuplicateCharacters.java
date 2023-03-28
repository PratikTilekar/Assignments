package com.stringLogical;

public class DuplicateCharacters 
{
	public static void duplicate(String st)
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
				System.out.println(words[i]+"="+count);
			}
		}
	
	}

	public static void main(String[] args) 
	{
		String s = "Big house big building both are big";
		duplicate(s);
		
		
		
		
	

	}

}
