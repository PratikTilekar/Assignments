package com.Practice;

import java.util.Scanner;

public class Grading {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" marks for 1st subject");
		float sub1 = sc.nextFloat();
		
		System.out.println(" marks for 2nd subject");
		float sub2 = sc.nextFloat();
		
		System.out.println(" marks for 3rd subject");
		float sub3 = sc.nextFloat();
		
		System.out.println(" marks for 4th subject");
		float sub4 = sc.nextFloat();
		
		System.out.println(" marks for 5th subject");
		float sub5 = sc.nextFloat();
		
		float per = (sub1+sub2+sub3+sub4+sub5)/5;
		System.out.println(" your percentage is " + per + "%");
		
		if(per>=80)
			
			System.out.println(" a grade");
		
		   else if(per>=70)
			    System.out.println(" b grade");
		   
		      else if(per>=50)
		    	  System.out.println(" c grade");
		
		          else if(per>=40)
		        	  System.out.println(" d grade ");
		
		  else
		     System.out.println(" fail ");
	

	}

}
