package com.loosecoupling;

import com.demo.MessageService;

class Insta implements MessageService
{
	public void msg()
	{
		System.out.println(" Welcome to insta");
	}
}

class Whatsapp implements MessageService
{
	public void msg()
	{
		System.out.println(" Welcome to whatsapp ");
	}
}

public class MessageTest {

	public static void main(String[] args) 
	{
	  MessageService m;   //// loose coupling
	  m= new Whatsapp();
	  m.msg();
	  
	  m=new Insta();
	  m.msg();
	  
	  System.out.println("--------------/////----------------------");
	  
	  Whatsapp w = new Whatsapp();  /// tight coupling
	  w.msg();
	  
	  Insta i = new Insta();
	  i.msg();
		
		
		

	}

}
