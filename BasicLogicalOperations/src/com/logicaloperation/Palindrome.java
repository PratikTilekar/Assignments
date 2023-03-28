package com.logicaloperation;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		
		int original = n;
		int reverseNum=0;
		
		while(n!=0)
		{
			int r = n%10;
			
			reverseNum=(reverseNum*10)+r;
			n=n/10;
		}
		if(original==reverseNum)
		{
			System.out.println(n);
		}
		else
		{
			System.out.println(" Number is not palindrome");
		}

	}

}
