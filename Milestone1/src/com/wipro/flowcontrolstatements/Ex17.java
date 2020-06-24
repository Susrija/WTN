package com.wipro.flowcontrolstatements;

public class Ex17 {
	public static void main(String args[])
	{
		long n=Integer.parseInt(args[0]);
		long sum;
		for(sum=0;n!=0;n=n/10)
		{
			sum=sum+n%10;
		}
		System.out.println(sum);
	}
}
