package com.stack;

import java.util.Enumeration;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) 
	{
		Stack<String> s = new Stack<>();
		
		s.add("Apple");
		s.add("Mango");
		s.add("Banana");
		
		System.out.println(s.peek()); // retrives last element without removing it
		System.out.println(s);
		
		s.pop(); // removes the last element
		System.out.println(s);
		
		System.out.println(s.search("Mango")); // it gives the index 
		
		System.out.println(s.search("Banana")); // when element is not present it gives -1
		
		Enumeration<String> s1 = s.elements();
		
		while(s1.hasMoreElements())
		{
			System.out.println(s.lastElement());
		}
	


	}

}
