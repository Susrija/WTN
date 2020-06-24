package com.wipro.flowcontrolstatements;

public class Ex18 {
	public static void main(String args[])
	{
		int n=Integer.parseInt(args[0]);
		if(args.length==0)
		{
			System.out.println("Please an enter an integer number");
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*  ");
			}
			System.out.println();
		}
	}
}
