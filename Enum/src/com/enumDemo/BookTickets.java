package com.enumDemo;

import java.util.Scanner;

public class BookTickets 
{
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) 
	{
		System.out.println("Choose ticket type :");
		System.out.println("1.Standard");
		System.out.println("2.Premium");
		System.out.println("3.Recliner");
		
		int seatType = sc.nextInt();
		
		System.out.println("Enter total seats :" );
		int totalSeats = sc.nextInt();
		
		MovieSeats m = null;
		
		switch(seatType)
		{
		case 1: m=MovieSeats.STANDARD;
		System.out.println("Total price :" + totalSeats*(m.price));
		break;
		
		case 2: m=MovieSeats.PREMIUM;
		System.out.println("Total price :" + totalSeats*(m.price));
		break;
		
		case 3: m=MovieSeats.RECLINER;
		System.out.println("Total price :" + totalSeats*(m.price));
		break;
		
		default : System.out.println("Error");
				
		
		}
		

	}

}
