package com.constructer;

import java.util.Scanner;

public class Alcohol 
{
	private String name;
	private String brand;
	private int price;
	private String origin;
	
	public Alcohol()
	{
		
		
	}
	
	public Alcohol(String name,String brand,int price,String origin)
	{
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.origin = origin;
		
	}
	
	public String toString()
	{
		return "name :"+name+" "+ " brand :"+ brand+" "+ " price :"+price+" "+ " origin :"+ origin+" ";
	}
	
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		Alcohol bottle1 = new Alcohol(" Red lable","Brooke Bond",1200," south of scotland");
	    System.out.println(bottle1);
	    
	    System.out.println("----------///----------");
				
				
		Alcohol bottle2 = new Alcohol(" black n white"," Diageo",2000," scotland");
		System.out.println(bottle2);
	}
	

}
