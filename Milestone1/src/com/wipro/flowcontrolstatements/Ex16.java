package com.wipro.flowcontrolstatements;

public class Ex16 {
	public static void main(String args[])
	{
		int l=10,h=99;
		while(l<h)
		{
			boolean flag=false;
			for(int i=2;i<=l/2;i++)
			{
				if(l%i==0)
				{
					flag=true;
					break;
				}
			}
			if(!flag && l!=0 && l!=1)
			{
				System.out.print(l + " ");
			}
			l++;
		}
	}
}
