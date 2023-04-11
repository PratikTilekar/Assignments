package com.linkList;

import java.util.LinkedList;

public class ExceptionsInLinkedList {

	public static void main(String[] args) 
	{
		LinkedList<String> list1 = new LinkedList<>();
		
		list1.poll(); // gives null
		
		list1.remove(); // NoSuchElementsException
		
		System.out.println(list1);
		
		
		

	}

}
