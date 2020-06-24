package com.wipro.Inheritance;

public class Employee extends Person
{
	private double annual_salary;
	private int year;
	private String ins_num;
	public Employee(String n,double a,int  y,String i)
	{
		super(n);
		annual_salary=a;
		year=y;
		ins_num=i;
	}
	public double getAnnual_salary() {
		return annual_salary;
	}
	public void setAnnual_salary(double annual_salary) {
		this.annual_salary = annual_salary;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getIns_num() {
		return ins_num;
	}
	public void setIns_num(String ins_num) {
		this.ins_num = ins_num;
	}
	public String toString()
	{
		return super.toString()+" "+annual_salary+" "+year+" "+ins_num;
	}
}
