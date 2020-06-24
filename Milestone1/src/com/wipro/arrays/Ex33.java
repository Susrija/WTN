package com.wipro.arrays;

public class Ex33 {
	public static void main(String args[])
	{
		int a[][]=new int[2][2];
		int arr=0;
		int i;
		int j;
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				arr=Integer.parseInt(args[2*i+j]);
				a[i][j]=arr;
			}
		}
		System.out.println("The given array is:");
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("The rverse of the array is:");
		for(i=1;i>=0;i--)
		{
			for(j=1;j>=0;j--)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();		
		}
	}
}
