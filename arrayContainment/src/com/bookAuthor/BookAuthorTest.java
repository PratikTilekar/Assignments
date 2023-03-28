package com.bookAuthor;

import java.util.Scanner;

public class BookAuthorTest 
{
	static Scanner sc = new Scanner(System.in);
	
	public static void enterDetails(Book b)
	{
		System.out.println("Enter book id : ");
		b.setId(sc.nextInt());
		
		System.out.println("Enter book name : ");
		b.setBName(sc.next());
		
		System.out.println("Enter book price : ");
		b.setPrice(sc.nextInt());
		
		/*Author a = new Author();
		
		System.out.println("Enter author id : ");
		a.setAuthorId(sc.nextInt());
		
		System.out.println("Enter author name : ");
		a.setAname(sc.next());
		
		System.out.println("Enter author age : ");
		a.setAge(sc.nextInt());
		
		b.setAuthor(a);*/
		
		b.setAuthor(new Author());
		
		System.out.println("Enter author id : ");
		b.getAuthor().setAuthorId(sc.nextInt());
		
		System.out.println("Enter author name : ");
		b.getAuthor().setAname(sc.next());
		
		System.out.println("Enter author age : ");
		b.getAuthor().setAge(sc.nextInt());
		
		
					
	}
	
	public static void printDetails(Book b1[])
	{
		for(Book b:b1)
		{
			System.out.println(b);
		}

	}
	
	public static void sortAccordingPrice(Book b1[])
	{
		Book temp;
		for(int i=0;i<b1.length;i++)
		{
			for (int j=i+1;j<b1.length;j++)
			{
				if(b1[i].getPrice()<b1[j].getPrice())
				{
					temp=b1[i];
					b1[i]=b1[j];
					b1[j]=temp;
					
				}
			}
		}
	}
	

	public static void main(String[] args) 
	{
		Book book[] = new Book[3];
		
		for(int i=0;i<book.length;i++)
		{
			book[i] = new Book();
			enterDetails(book[i]);
		}
		
		printDetails(book);
		
		System.out.println("After sorting.....................");
		sortAccordingPrice(book);
		printDetails(book);

	}

}
