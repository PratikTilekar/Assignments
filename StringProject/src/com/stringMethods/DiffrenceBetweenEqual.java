package com.stringMethods;

public class DiffrenceBetweenEqual {

	public static void main(String[] args) 
	{
		String s1="Java";
		String s2 = new String("Java");
		
		System.out.println("== : "+(s1==s2));
		System.out.println("Equals : "+s1.equals(s2));
		System.out.println("----------//////////----------");
		
		String s3 = new String("Java");
		System.out.println("== : "+(s3==s2));
		System.out.println("Equals : "+s3.equals(s2));
		System.out.println("----------//////////----------");
		
		String s4="Java";
		System.out.println("== : "+(s1==s4));
		System.out.println("Equals : "+s1.equals(s4));
		
		if(s1.compareTo(s2)==0)
		System.out.println("Equal");
		
		else
		System.out.println("Not Equal");
	
		
		
		
		

	}

}
