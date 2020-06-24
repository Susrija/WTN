package com.wipro.arrays;

public class Ex27 {
	public static void main(String args[])
	{
		int[] a= new int[] {5,9,2,5,7,2};
		int n,i,j;
		n=a.length;
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					a[j]=a[n-1];
					n--;
					j--;
				}
			}
		}
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
	}
}
