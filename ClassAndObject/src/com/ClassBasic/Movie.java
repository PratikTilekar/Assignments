package com.ClassBasic;

public class Movie 
{
	int yearOfRelease;
	float profit;
	String actorName;
	String producerName;
	
	
	void acceptDetails(int y , float p, String a, String pr)
	{
		yearOfRelease = y;
		profit = p;
		actorName = a;
	    producerName = pr;
				
	}
	
	void showDetails()
	{
		System.out.println("year of release is :"+ yearOfRelease);
		System.out.println(" profit is :"+profit);
		System.out.println(" actor name is " + actorName);
		System.out.println(" producer name is " + producerName);
	}
	
	public static void main(String [] args)
	{
		Movie titanic = new Movie();
		titanic.acceptDetails(1997, 120001.03f, "leonardo", "Mr.james");
		titanic.showDetails();
		
		
		Movie uri = new Movie();
		uri.acceptDetails(2019, 100000.36f, "V. Prasad", "viki kaushal");
		uri.showDetails();
	}

}
