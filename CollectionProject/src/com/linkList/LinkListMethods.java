package com.linkList;

import java.util.LinkedList;

public class LinkListMethods {

	public static void main(String[] args) 
	{
		LinkedList<String> names = new LinkedList<>();
		
		names.add("Pratik");
		names.add("Suraj");
		names.add("Pratik");
		names.add("Sahili");
		names.add("Gaurav");
		
		System.out.println(names);
		
		names.addFirst("Milind");
		names.addLast("Indrayani");
		
		System.out.println("------------/////////////----------------------");
		
		System.out.println(names);
		
		names.offer("Shradhha");
		names.offerFirst("Shuruti");
		
		System.out.println("------------/////////////----------------------");
		
		System.out.println(names);
		
		names.add(2, "Omkar");
		
		System.out.println("------------/////////////----------------------");
		
		System.out.println(names);
		
		
		

	}

}
