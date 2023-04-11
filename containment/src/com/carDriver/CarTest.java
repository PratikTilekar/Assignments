package com.carDriver;

public class CarTest {

	public static void main(String[] args) 
	{
	    Driver d1 = new Driver(101,36," Ramu ");
		Driver d2 = new Driver(102,42," Ramdas ");
		
		Car c1 = new Car("BMW X5 ",2018,d1);
		System.out.println(c1);
		
		System.out.println("-----------////////------------");
		
		Car c2 = new Car("Audi ",2016,d2);
		System.out.println(c2); 
		

	}

}
