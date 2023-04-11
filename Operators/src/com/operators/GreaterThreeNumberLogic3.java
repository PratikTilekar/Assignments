package com.operators;

public class GreaterThreeNumberLogic3 {

	public static void main(String[] args) 
	{
		int a = 48;
		int b = 67;
		int c = 73;
		
		int greater;
		
		greater = (a>b)?((a>c)?a:c):((b>c)? b:c);
		
		System.out.println("Greatest number : " + greater);
		
	}

}
