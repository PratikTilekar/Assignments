package com.supplierItem;

public class SupplierItemTest 
{

	public static void main(String[] args) 
	{
		Supplier s[] = new Supplier[3];
		
		Item i1[] = new Item[3];
		
		i1[0] = new Item(1,"Apple",80,10);
		i1[1] = new Item(1,"Orange",70,9);
		i1[2] = new Item(1,"Banana",45,11);
		
		s[0] = new Supplier(101,"Pratik",486465656,i1);
		
		Item i2[] = new Item[2];
		i2[0] = new Item(1,"Apple",75,11);
		i2[1] = new Item(1,"Litchi",90,12);
		
		s[1] = new Supplier(102,"Mayur",48646787,i2);
		
		Item i3[] = new Item[2];
		i3[0] = new Item(1,"pear",88,10);
		i3[0] = new Item(1,"Grapes",95,20);
		
		s[2] = new Supplier(102,"Kiran",88446787,i3);
		
		for(Supplier st:s)
		{
			System.out.println(st.getSid()+ " " + st.getSname()+ " " + st.getPhno());
			for(Item i:st.getItem())
			{
				System.out.println(i);
			}
			System.out.println("-------------////////////---------------");
		}
	
		
				

	}

}
