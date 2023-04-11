package com.arrayList;

import java.util.ArrayList;
import java.util.List;

public class NonGenericArrayList 
{

	public static void main(String[] args) 
	{
		List list1 = new ArrayList<>();
		
		list1.add(10);
		list1.add("hii");
		list1.add(45.3f);
		list1.add('P');
		
		for(int i=0;i<list1.size();i++)
		{
			System.out.println(list1.get(i));
			int data = (int)list1.get(i)+10;
			list1.set(i, data);
		}
		
		System.out.println(list1); //// class cast Exception
				
				
		

	}

}
