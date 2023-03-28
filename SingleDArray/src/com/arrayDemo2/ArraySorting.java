package com.arrayDemo2;

public class ArraySorting {

	public static void main(String[] args) 
	{
		int ar[] = { 5,7,9,8,4,6,1,2,3,10};
		System.out.println(" After sorting : " );
		
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				int temp = 0;
				if(ar[i]>ar[j])
				{
					temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
						
				}
			}
			System.out.print(ar[i] + " ");
		}
		
		

	}

}
