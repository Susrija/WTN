package com.wipro.arrays;

public class Ex32 {
	 public static void main(String args[])
	 {
	  int a[]=new int[args.length/2];
	  int b[]=new int[args.length/2];
	  int[] c = new int[2];
	  int arr;
	  int k = 0;
	  int l1=a.length;
	  int l2=b.length;
	  int i;
	  for(i=0;i<l1;i++)
	  {
	   arr=Integer.parseInt(args[i]);
	   a[i]=arr;
	  }
	  
	  for(i=l1;i<l1+l2;i++)
	  {
	   arr=Integer.parseInt(args[i]);
	   b[k]=arr;
	   k ++;
	  }
	  c[0]=a[1];
	  c[1]=b[1];
	  for(i=0;i<c.length;i++)
	  {
	   System.out.print(c[i]+" ");
	  }
	 }
	}