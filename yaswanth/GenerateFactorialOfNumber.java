package org.jsp.factorialNumber;

import java.util.Scanner;

public class GenerateFactorialOfNumber 
{
	public static void main(String[] args) 
	{
		long factorial,number;
		factorial = 1;
		
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		number = scr.nextLong();
		
		System.out.println("The series of the number for factorial is: ");
		for(long count=number;count>=1;count--)
		{
			if(count==1)
			{
				System.out.print(count);
			}
			else
			{
				System.out.print(count+"*");
				factorial = factorial*count;
			}
		}
		System.out.println("\n"+"The factorial for a given number is: "+factorial);
	}
}
