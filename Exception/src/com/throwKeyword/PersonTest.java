package com.throwKeyword;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PersonTest {

	public static void main(String[] args) 
	{
		Person p = new Person();
		Scanner sc = new Scanner(System.in);
		
		//try
		{
			System.out.println("Enter age : ");
			int a = sc.nextInt();
			
			if(a<0||a<18)
			{
				throw new ArithmeticException("Age should be greater than 18");
			}
		}
		
		

	}

}
