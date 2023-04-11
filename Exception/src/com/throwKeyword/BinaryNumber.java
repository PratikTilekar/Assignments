package com.throwKeyword;

import java.util.Scanner;

public class BinaryNumber {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
	    int num = sc.nextInt();
	    
	    while(num>0)
	    {
	    	if((num%10!=1)&&(num%10!=0))
	    	{
	    		throw new ArithmeticException("This number is not a binary number ");
	    	}
	    	num=num/10;
	    }
	    
	    System.out.println("This number is Binary number ");
	    
	}
	

}
