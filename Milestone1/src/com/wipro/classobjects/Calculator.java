package com.wipro.classobjects;

public class Calculator
{
	static double powerInt(int num1, int num2)
	{
		double r1=Math.pow(num1, num2);
		return  r1;
	}
	static double powerDouble(double num1,int num2)
	{
		double r2=Math.pow(num1, num2);
		return r2;
	}

	public static void main(String args[])
	{
		double r1=Calculator.powerInt(2,3);
		double r2=Calculator.powerDouble(2.3,8);
		System.out.println(r1);
		System.out.println(r2);
	}
}

