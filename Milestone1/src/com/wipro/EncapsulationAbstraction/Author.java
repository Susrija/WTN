package com.wipro.EncapsulationAbstraction;

public class Author 
{
	static String name;
	static String email;
	static char gender;
	Author(String n, String e,char g)
	{
		name=n;
		email=e;
		gender=g;
	}
}
class Book
{
	String name1,author;
	double price;
	int qtyInStock;
	Book(String n1)
	{
		name1=n1;
	}
	public void setPrice()
	{
		price=150;
	}
	public double getPrice()
	{
		return price;
	}
	public void setQtyInStock()
	{
		qtyInStock=50;
	}
	public int getQtyInStock()
	{
		return qtyInStock;
	}
	public String getName()
	{
		return name1;
	}
	public void getAuthor()
	{
		System.out.println("The name of the author is:"+Author.name);
		System.out.println("The email id is:"+Author.email);
		System.out.println("The gender is:"+Author.gender);
	}
}
class Books
{
	public static void main(String args[])
	{
		Book b=new Book("Java Fundamentals");
		Author a=new Author("Susrija Dusanapudi","susrijadusanapudi@gmail.com",'F');
		b.setPrice();
		b.setQtyInStock();
		System.out.println("The name of the book is:"+b.getName());
		System.out.println("The price of the book is:"+b.getPrice());
		System.out.println("The stock is:"+b.getQtyInStock());
		b.getAuthor();
	}
}