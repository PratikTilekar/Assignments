package com.book;

import java.util.Scanner;

public class BookTest 
{
	static Scanner sc = new Scanner(System.in);
	
	public static void enterBookDetails(Book b1)
	{
		System.out.println("Enter book id : ");
		b1.setId(sc.nextInt());
		
		System.out.println("Enter book name : ");
		b1.setPrice(sc.nextInt());
		
		System.out.println("Enter book name : ");
		b1.setName(sc.next());
	}
	
	public static void printBookDetails(Book b1[])
	{
		System.out.println("=================");
		for(Book b:b1)
		{
			System.out.println(b);
		}

	}
	
	public static void priceSorting(Book b1[])
	{
		Book b = new Book();
		for(int i=0;i<b1.length;i++)
		{
			for(int j=i+1;j<b1.length;j++)
			{
				if(b1[i].getPrice()>b1[j].getPrice())
				{
					b=b1[i];
					b1[i]=b1[j];
					b1[j]=b;
				}
			}
			}

		
	}

	public static void main(String[] args) 
	{
		Book b2[] = new Book[5];
		for(int i=0;i<b2.length;i++)
		{
			b2[i] = new Book();
			enterBookDetails(b2[i]);
		}
		
		
		
		
		

	}

}
