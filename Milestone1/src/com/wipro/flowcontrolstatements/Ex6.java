package com.wipro.flowcontrolstatements;

public class Ex6 {
	public static void main(String args[])
	{
		int n = args.length;
		if(n==0)
		{
			System.out.println("No Values");
		}
		else
		{
			System.out.print(args[0]);
			for( int i=1;i<n;i++)
			{
				System.out.print(","+args[i]);
			}
		}
	}
}
