package com.staticbasic;

public class Employee 
{
	private int id = 101;
	private String name = "kaushal";
	static String bankName = "SBI";
	static int employeeCount;
	static
	{
		bankName = "SBI";
	}
	//instance
	{
			employeeCount++;
	}
	


void display()
{
	System.out.println(" name " + name +" bank name" + bankName);
	System.out.println(" static bank name" + bankName);
	
}
public static void main (String [] args)
{
	Employee a1 = new Employee();
	a1.display();
	employeeCount++;
	System.out.println(" count :" + employeeCount);
	
	Employee a2 = new Employee();
	a2.display();
	
	Employee a3 = new Employee();
}
}


