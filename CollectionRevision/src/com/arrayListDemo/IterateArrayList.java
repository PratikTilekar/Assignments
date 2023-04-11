package com.arrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IterateArrayList {

	public static void main(String[] args) 
	{
ArrayList<String> al = new ArrayList<>();
		
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("A");
		al.add("B");
		al.add("B");
		al.add("A");
		
		System.out.println(al);
		
		System.out.println("===================================");
		
		for(String s:al)
		{
			System.out.print(s+" ");
		}
		
		System.out.println("===================================");
		
		for(int i=0;i<al.size();i++)
		{
			System.out.print(al.get(i)+" ");
		}
		
		System.out.println("===================================");
		
		Iterator<String> itr = al.iterator();
		
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		
		ListIterator<String> litr = al.listIterator();
		
		while(litr.hasNext())
		{
			System.out.print(litr.next()+" ");
		}
		

	}

}
