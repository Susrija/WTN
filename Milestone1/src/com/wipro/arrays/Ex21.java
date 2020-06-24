package com.wipro.arrays;

public class Ex21 {
	public static void main(String args[])
	{
		int[] n = new int[] {1, 2, 3, 4, 5};
		int sum=0;
		double avg=0;
		for(int i=0; i<n.length; i++)
		{
			sum=sum+n[i];
			avg=sum/n.length;
		}
		System.out.println(sum);
		System.out.println(avg);
	}
}
