package com.constructer;

public class Games {
	private String name;
	private int price;
	static String type = "18 plus";
	
	
	Games()
	{
		
	}
	
	Games(String name,int price)
	{
		this.name = name;
		this.price = price;
	}
	
	Games(String name)   ///////CONSTRUCTOR OVERLOADING
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getPrice()
	{
		return price;
	}
	public String toString()
	{
		return " name : " + name + " price :" + price  + " type :" + type;
	}
	
	
	public static void main(String[] args) 
	{
		Games g1 = new Games("God of war " , 2800);
		System.out.println(g1);
		
		System.out.println("----///-------");
	
		Games g2 = new Games(" Far cry 5");
        System.out.println(g2);
        
        System.out.println("-------//////-----------");
        
        System.out.println(new Games(" Dota ",2000).toString()); ///annonymous object
	}

}
