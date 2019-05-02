package org.jsp.sumSequence;

import java.util.Scanner;

public class SumTheSequence 
{
	public static void main(String[] args) 
	{
		float numerator,denominator,sum;
		int maxNumber;
		
		numerator = 1;
		sum=0;
		
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter the number of terms required: ");
		maxNumber = scr.nextInt();
		
		for(denominator = 1;denominator<=maxNumber;denominator++)
		{
			sum = sum + numerator * (1/denominator);
			numerator = -numerator;
		}
		System.out.println("Sum of the Sequence upto "+maxNumber+" terms is: "+sum);
	}
}
