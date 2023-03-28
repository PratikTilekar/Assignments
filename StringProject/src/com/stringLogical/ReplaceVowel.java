package com.stringLogical;

public class ReplaceVowel 
{
	public static void replaceV(String st)
	{
		st = st.toLowerCase();
		char ch[] = st.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			if((ch[i]=='a')||(ch[i]=='e')||(ch[i]=='i')||(ch[i]=='e')||(ch[i]=='u'))
			{
				ch[i] = '$';
			}
			
		}
		System.out.println(ch);
	}

	public static void main(String[] args) 
	{
		String s1 = "Java";
		
		System.out.println("Original :" + s1);
		
		replaceV(s1);
		
		
		
	
		

	}

}
