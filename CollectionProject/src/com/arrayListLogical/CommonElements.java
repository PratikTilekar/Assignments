package com.arrayListLogical;

import java.util.ArrayList;

public class CommonElements {

	public static void main(String[] args) 
	{
		ArrayList<String> al1 = new ArrayList<>();
		
		al1.add("Hi");
		al1.add("Hello");
		al1.add("Hi");
		
		System.out.println("First list is :" + al1);
		
		ArrayList<String> al2 = new ArrayList<>();
		al2.add("hi");
		al2.add("Welcome");
		
		System.out.println("Second list is :" + al2);
		
		al2.retainAll(al1);
		
		System.out.println("Common elements are :" + al1);
		
		

	}

}
