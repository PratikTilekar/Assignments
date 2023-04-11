package com.loop;

import java.util.Scanner;

public class SizeOfClothes {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter size in number ");
		int number = sc.nextInt();
		String size;
		
		switch(number)
		{
			case 29 :
				size = " Small";
				break;
			
			case 42 :
				size = " Medium";
				break;
				
			case 44 :
				size = " Large ";
				break;
				
			case 48 : 
				size = " Extra large ";
				break;
				
			default :
				size = " size not Available";
				break;
		}
	System.out.println(" Size : " + size);
		
	}

}
