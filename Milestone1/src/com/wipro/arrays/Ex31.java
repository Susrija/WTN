package com.wipro.arrays;

public class Ex31 {
	public static void main(String args[])
	{
		int a[]=new int[args.length];
		int arr;
		int i;
		boolean flag=true;
		int temp=0;
		for(i = 0 ; i < args.length ; i ++)
		  {
		    arr = Integer.parseInt(args[i]);
		    a[i] = arr;
		  }
		for(i=0;i<a.length;i++)
		{
			if(a[i]==4 || a[i]==1)
			{
				temp=0;
			}
			else
			{
				temp=1;
				break;
			}
		}
		if(temp==0)
		{
			System.out.println(flag);
		}
		else
		{
			flag=false;
			System.out.println(flag);
		}
		
	}
}
