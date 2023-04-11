package com.mapLogical;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class OccuranceOfLetters 
{
	public static void createMap(ArrayList<String> al)
	{
		HashMap<String,Integer> hm = new HashMap<>();
		
		for(String s:al)
		{
			if(hm.containsKey(s))
			{
				hm.put(s, hm.get(s)+1);
			}
			
			else
				hm.put(s, 1);
				
		}
		
		for(Map.Entry<String, Integer> en:hm.entrySet())
		{
			System.out.println(en.getKey()+"="+en.getValue());
		}
	}
	

	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("A");
		list.add("B");
		list.add("C");
		
		createMap(list);
		

	}

}
