package com.Practice;

import java.util.Scanner;

public class PyramidPattern {

	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println(" Enter rows");
	   int n = sc.nextInt();
	   
	   for(int i=1;i<=n;i++)
	   {
		   //for space
		   for(int j=1;j<=(n-i);j++)
		   {
			   System.out.print(" ");
		   }
		   // for number sysout(j+" ")
		   // for star sysout("* ")
		   for(int j=1;j<=i; j++)
		   {
			   System.out.print("* ");
		   }
		   System.out.println();
	   }

	}

}
