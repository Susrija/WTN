package com.wipro.arrays;

public class Ex34 {
	public static void main(String args[])
	{
		int a[][]=new int[3][3];
		int arr=0;
		int i;
		int j;
		int max=0;
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				arr=Integer.parseInt(args[a.length*i+j]);
				a[i][j]=arr;
			}
		}
		System.out.println("3*3 Matrix:");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				if(a[i][j]>max)
				{
					max=a[i][j];
				}
			}
		}
		System.out.println("Maximum value:"+max);
	}
}

