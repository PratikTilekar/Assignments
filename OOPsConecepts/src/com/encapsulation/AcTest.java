package com.encapsulation;

import java.util.Scanner;

public class AcTest {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Ac a1 = new Ac();
		
		System.out.println(" Enter brand name ");
		a1.setBrand(sc.next());
		
		System.out.println(" Enter colour ");
		a1.setColour(sc.next());
		
		System.out.println(" Enter price ");
		a1.setPrice(sc.nextInt());
		
		System.out.println(a1);
		

	}

}
