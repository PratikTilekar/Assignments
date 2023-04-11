package com.arrayList;

import java.util.ArrayList;
import java.util.List;

public class GenricArrayList {

	public static void main(String[] args) 
	{
List<Integer> list1 = new ArrayList<>();
		
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		
		for(int i=0;i<list1.size();i++)
		{
			System.out.println(list1.get(i));
			int data = (int)list1.get(i)+10;
			list1.set(i, data);
		}
		
		System.out.println(list1);
		
		for(Integer i:list1)
		{
			System.out.println(i);
		}
	

	}

}
