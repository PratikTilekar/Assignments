package com.customArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class BookTest {

	public static void main(String[] args) 
	{
		ArrayList<Book> list = new ArrayList<>();
		
		list.add(new Book(101,"Ramayan",1200f));
		list.add(new Book(102,"HarryPotter",1000f));
		list.add(new Book(103,"Luck",800f));
		list.add(new Book(104,"Kasturi",1500f));
		list.add(new Book(105,"Mahabharat",2000f));
		
		for(Book al:list)
		{
			System.out.println(al);
		}
		
		Collections.sort(list);
		
		System.out.println("==============After sorting==============");
		
		for(Book al:list)
		{
			System.out.println(al);
		}
		

	}

}
