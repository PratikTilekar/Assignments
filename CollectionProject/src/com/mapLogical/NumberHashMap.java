package com.mapLogical;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class NumberHashMap 
{
	public static String convertWords(int num)
	{
		String word = null;
		
		switch(num)
		{
		case 1:
			word = "one";
			break;
			
		case 2:
			word = "two";
			break;
			
		case 3:
			word = "three";
			break;
			
		case 4:
			word = "four";
			break;
			
			default:
				System.out.println("Error");
		}
		return word;
	}
	
	public static void createMap(ArrayList<Integer> al)
	{
		HashMap<String,Integer> hm = new HashMap<>();
		
		for(Integer i:al)
		{
			String words = convertWords(i);
			
			if(hm.containsKey(words))
				
				hm.put(words, hm.get(words)+1);
			
			else
				hm.put(words, 1);
		}
		
		for(Map.Entry<String, Integer> n:hm.entrySet())
		{
			System.out.println(n.getKey()+"="+n.getValue());
			
		}
	}

	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(1);
		list.add(3);
		list.add(2);
		list.add(3);
		list.add(2);
		list.add(1);
		
		
		createMap(list);

	}

}
