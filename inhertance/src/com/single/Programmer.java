package com.single;

class Employee
{
	float salary = 10000;
}

public class Programmer extends Employee
{
	int bonus = 5000;

	public static void main(String[] args) 
	{
		Programmer p = new Programmer();
		
		System.out.println("Salary is : " + p.salary);
		
		System.out.println("Bonus is : " + p.bonus);
	

	}

}
