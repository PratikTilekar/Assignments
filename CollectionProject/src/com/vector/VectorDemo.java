package com.vector;

import java.util.Vector;

public class VectorDemo {

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
		
		System.out.println("Size :" + colour.size());
		System.out.println("Size :" + colour.capacity());
		
		colour.add("Golden");
		colour.ensureCapacity(21);
		
		System.out.println("===========AFTER ADDING 11TH ELEMENT 100% INCREMENT=======");
		
		
		System.out.println("Size :" + colour.size());
		System.out.println("Size :" + colour.capacity());
		
		System.out.println("-------------/////////////----------------");
		
		System.out.println(colour.get(10));
		System.out.println(colour.elementAt(10));
		
		System.out.println("-------------/////////////----------------");
		
		System.out.println(colour.set(3, "Hirva"));
		
		System.out.println(colour);
		
		
		
		

	}

}
