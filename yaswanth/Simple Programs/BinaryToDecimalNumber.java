package org.jsp.simplePrograms;

import java.util.Scanner;

public class BinaryToDecimalNumber 
{
	public static void main(String[] args) 
	{
		long binaryNumber,decimalNumber,dividedNumber;
		decimalNumber = 0;
		
		Scanner scr = new Scanner(System.in);
		
		System.out.print("Enter the value: "+"\n"+"BinaryNumber= ");
		binaryNumber = scr.nextLong();
		
		for(int count=1;count>0;count*=2)
		{
			dividedNumber = binaryNumber%10;
			decimalNumber = decimalNumber+(dividedNumber*count);
			binaryNumber = binaryNumber/10;
		}
		System.out.println("The decimal number of given binary number is: "+decimalNumber);
	}
}
