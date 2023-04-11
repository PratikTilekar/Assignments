package com.customException;

public class Voting 
{
	public static void checkVote(int age) throws InvaliAgeException
	{
		if(age<18)
		{
			throw new InvaliAgeException("You are not eligibale");
		}
		else
		{
			System.out.println("Welcome you can vote");
		}
	}

	public static void main(String[] args) 
	{
		Voting v = new Voting();
		
				
	
	

	}

}
