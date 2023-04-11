package com.object;

class MyStack
{
	int top;
	int size;
	int stk[];
	
	MyStack()
	{
		
	}
	
	MyStack(int size)
	{
		top=-1;
		this.size=size;
		
		stk = new int[this.size];
	}
	
	void push(int data)
	{
		if(top<size-1)
		{
			top++;
			stk[top]=data;
			System.out.println("Elements inserted :" + data);
		}
		else
		{
			System.out.println("Over flow situation");
		}
	}
	
	void pop()
	{
		if(top!=1)
		{
			System.out.println("Elements deleted :" + stk[top]);
			top--;
		}
		else
		{
			System.out.println("Underflow Situation");
		}
	}
}

public class StackAsArray {

	public static void main(String[] args) {
		

	}

}
