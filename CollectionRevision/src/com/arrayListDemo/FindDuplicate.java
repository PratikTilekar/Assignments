package com.arrayListDemo;

import java.util.ArrayList;

public class FindDuplicate 
{
	public static void findDuplicate(ArrayList<Integer> al)
	{
		int count;
		
		for(int i=0;i<al.size();i++)
		{
			count=1;
			if(al.get(i).equals(0))
			continue;
			
			for(int j=i+1;j<al.size();j++)
			{
				if(al.get(i).equals(al.get(j)))
				{
					al.set(i, 0);
					count++;
				}
			}
			if(count>1)
			{
				System.out.println(al.get(i)+"="+count);
			}
				
		}
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
		
		findDuplicate(num);

	}

}
