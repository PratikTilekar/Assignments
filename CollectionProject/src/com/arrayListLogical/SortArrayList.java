package com.arrayListLogical;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortArrayList 
{
	public static void sortArrayList(ArrayList<Integer> al)
	{
		int temp;
		for(int i=0;i<al.size();i++)
		{
			for(int j=i+1;j<al.size();j++)
			{
				if(al.get(i)>al.get(j))
				{
					temp=al.get(i);
					al.set(i, al.get(j));
					al.set(j, temp);
					
				}
			}
		}
	}

	public static void main(String[] args)
	{
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(100);
		list.add(20);
		list.add(43);
		list.add(77);
		list.add(8);
		list.add(120);
		list.add(1);
		list.add(45);
		
		System.out.println("Before sorting :");
		System.out.println(list);
		
		System.out.println("===========================");
		
		Collections.sort(list);
		System.out.println("After sorting :");
		System.out.println(list);
		
		System.out.println("====================");
		
		
		System.out.println("Reverse sort :");
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		
		System.out.println("==========MANUAL SORTING==========");
		
		sortArrayList(list);
		System.out.println(list);
		
		
		

	}

}
