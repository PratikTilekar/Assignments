package com.pojo;

import java.util.Scanner;

public class Student 
{
	String name;
	public int id;
	private float score;
	
public Student(String name,int id,float score)
   {
// constructor
	this.name = name;
	this.id = id;
	this.score = score;
	}

//getter method
public String getName()	
{
	return name;
}

public int getId()
{
	return id;
}

public float getScore()
{
	return score;
}

public String toString()
{
	return " name :"+ name + " "+" id: "+ id+" " + " score "+score + " ";
	
}

public static void main(String []args)
{
	Scanner sc = new Scanner(System.in);
	
	Student s1 = new Student(" Pratik ",47,85.63f);
	System.out.println(s1);
	
	System.out.println("--------------////-----------------");
	
			
	Student s2 = new Student(" Akash ",23,88.27f);
	System.out.println(s2);
	
	
			
			
	
}

	
}
