package org.jsp.generateDivisors;

import java.util.Scanner;

public class GenerateDivisorsofInteger 
{
	public static void main(String[] args) 
	{
		int number,minNumber;
		
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		number = scr.nextInt();
		
		System.out.println("Divisors of the number "+number+" are: ");
		
		for(minNumber=1;minNumber<=number;minNumber++)
		{
			if(number%minNumber==0)
			{
				System.out.print(minNumber+" ");
			}
		}
	}
}
