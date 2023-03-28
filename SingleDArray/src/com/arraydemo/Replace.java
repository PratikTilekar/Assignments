package com.arraydemo;

public class Replace 
{
	public static void replace(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
			{
				arr[i]=0;
			}
				
		}
	}
	
	public static void printArray(int arr[])
	{
		for(int i:arr)
		{
			System.out.print(i + " ");
		}
		System.out.println();
	}
	

	public static void main(String[] args) 
	{
		int ar[] = {-4,5,-7,8};
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]);
		}
		System.out.println(" Before replacing ");
		printArray(ar);
		
		System.out.println("---------////////---------");
		
		replace(ar);
		System.out.println(" After replacing ");
		printArray(ar);

	}

}
