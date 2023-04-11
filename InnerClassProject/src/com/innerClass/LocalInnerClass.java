package com.innerClass;
class Outer
{
	private static int data = 10;
	
	void display()
	{
		class LocalInner
		{
			private int value = 20;
			
			static void show1()
			{
				System.out.println(data);
			}
			
			void show2()
			{
				System.out.println(data);
				System.out.println(value);
			}
		}
		
		LocalInner I1 = new LocalInner();
		I1.show2();
		LocalInner.show1();
	}

}

public class LocalInnerClass {

	public static void main(String[] args) 
	{
		Outer o1 = new Outer();
		o1.display();
			

	}

}
