package com.polymorphism;

public class TypePromotionAmbiguity 
{
	static void display(int a,double d)
	{
		System.out.println(" method 1");
		System.out.println(a+d);
		
	}
	
	static void display(long l,float f)
	{
		System.out.println(" method 2");
		System.out.println(l+f);
	}
	

	public static void main(String[] args) 
	{
		display(45, 7.8);
		//AMBIGIOUS
		

	}

}
