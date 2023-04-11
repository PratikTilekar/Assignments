package com.HashMap;

import java.util.HashMap;
import java.util.Set;

public class IteratingDemo {

	public static void main(String[] args) 
	{
		HashMap<String,Integer> names = new HashMap<>();
		
		names.put("Pratik", 80);
		names.put("Suraj", 88);
		names.put("Sahili", 90);
		
		System.out.println(names);
		
		System.out.println("==================================");
		
		Set<String> set = names.keySet();
		
		for(String s:set)
		{
			System.out.println(s);
		}
		
		System.out.println("==================================");
		
		
		
		
		

	}

}
