package com.wipro.flowcontrolstatements;

public class Ex8 {
	public static void main(String args[])
	{
		char ch = '/';
		if((ch>96 && ch<123) || (ch>64 && ch<91))
		{
			System.out.println("Alphabet");
		}
		else if(ch>47 && ch<58)
		{
			System.out.println("Digit");
		}
		else
		{
			System.out.println("Special Character");
		}
	}
}
