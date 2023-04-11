package com.demo;

class Car implements Movable
{

	public void move() 
	{
		System.out.println(" Car is at speed : " + speed);
		
	}
	
}

class Ball implements Movable
{

	public void move() 
	{
		System.out.println(" Ball is rolling at speed : " + speed);	
	}
	
}

class Athlete implements Movable
{
	public void move()
	{
		System.out.println(" Athlete is running at speed : " + speed);
	}
}
public class MoveTest {

	public static void main(String[] args) 
	{
		Movable m;
		m=new Car();
		m.move();
		
		m=new Ball();
		m.move();
		
		m=new Athlete();
		m.move();
		

	}

}
