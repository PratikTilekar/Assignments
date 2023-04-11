package com.bookAuthor;

import java.util.Scanner;

public class Library 
{
	static Scanner sc = new Scanner(System.in);
	
	public static void enterBookDetails(Book b)
	{
		System.out.println("Enter book name :");
		b.setBname(sc.next());
		
		System.out.println("Enter book price :");
		b.setPrice(sc.nextFloat());
		
		b.setAuthor(new Author());
		
		System.out.println("Enter author id :");
		b.getAuthor().setId(sc.nextInt());
		
		System.out.println("Enter author name :");
		b.getAuthor().setName(sc.next());
		
		System.out.println("Enter author age :");
		b.getAuthor().setAge(sc.nextInt());
	}

	public static void main(String[] args) 
	{
		Book b1 = new Book();
		
		enterBookDetails(b1);
		
		System.out.println(b1);

	}

}
