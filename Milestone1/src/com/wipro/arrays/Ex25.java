package com.wipro.arrays;

public class Ex25 {
	public static void main(String args[])
	{
		int[] a=new int[] {1,2,3,4,5,6,7,8,9,10};
		int max1,max2,min1,min2,i;
		max1=max2=Integer.MIN_VALUE;
		min1=min2=Integer.MAX_VALUE;
		for(i=0;i<a.length;i++)
		{
			if(a[i]>max1)
			{
				max2=max1;
				max1=a[i];
			}
			else if(a[i]>max2)
			{
				max2=a[i];
			}
		}
		for(i=0;i<a.length;i++)
		{
			if(a[i]<min1)
			{
				min2=min1;
				min1=a[i];
			}
			else if(a[i]<min2)
			{
				min2=a[i];
			}
		}
		System.out.println("MAX1: "+max1+ " MAX2: "+max2);
		System.out.println("MIN1: "+min1+ " MIN2: "+min2);
	}
}
