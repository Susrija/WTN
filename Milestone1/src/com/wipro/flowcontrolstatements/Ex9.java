package com.wipro.flowcontrolstatements;

public class Ex9 {
	public static void main(String args[])
	{
		String gender = args[0];
		int age = Integer.parseInt(args[1]);
		if(gender.equalsIgnoreCase("Female") && (age>=1 && age<=58))
		{
				System.out.println("8.2%");
		}
		else if(gender.equalsIgnoreCase("Female") && (age>=59 && age<=100))
		{
			System.out.println("9.2%");
		}
		else if(gender.equalsIgnoreCase("Male") && (age>=1 && age<=58))
		{
			System.out.println("8.4%");
		}
		else if(gender.equalsIgnoreCase("Male") && (age>=59 && age<=100));
	}
}
