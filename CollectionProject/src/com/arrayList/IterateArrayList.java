package com.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IterateArrayList {

	public static void main(String[] args) 
	{
		List<String> al = new ArrayList<>();
		
		al.add("Java");
		al.add("Python");
		al.add("React");
		al.add("React");
		
		System.out.println(al);
		
		System.out.println("----------////////////------------");
		
		for(String s:al)
		{
			System.out.println(s);
		}
		
		System.out.println("----------////////////------------");
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("----------////////////------------");
		
		Iterator<String> it = al.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("----------////////////------------");
		
		ListIterator<String> it1 = al.listIterator();
		
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
				
		
	
		

	}

}
