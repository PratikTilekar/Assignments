package com.vector;

import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Vector;

public class VectorDemo2 {

	public static void main(String[] args) 
	{
           Vector<String> colour = new Vector<>();
           
           colour.add("Black");
   		   colour.add("White");
   		   colour.add("Blue");
   		   colour.add("Green");
   		   colour.add("Purpule");
   		   colour.add("Black");
   		   colour.add("White");
   		   colour.add("Blue");
   		   colour.add("Green");
   		   colour.add("Purpule");
   		   
   		   for(int i=0;i<colour.size();i++)
   		   {
   			   System.out.print(colour.get(i)+" ");
   		   }
   		   System.out.println("-----------------//////////----------------");
   		   
   		   for(String s:colour)
   		   {
   			   System.out.print(s + " ");
   		   }
   		   
   		System.out.println("-----------------//////////----------------");
   		
   		ListIterator<String> list1 = colour.listIterator(colour.size());
   		while(list1.hasPrevious())
   		{
   			System.out.print(list1.hasPrevious()+" ");
   		}
   		
   		System.out.println("-----------------//////////----------------");
   		
   		Enumeration<String> en = colour.elements();
		
   		while(en.hasMoreElements())
   		{
   			System.out.print(en.nextElement()+" ");
   		}
		

	}

}
