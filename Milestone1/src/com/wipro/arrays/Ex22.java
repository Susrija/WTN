package com.wipro.arrays;

public class Ex22 {
	public static void main(String args[])
	{
		int n[]=new int[] {1,2,3,4,5};
		int l=n.length;
		int max=n[0],min=n[0];
		for(int i=1;i<l;i++)
		{
			if(n[i]>max)
			{
				max=n[i];            
			}
			else
			{
				min=n[i];
			}
		}
		System.out.println("Max value: "+max);
		System.out.println("Min value: "+min);
	}
}
