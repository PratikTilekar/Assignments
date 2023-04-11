package com.customException;

public class InsufficiantBalanceException extends Exception
{
	public InsufficiantBalanceException() 
	{
	
	}
	
	public InsufficiantBalanceException(String msg)
	{
		super(msg);
	}

}
