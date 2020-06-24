package com.wipro.arrays;

public class Ex28 {
	public static void main(String args[])
	{
		int[] a=new int[] {1,2,6,5,4,7,8,9};
		int flag=0,sum=0;
		int n=a.length;
		for(int i=0;i<n;i++)
		{
			if(a[i]==6)
				flag=1;
			if(flag==1)
			{
				if(a[i]==7)
					flag=0;
				continue;
			}
			else
			{
				if(a[i]==7)
					sum=sum+a[i]+6;
				else
					sum=sum+a[i];
			}
		}
		System.out.println("Total: "+sum);
	}
}
