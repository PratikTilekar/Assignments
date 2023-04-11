package com.arrayListLogical;

import java.util.ArrayList;

public class Duplicate 
{
	public static void findDuplicate(ArrayList<String> al)
	{
		int count;
		int dc=0;
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
			if(count>1)
			{
				System.out.println(al.get(i) +"=" + count);
				dc++;
			}
			
		}
		System.out.println("Number of duplicate characters are :" + dc );
	
		
	}

	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<>();
		
		list.add("A");
		list.add("B");
		list.add("A");
		list.add("A");
		list.add("C");
		list.add("B");
		
		System.out.println(list);
		
		System.out.println("Duplicate are :");
		findDuplicate(list);
		
		

	}

}
