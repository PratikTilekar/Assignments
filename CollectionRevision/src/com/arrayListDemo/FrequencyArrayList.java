package com.arrayListDemo;

import java.util.ArrayList;

public class FrequencyArrayList 
{
	public static void calFrequency(ArrayList<String> list)
	{
		int count=0;
		for(int i=0;i<list.size();i++)
		{
			count=1;
			if(list.get(i).equals("Visited"))
			continue;	
			
			for(int j=i+1;j<list.size();j++)
			{
				if(list.get(i).equals(list.get(j)))
				{
					list.set(j, "Visited");
					count++;
				}
			}
			System.out.println(list.get(i)+"="+count);
		}
		
	}

	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<>();
		
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("A");
		al.add("B");
		al.add("B");
		al.add("A");
		
		calFrequency(al);
		

	}

}
