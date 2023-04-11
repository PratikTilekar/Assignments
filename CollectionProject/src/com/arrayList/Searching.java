package com.arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Searching 
{
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) 
	{
		List<String> list1 = new ArrayList<>();
		
		list1.add("Java");
		list1.add("Python");
		list1.add("React");
		
		System.out.println("Enter a language :");
		boolean ans = list1.contains(sc.next());
		
		if(ans)
		{
			System.out.println("It contains the word :" + ans);
			
		}
		else
		{
			System.out.println("nope");
		}
		

	}

}
