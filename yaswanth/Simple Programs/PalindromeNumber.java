package org.jsp.simplePrograms;

import java.util.Scanner;

public class PalindromeNumber 
{
	public static void main(String[] args) 
	{
		int number,givenNumber,dividedNumber,reverseNumber;
		reverseNumber = 0;
		
		Scanner scr = new Scanner(System.in);
		
		System.out.print("Enter the number: "+"\n"+"Number= ");
		number = scr.nextInt();
		givenNumber = number;
		
		//Calculation for checking whether the given number is palindrome or not;
		while(number>0)
		{
			dividedNumber = number%10;
			reverseNumber = reverseNumber*10+dividedNumber;
			number = number/10;
		}
		System.out.println("After calculating the number is: "+reverseNumber);
		if(givenNumber == reverseNumber)
			System.out.println("The number is PALINDROME");
		else
			System.out.println("The given number is not PALINDROME");
	}
}
