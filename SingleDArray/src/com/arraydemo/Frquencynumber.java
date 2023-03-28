package com.arraydemo;


public class Frquencynumber {
	
	public static void countFrequency(int arr[])
	{
		int count;
		for(int i=0;i<arr.length;i++)
		{
			count=1;
			if(arr[i]=='\0')
				continue;
			
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					arr[j]='\0';
				}
			}
			System.out.println(arr[i] + " : ");
		}
			
	}

	public static void main(String[] args) 
	{
		int ar[] = {1,2,3,4,5,6,6,9,7};
		
		
		
		countFrequency(ar);

	}

}
