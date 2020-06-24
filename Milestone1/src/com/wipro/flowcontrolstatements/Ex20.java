package com.wipro.flowcontrolstatements;

public class Ex20 {
	public static void main(String args[])
	{
		int n=Integer.parseInt(args[0]);
		int num=n;
		int r,rev=0;
		while(n!=0)
		{
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		if(rev==n)
		{
			System.out.println(num +" is a palidrome number");
		}
		else
		{
			System.out.println(num +" is not a palidrome number");
		}
	}
}
