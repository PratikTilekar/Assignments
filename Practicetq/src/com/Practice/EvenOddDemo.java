package com.Practice;

import java.util.Scanner;

public class EvenOddDemo {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter a number ");
		
		int number = sc.nextInt();
		
		String result = number%2==0 ? " Even " : " Odd ";
		
		System.out.println("Number " + number +" is :"+ result );
		

	}

}
