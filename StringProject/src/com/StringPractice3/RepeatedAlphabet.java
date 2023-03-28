package com.StringPractice3;

public class RepeatedAlphabet 
{
	public static void repeatedAlpha(String st)
	{
		st = st.toLowerCase();
		char Str[] = st.toCharArray();
		int count;
		
		System.out.println("Repeated alphabets are :");
		
		for(int i=0;i<Str.length;i++)
		{
			count = 1;
			for(int j=i+1;j<Str.length;j++)
			{
				if(Str[i]==Str[j]&&Str[i]!=' ')
				{
					count++;
					
					Str[j]='0';
				}
			}
			if(count>1&&Str[i]!='0')
			{
				System.out.println(Str[i] + "=" + count);
			}
			
		}
	}

	public static void main(String[] args) 
	{
		String s = "Hello my name is Pratik and i am learning java";
		repeatedAlpha(s);
		

	}

}
