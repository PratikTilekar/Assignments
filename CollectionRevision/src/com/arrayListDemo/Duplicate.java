package com.arrayListDemo;

import java.util.ArrayList;

public class Duplicate 
{
	public static void removeDuplicate(ArrayList<Integer> al)
	{
		ArrayList<Integer> list = new ArrayList<>();
		
		for(Integer i:al)
		{
			if(!list.contains(i))
			{
				list.add(i);
			}
		}
		System.out.println(list);
	}

	public static void main(String[] args) 
	{
		ArrayList<Integer> num = new ArrayList<>();
		
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(2);
		num.add(5);
		num.add(1);
		num.add(3);
		
		System.out.println(num);
		
		removeDuplicate(num);
		

	}

}
