package com.carDriver;

import java.util.Scanner;

public class CarDriverTest 
{
	static Scanner sc = new Scanner(System.in);
	
	public static void enterCarDetails(Car c)
	{
		System.out.println("Enter car id : ");
	}

	public static void main(String[] args) 
	{
		Car c1[] = new Car[3];
		for(int i=0;i<c1.length;i++)
		{
			c1[i] = new Car();
			enterCarDetails(c1[i]);
		}
		

	}

}
