package com.staticbasic;

public class Employe 
{
	private int id;
	private String name;
	private float salary;
	
	public static int totalEmp = 5;
	
	Employe()
	{
		
	}
	
	Employe(int id, String name ,float salary)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
					
	}
	
	public void showDetails(int id,String name,float salary)
	{
		System.out.println(" emp id : " + id);
		System.out.println(" emp name : " + name + " employe no :" + totalEmp);
		System.out.println(" emp salary : " + salary);
	}
	
	
public static void main(String []args)
{
	Employe e1 = new Employe();
	Employe e2 = new Employe();
	Employe e3 = new Employe();
	Employe e4 = new Employe();
	Employe e5 = new Employe();
	
	e1.showDetails(101," pratik ",12000.0f);
	System.out.println("-------///////-----------");
	e2.showDetails(102," suraj ",11000f);
	System.out.println("-------///////-----------");
	e3.showDetails(103," mayur ",13000f);
	System.out.println("-------///////-----------");
	e4.showDetails(104," salman ",11445f);
	System.out.println("-------///////-----------");
	e5.showDetails(105," rahul ",12254f);
	
	
}
}
