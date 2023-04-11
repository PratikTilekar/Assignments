package com.arrayListLogical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionToArrayConversion {

	public static void main(String[] args) 
	{
		String name[] = {"Pratik","Suraj","Sahili","Indrayani"};
		
		List<String> al1 = Arrays.asList(name);
		
		System.out.println("----------/////1st/////-----------");
		
		ArrayList<String> al2 = new ArrayList<>(Arrays.asList(name));
		System.out.println(al2);
		
		System.out.println("----------/////2nd/////-----------");
		
		ArrayList<String> al3 = new ArrayList<>();
		Collections.addAll(al3, name);
		
		System.out.println("----------/////3rd/////-----------");
		
		Object[] col = al3.toArray();
		System.out.println(Arrays.toString(col));
		
		for(int i=0;i<col.length;i++)
		{
			col[i] = ((String) col[i]).concat(" is learning java");
			
		}
		System.out.println(Arrays.toString(col));
		
		System.out.println("----------/////4th/////-----------");
		
		
		

	}

}
