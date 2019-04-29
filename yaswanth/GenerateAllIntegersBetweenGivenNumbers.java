package org.jsp.generateIntegers;

import java.util.Scanner;

public class GenerateAllIntegersBetweenGivenNumbers 
{
	public static void main(String[] args) 
	{
		int minNumber,maxNumber,divisor;
		minNumber = 1;
		
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter the maximum number value: ");
		maxNumber = scr.nextInt();
		
		System.out.println("Enter the divisor number value: ");
		divisor = scr.nextInt();
		
		System.out.println("Integers between "+minNumber+" and "+maxNumber+" divisible by "+divisor+" are: ");
		
		for(minNumber=1;minNumber <= maxNumber;minNumber++)
		{
			if(minNumber%divisor==0)
			{
				System.out.print(minNumber+" ");
			}
		}
	}
}
