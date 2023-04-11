package com.operators;

import java.util.Scanner;

public class LogicalDemo {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Total marks");
		float marks = sc.nextFloat();
		
		System.out.println("Best of three subject");
		float BestThree = sc.nextFloat();
		
		if((marks>80)||(BestThree>90))
		{
			System.out.println("Student is eligible");
		}
		else
		{
			System.out.println("Student is not eligible");
		}
		
	}

}
