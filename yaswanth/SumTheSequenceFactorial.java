package org.jsp.sumSequence;

import java.util.Scanner;

public class SumTheSequenceFactorial 
{
	public static void main(String[] args) 
	{
		float numerator,denominator,sum,factorial;
		int maxNumber,count,incNumerator;
		
		factorial =1;
		count = 1;
		sum = 1;
		
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter the number of terms required: ");
		maxNumber = scr.nextInt();
		
		System.out.println("Enter the numerator value: ");
		numerator = scr.nextFloat();
		
		System.out.println("Enter the denominator value: ");
		denominator = scr.nextFloat();
		
		System.out.println("Enter the increment value for numerator: ");
		incNumerator = scr.nextInt();
		
		for(count = 1;count<=maxNumber;count++)
		{		
			for(denominator = denominator;denominator > 0;denominator-- )
			{
				factorial = factorial * denominator;
			}
				denominator = denominator + factorial;
				sum = sum + (numerator/denominator);
				denominator++;
				numerator = numerator + incNumerator;
				factorial = 1;
		}
		System.out.println("Sum of the Sequence upto "+maxNumber+" terms is: "+sum);

	}
}
