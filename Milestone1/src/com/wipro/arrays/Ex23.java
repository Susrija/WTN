package com.wipro.arrays;

public class Ex23 {
	public static void main(String args[])
	{
		int a[]=new int[] {2,8,6,7,3};
		int n=Integer.parseInt(args[0]);
		int flag=0,i;
		for(i=0;i<a.length;i++)
		{
			if(a[i]==n)
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println(i);
		}
		else
		{
			System.out.println("-1");
		}
		
	}
}
