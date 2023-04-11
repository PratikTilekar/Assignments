package com.Wrapper;

public class Boxing {

	public static void main(String[] args) 
	{
		byte b = 100;
		Byte B = new Byte(b);
		System.out.println(B);
		
		short s = 88;
		Short S = new Short(s);
		System.out.println(S);
		
		int i = 10;
		Integer I = new Integer(i);
		System.out.println(I);
		
		long l = 100000;
		Long L = new Long(l);
		System.out.println(L);
		
		float f = 80.00f;
		Float F = new Float(f);
		System.out.println(F);
		
		double d = 100.00;
		Double D = new Double(d);
		System.out.println(D);
		
		boolean bln = true;
		Boolean Bln = new Boolean(bln);
		System.out.println(Bln);
		
		char c = 'C';
		Character C = new Character (c);
		System.out.println(C);
		
		

	}

}
