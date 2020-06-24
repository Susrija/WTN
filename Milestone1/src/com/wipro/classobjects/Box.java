package com.wipro.classobjects;

public class Box 
{
	double w,h,d;
	Box(double width,double height,double depth)
	{
		w=width;
		h=height;
		d=depth;
	}
	double volume()
	{
		double v;
		v=w*h*d;
		return v;
	}
	public static void main(String args[])
	{
		Box b = new Box(46,78,52);
		double v=b.volume();
		System.out.println(v);
	}
}
