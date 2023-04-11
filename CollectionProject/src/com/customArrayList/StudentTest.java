package com.customArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class StudentTest {

	public static void main(String[] args) 
	{
		ArrayList<Student> slist = new ArrayList<>();
		
		slist.add(new Student(101,"Pratik",90.00f));
		slist.add(new Student(102,"Indrayani",95.55f));
		slist.add(new Student(103,"Suraj",93.88f));
		slist.add(new Student(104,"Sahili",91.00f));
		slist.add(new Student(105,"Shradhha",92.45f));
		
		for(Student s:slist)
		{
			System.out.println(s);
		}
		
		Collections.sort(slist);
		
		System.out.println("=============AFTER SORTING==============");
		
		for(Student s:slist)
		{
			System.out.println(s);
		}
		
	
		

	}

}
