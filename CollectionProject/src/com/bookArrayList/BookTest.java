package com.bookArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class BookTest {

	public static void main(String[] args) 
	{
		ArrayList<Book> al = new ArrayList<>();
		
		al.add(new Book(101,"Ramayan", 1000));
		al.add(new Book(102, "HarryPotter", 1200));
		al.add(new Book(103,"Mahabharat", 1500));
		al.add(new Book(104,"Peaky Blinder", 1300));
		al.add(new Book(105,"One Piece", 2000));
		
		for(Book bo:al)
		{
			System.out.println(bo);
		}
		
		Collections.sort(al);
		
		System.out.println("================AFTER SORTING============");
		
		for(Book bo:al)
		{
			System.out.println(bo);
		}
		
		
		

	}

}
