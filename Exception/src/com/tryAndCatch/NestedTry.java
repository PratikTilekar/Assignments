package com.tryAndCatch;

public class NestedTry 
{

	public static void main(String[] args) 
	{
		
		try
		{
			String s1[] = {"Java","C",null,"Python"};
			
			//for(int i=0;i<=s1.length;i++)
			//{
				try
				{
					for(int i=0;i<=s1.length;i++)
					{
					System.out.println(s1[i].length());
					}
				}
				
				catch(NullPointerException e)
				{
					System.out.println(e);
				}
				
				catch(ArrayIndexOutOfBoundsException e)
				{
					System.out.println(e);
				}
				
			}
		//}
		
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		

	}

}
