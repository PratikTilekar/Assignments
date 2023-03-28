package com.basics;

public class Teacher 
{
	private String name;
	private int salary;
	private int age;
	private float experience;



public void acceptDetails(String name,int salary,int age,float experience)
{
	this.name = name;
	this.salary = salary;
	this.age = age;
	this.experience = experience;
}

public void showDetails()
{
	System.out.println(name+" "+salary+" "+age+" "+experience+" ");
	
}

public static void main(String []args)
{
	Teacher t1 = new Teacher();
	t1.acceptDetails("sunil", 120000, 35, 5.3f);
	
	Teacher t2 = new Teacher();
	t2.acceptDetails(" Punam ", 100000, 30, 4.4f);
	
	
	t1.showDetails();
	t2.showDetails();
			
}






	}
