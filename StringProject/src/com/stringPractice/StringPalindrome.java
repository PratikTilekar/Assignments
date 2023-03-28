package com.stringPractice;

public class StringPalindrome 
{
	public static void checkPalindrome(String st)
	{
		st = st.toLowerCase();
		String reverse ="";
		
		for(int i=st.length();i>=0;i--)
		{
			reverse = reverse + st.charAt(i);
		}
		
		if(st.equals(reverse))
		{
			System.out.println("Enter string is palindrome");
		}
		else
		{
			System.out.println("Enter string is not palindrome");
		}
	}
	

	public static void main(String[] args) 
	{
		String s = "radar";
		checkPalindrome(s);
		

	}

}
