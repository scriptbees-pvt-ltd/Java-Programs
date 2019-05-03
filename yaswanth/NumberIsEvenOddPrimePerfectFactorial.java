package org.jsp.numberCategory;

import java.util.Scanner;

public class NumberIsEvenOddPrimePerfectFactorial 
{
	public static void main(String[] args) 
	{
		int number,value,count,digit;
		long factorial = 1;
		value = 0;
		digit = 0;
		
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		number = scr.nextInt();
		
		if(number%2==0)
		{
			System.out.println("Given integer is an Even Number");
		}
		else if (number%2!=0) 
		{
			System.out.println("Given integer is Odd Number");
		}
		else if (number!=0 && number!=1) 
		{
			value = number/2;
			for(count=2;count<value;count++)
			{
				if(number%count==0)
				{
					digit = 1;
					break;
				}
			}
			if(digit==0)
			{
				System.out.println("Given integer is an Prime Number");
			}
		}
		else if (number>0)
		{
			for(count=1;count<=number;count++)
			{
				factorial = factorial * count;
			}
		}
	}
}
