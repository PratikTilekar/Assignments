package com.methodoverride;

class GoldFish extends Fish
{
	public void swim(String name,int gills)
	{
		System.out.println(" gold fish swims fast ");
	}
}

class Whale extends Fish
{
	public void swim(String name,int gills)
	{
		System.out.println(" whale Swims slow ");
	}
}
public class FishTest {

	public static void main(String[] args) 
	{
		Fish fish;
		fish = new GoldFish();
		fish.swim("GoldFish", 4);
		
		fish = new Whale();
	    fish.swim("whale", 8);
		

	}

}
