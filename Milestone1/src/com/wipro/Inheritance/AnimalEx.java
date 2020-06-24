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
	void eat()
	{
		System.out.println("overriden eat");
	}
	void sleep()
	{
		System.out.println("overriden sleep");
	}
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
		Animal a =new Animal();
		b.eat();
		b.sleep();
		b.fly();
		a.eat();
		a.sleep();
	}
}
