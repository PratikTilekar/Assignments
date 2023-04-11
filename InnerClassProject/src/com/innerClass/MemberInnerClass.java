package com.innerClass;

class Bank
{
	private static String bankName ="HDFC";
	String bankLock;
	int regId;
	
	{
		bankLock = "Pune";
		regId = 101;
	}
	
	void displayBank()
	{
		System.out.println(bankName + " " + bankLock + " " + regId);
	}
	
	class Locker
	{
		int lockerId;
		String customerName;
		static int lockerRent = 1000;
		
		void enterDetails(int lockerId,String customerName)
		{
			this.lockerId=lockerId;
			this.customerName=customerName;
			
			System.out.println("This locker belongs to :" + " " + customerName + " "+ "locker id is :" + " " + lockerId + " "+"Bank name :" +" "+ bankName);
			displayBank();
			
			System.out.println("The rent for the locker is :" + lockerRent);
		}
	}
}

public class MemberInnerClass {

	public static void main(String[] args) 
	{
		Bank b1 = new Bank();
		b1.displayBank();
		
		Bank.Locker lock1 = b1.new Locker();
		lock1.enterDetails(1001, "Pratik");
		
		System.out.println("-----------------//////////////////-------------------");
		
		Bank.Locker lock2 = new Bank().new Locker();
		lock2.enterDetails(1002, "Suraj");
		

	}

}
