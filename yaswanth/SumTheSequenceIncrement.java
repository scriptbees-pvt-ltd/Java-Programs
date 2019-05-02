package org.jsp.sumSequence;

import java.util.Scanner;

public class SumTheSequenceIncrement 
{
	public static void main(String[] args) 
	{
		float numerator,denominator,sum;
		int maxNumber,count,incNumerator,incDenominator;
		
		count = 1;
		sum = 0;
		
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter the number of terms required: ");
		maxNumber = scr.nextInt();
		
		System.out.println("Enter the numerator value: ");
		numerator = scr.nextFloat();
		
		System.out.println("Enter the denominator value: ");
		denominator = scr.nextFloat();
		
		System.out.println("Enter the increment value for numerator: ");
		incNumerator = scr.nextInt();
		
		System.out.println("Enter the increment value for denominator: ");
		incDenominator = scr.nextInt();
		
		for(count = 1;count<=maxNumber;count++)
		{
				sum = sum + (numerator/denominator);
				numerator = numerator + incNumerator;
				denominator = denominator + incDenominator;
				numerator = numerator * (-1);
		}
		System.out.println("Sum of the Sequence upto "+maxNumber+" terms is: "+sum);
	}
}