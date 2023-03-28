package com.stringPractice;

public class ReplaceVowels 
{
	public static void replaceVowel(String st)
	{
		st=st.toLowerCase();
		
		char ch[] = st.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if((ch[i]=='a')||(ch[i]=='e')||(ch[i]=='i')||(ch[i]=='o')||(ch[i]=='u'))
			{
				ch[i] = '$';
			}
		}
		System.out.println(ch);
	}

	public static void main(String[] args) 
	{
		String s1 = "Pooja";
		System.out.println(s1);
		System.out.println("===========");
		replaceVowel(s1);
		

	}

}
