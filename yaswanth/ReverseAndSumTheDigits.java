package org.jsp.reverseSum;

import java.util.Scanner;

public class ReverseAndSumTheDigits 
{
	public static void main(String[] args) 
	{
		long number,reverseValue,sum;
		sum = 0;
		
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		number = scr.nextLong();
		
		System.out.println("The reverse value of the given number: ");
		
		while (number>0)
		{
			reverseValue = number%10;
			System.out.print(reverseValue);
			
			sum = sum+reverseValue;
			number = number/10;
		}
		System.out.println("\n"+"The sum of reversed number is: "+sum);
	}
}
