package com.HashMap;

import java.util.HashMap;
import java.util.Map;

public class EmployeeTest {

	public static void main(String[] args) 
	{
		HashMap<Employee, String> hm = new HashMap<>();
		
		hm.put(new Employee(101, "Pratik", 100000), "Devloper");
		
		Employee e1 = new Employee(102,"Suraj", 112000);
		
		hm.put(e1, "Technical");
		
		hm.put(new Employee(101, "Pratik", 110000), "Sr. Devloper");
		
		for(Map.Entry<Employee, String> e:hm.entrySet())
		{
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}

		

	}

}
