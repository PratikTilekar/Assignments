package com.HashMap;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class IteratingHashMap {

	public static void main(String[] args) 
	{
		HashMap<String,Double> hm = new HashMap<>();
		
		hm.put("Pratik", 88.6);
		hm.put("Sahili", 95.3);
		hm.put("Suraj", 90.4);
		
	    System.out.println(hm.size());
	    
	    System.out.println(hm);
	    
	    System.out.println("===========================");
	    
	    Set<String> keyset = hm.keySet();
	    
	    for(String s:keyset)
	    {
	    	System.out.println(s);
	    }
	    
	    System.out.println("===========================");
	    
	    Collection<Double> marks =  hm.values();
	    
	    for(Double d:marks)
	    {
	    	System.out.println(d);
	    }
	    
			
		

	}

}
