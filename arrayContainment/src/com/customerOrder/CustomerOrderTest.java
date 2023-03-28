package com.customerOrder;

public class CustomerOrderTest {

	public static void main(String[] args) 
	{
		Customer c[] = new Customer[3];
		
		Order o1[] = new Order[3];
		
		o1[0] = new Order(101, "Sweet", 5);
		o1[1] = new Order(102, "Fruits", 10);
		o1[2] = new Order(103,"Vegitables",8);
		
		c[0] = new Customer("Pratik", o1);
		
		Order o2[] = new Order[2];
		o2[0] = new Order(101, "Sweet", 10);
		o2[1] = new Order(102,"Vegitable",5);
		
		c[1] = new Customer("Suraj", o2);
		
		Order o3[] = new Order[2];
		o3[0] = new Order(102, "Fruits",15);
		o3[1] = new Order(103,"Vegitables",10);
		
		c[2] = new Customer("Sahili", o3);
		
		for(Customer c1:c)
		{
			System.out.println(c1);
		}
		
				
		
		
	
		

	}

}
