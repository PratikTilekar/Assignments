package com.stringLogical;

public class DuplicateCharacter 
{
	public static void SortDuplicate(String str)
	{
		str=str.toLowerCase();
		char st[] = str.toCharArray();
		int count;
		
		for(int i=0;i<st.length;i++)
		{
			count = 1;
			for(int j=i+1;j<st.length;j++)
			{
				if(st[i]==st[j]&&st[i]!=' ')
				{
					count++;
					st[j]='0';
				}
			}
			if(count>1&&st[i]!='0')
			{
				System.out.println(st[i]+"="+count);
			}
		}
	}

	public static void main(String[] args) 
	{
		String s1 = "Beautiful beaches are in goa";
		SortDuplicate(s1);
		

	}

}
