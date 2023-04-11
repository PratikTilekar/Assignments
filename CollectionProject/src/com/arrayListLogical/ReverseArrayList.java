package com.arrayListLogical;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ReverseArrayList 
{
	public static void reverseList(ArrayList<Integer> al)
	{
		Iterator<Integer> itr = al.iterator();
		ListIterator<Integer> itr1 = al.listIterator(al.size());
		
		int temp;
		for(int i=0,j=al.size()-1;i<al.size()/2;i++,j--)
		{
			temp=al.get(i);
			al.set(i, al.get(j));
			al.set(j, temp);
			
		}
		System.out.println(al);
		
		
	}

	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		System.out.println("Before reverse :" + list);
		
		//Collections.reverse(list);
		
		System.out.println("After reverse :");
		//System.out.println(list);
		reverseList(list);
		

	}

}
