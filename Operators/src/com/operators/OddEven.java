package com.operators;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter a number ");
		int num = sc.nextInt();
		
		{
			System.out.println(num +((num%2==0)?"number is even":"number is odd"));
		}
	
	}

}
