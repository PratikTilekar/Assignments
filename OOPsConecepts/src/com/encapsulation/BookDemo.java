package com.encapsulation;

import java.util.Scanner;

public class BookDemo {

	public static void main(String[] args) 
	{
		Book b1 = new Book();
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter book id");
		b1.setBookId(sc.nextInt());
		
		System.out.println(" Enter name of the book");
		b1.setBookName(sc.next());
		
		System.out.println(" Enter name of the author");
		b1.setAuthor(sc.next());
		
		System.out.println(" Enter price");
		b1.setPrice(sc.nextFloat());
		
		System.out.println(b1);
		

	}

}
