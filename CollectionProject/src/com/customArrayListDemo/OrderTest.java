package com.customArrayListDemo;

import java.util.ArrayList;
import java.util.Collections;

public class OrderTest {

	public static void main(String[] args) 
	{
		ArrayList<Order> olist = new ArrayList<>();
		
		olist.add(new Order(101, "Sweet", 1000f));
		olist.add(new Order(102, "Ice cream", 500f));
		olist.add(new Order(102, "Cloths", 2000f));
		olist.add(new Order(102, "Phone", 50000f));
		olist.add(new Order(102, "Food", 500f));
		
		for(Order o:olist)
		{
			System.out.println(o);
		}
		
		Collections.sort(olist);
		System.out.println("===========AFTER SORTING========");
		
		for(Order o:olist)
		{
			System.out.println(o);
		}
		
	

	}

}
