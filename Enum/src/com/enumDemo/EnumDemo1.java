package com.enumDemo;

public class EnumDemo1 
{
	public enum Days{MON,TUE,WED,THU,FRI,SAT,SUN}

	public static void main(String[] args) 
	{
		Days d1 = Days.MON;
		Days d2 = Days.MON;
		
		if(d1.equals(d2))
		{
			System.out.println("Equal");
		}
		
		if(d1==d2)
		{
			System.out.println("Equal");
		}
		
		
		for(Days d: Days.values())
		{
			System.out.print(d + " ");
		}
		
		
		
		

	}

}
