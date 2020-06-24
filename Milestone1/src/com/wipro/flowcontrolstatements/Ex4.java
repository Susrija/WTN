package com.wipro.flowcontrolstatements;

public class Ex4 {
	public static void main(String args[])
	{
		int n;
		n=Integer.parseInt(args[0]);
		if(n>0)
		{
			System.out.println("Positive");
		}
		else if(n<0)
		{
			System.out.println("Negative");
		}
		else
		{
			System.out.println("Zero");
		}
	}
}
