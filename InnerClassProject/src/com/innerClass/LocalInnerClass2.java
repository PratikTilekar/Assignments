package com.innerClass;

class Mall
{
	private static String mallName = "Amanora";
	private String location = "Pune";
	
	void doShopping()
	{
		class Cart
		{
			String item;
			float price;
			float totalBill;
			
			public void addBill(String item,float price)
			{
				this.item=item;
				this.price=price;
				System.out.println(this.item + " :" + this.price);
				totalBill += this.price;
			}
			
			public void displayBill()
			{
				System.out.println("=========VISIT AGAIN==============");
				System.out.println("Thanks for shopping at :" +" "+mallName + "|" + "Location :" + location);
				System.out.println("Your total bill is :" + totalBill);
			}
		}
		Cart c1 = new Cart();
		c1.addBill("PS5", 50000f);
		c1.addBill("Shoes", 2000f);
		c1.addBill("Bag", 500f);
		c1.displayBill();
	}
}

public class LocalInnerClass2 {

	public static void main(String[] args) 
	{
		Mall m = new Mall();
		m.doShopping();
		
	}

}
