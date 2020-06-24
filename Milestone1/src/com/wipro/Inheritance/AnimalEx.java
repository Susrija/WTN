package com.wipro.Inheritance;
class Animal
{
	void eat()
	{
		System.out.println("eat");
	}
	void sleep()
	{
		System.out.println("sleep");
	}
}
class Bird extends Animal
{
	void fly()
	{
		System.out.println("Bird fly");
	}
}
public class AnimalEx 
{
	public static void main(String args[])
	{
		Bird b=new Bird();
	}
}
