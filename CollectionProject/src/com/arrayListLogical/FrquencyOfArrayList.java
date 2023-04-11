package com.arrayListLogical;

import java.util.ArrayList;
import java.util.List;

public class FrquencyOfArrayList 
{
	public static void findFrequency(List<String> al)
	{
		int count;
		
		for(int i=0;i<al.size();i++)
		{
			count=1;
			if(al.get(i).equals("visited"))
			continue;
			
			for(int j=i+1;j<al.size();j++)
			{
				if(al.get(i).equals(al.get(j)))
				{
					al.set(j, "visited");
					count++;
				}
			}
			System.out.println(al.get(i) + "=" + count);
			
		}
	
		
	}

	public static void main(String[] args) 
	{
		List<String> list = new ArrayList<>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("A");
		list.add("C");
		list.add("C");
		
		System.out.println(list);
		findFrequency(list);
		

	}

}
