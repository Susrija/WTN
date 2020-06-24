package com.wipro.arrays;

public class Ex26 {
	public static void main(String args[])
	{
		int[] a= new int[] {5,9,2,7,2};
		int temp=0;
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-i-1;j++)
			{
			if(a[j]>a[j+1])
					{
						temp=a[j];
						a[j]=a[j+1];
						a[j+1]=temp;
					}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+ " ");
		}
	}
}
