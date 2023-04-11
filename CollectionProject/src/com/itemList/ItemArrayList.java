package com.itemList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ItemArrayList {

	public static void main(String[] args) 
	{
		List<Item> al = new ArrayList<>();
		System.out.println(al);
		
		al.add(new Item(104, "Phone", 15000));
		al.add(new Item(102, "Ear phone", 1200));
		al.add(new Item(103, "Power Bank", 500));
		al.add(new Item(101, "Charger", 1000));
		
		for(Item i : al)
		{
			System.out.println(i);
		}
		
		Collections.sort(al);
		
		System.out.println("=================AFTER SORTING============");
		
	    for(Item i : al)
	    {
	    	System.out.println(i);
	    }
		
		

	}

}
