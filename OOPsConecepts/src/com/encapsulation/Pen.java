package com.encapsulation;

import java.util.Scanner;

public class Pen 
{
	private String colour;
	private String type;
	private int price;
	
	public void setColour(String colour)
	{
		this.colour = colour;
	}
	
	public String getColour()
	{
		return colour;
	}
	
	public void setType(String type)
	{
		this.type = type;
	}
	
	public String getType()
	{
		return type;
	}
	
	public void setPrice(int price)
	{
		this.price = price;
	}
	
	public int getPrice()
	{
		return price;
	}
	
	public String toString()
	{
		return " colour :" + colour + " " + " type :" + type + " " +" price :"+ price + " ";
	}

	public static void main(String []args )
	{
		Scanner sc = new Scanner(System.in);
		
		Pen p1 = new Pen();
		System.out.println(" Enter colour");
		p1.setColour(sc.next());
		
		System.out.println(" Enter type ");
		p1.setType(sc.next());
		
		System.out.println(" Enter price");
		p1.setPrice(sc.nextInt());
		
		System.out.println(p1);
		
		System.out.println("---------------------");
		

		
	
	}

	private static void p1(String string, String string2, int i) {
		// TODO Auto-generated method stub
		
	}
}
