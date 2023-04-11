package com.arrayList;

import java.util.ArrayList;
import java.util.List;

public class Replace {

	public static void main(String[] args) 
	{
		List<String> lang = new ArrayList<>();
		
		lang.add("Java");
		lang.add("Python");
		lang.add("Java");
		lang.add("Java");
		
		System.out.println(lang);
		
		System.out.println(lang.contains("Java"));
		
		for(int i=0;i<lang.size();i++)
		{
			if(lang.get(i).equals("Java"))
			{
				lang.set(i, "Core java");
			}
		
		}
		System.out.println(lang);
		
		

	}

}
