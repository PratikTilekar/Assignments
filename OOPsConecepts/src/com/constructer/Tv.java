package com.constructer;

import java.util.Scanner;

public class Tv 
{
	private String brand;
	private int price;
	private String colour;
	
	 Tv()
	{
		
		System.out.println(" in default constructer");
		
	}
	
	 Tv(String brand,int price,String colour)
	{
		System.out.println(" in param constructer");
		this.brand = brand;
		this.price = price;
		this.colour = colour;
	}
	
	public String toString()
	{
		return "brand :"+brand+" "+" price :"+price+" "+"colour :"+colour+" ";
	}
	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		Tv t1 = new Tv("Sony",120012," Black");
	    System.out.println(t1);
	    
	    Tv t2 = new Tv(" LG ",1000231," Silver ");
	    System.out.println(t2);
	}
	

}
