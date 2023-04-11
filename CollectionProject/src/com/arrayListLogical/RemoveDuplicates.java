package com.arrayListLogical;

import java.util.ArrayList;

public class RemoveDuplicates 
{
	 public static void removeDuplicate(ArrayList<Integer> list1)
	 {
		 ArrayList<Integer> list2 = new ArrayList<>(); 
		 
		 for(Integer i:list1)
		 {
			 if(!list2.contains(i))
			 {
				 list2.add(i);
			 }
		 }
		 System.out.println(list2);
	 }

	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(1);
		al.add(2);
		al.add(1);
		al.add(3);
		al.add(2);
		al.add(4);
		
		System.out.println(al);
		removeDuplicate(al);
	
		

	}

}
