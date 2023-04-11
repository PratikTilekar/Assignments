package com.employeeDepartment;

public class EmployeeTest {

	public static void main(String[] args) 
	{
		Department d1 = new Department(01," Software engg ");
		Department d2 = new Department(02," Java Devloper ");
		Department d3 = new Department(03," Data analyst ");		
		
		Employee e1 = new Employee(101," Pratik ",400000.00f,d1);
		Employee e2 = new Employee(102," Mayur ",300000.00f,d2);
		Employee e3 = new Employee(103," Mohan ",450000.00f,d3);
		
		System.out.println(e1);
		System.out.println(" -------------------////////////////////-------------------");
		System.out.println(e2);
		System.out.println(" -------------------////////////////////-------------------");
		System.out.println(e3);
	}

}
