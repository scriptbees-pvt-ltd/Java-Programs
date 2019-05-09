package org.jsp.fibonacciSeries;

import java.util.Scanner;

public class FibonacciSeriesByRecursion 
{
	static long number,n1=0,n2=1,n3=0;
	
	public static void fibonacciSeries(long number)
	{	
		if(number>0)
		{	
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);
			fibonacciSeries(number-1);;
		}
	}
	public static void main(String[] args) 
	{	
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter the number to calculate fibonacci series: ");
		number = scr.nextLong();
		
		System.out.print(n1+" "+n2);
		
		fibonacciSeries(number-2);
	}
}
