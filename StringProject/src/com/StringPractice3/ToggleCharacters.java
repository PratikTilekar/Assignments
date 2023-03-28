package com.StringPractice3;

public class ToggleCharacters 
{
	public static void toggle(String st)
	{
		char str[] = st.toCharArray();
		
		for(int i=0;i<str.length;i++)
		{
			if(str[i]>='A' && str[i]<='Z')
			{
				str[i]=(char)(str[i]+'a'-'A');
				
				
				
			}
			else if(str[i]>='a' && str[i]<='z')
			{
				str[i]=(char)(str[i]+'A'-'a');
			}
			System.out.print(str[i]);
		}
		
		
	}

	public static void main(String[] args) 
	{
		String s = "ProGraM";
		toggle(s);
		
		/*String s1="";
		for(int i=0;i<s.length();i++)
		{
			if(Character.isUpperCase(s.charAt(i)))
			{
				s1=s1+Character.toLowerCase(s.charAt(i));
				
			}
			else
			{
				s1=s1+Character.toUpperCase(s.charAt(i));
			}
			
		}
		System.out.println(s1);*/
	}

}
