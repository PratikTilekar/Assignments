package com.methodoverride;

class Player 
{
	void display()
	{
		System.out.println(" i am a player ");
	}

}

class HockeyPlayer extends Player
{
	void display()
	{
		System.out.println(" i am a Hockey player ");
	}
}

public class DynamcMethodOverridingDemo {

	public static void main(String[] args) 
	{
		Player p;
		p=new Player();
		p.display();
		
		p=new HockeyPlayer();
		p.display();
		

	}

}
