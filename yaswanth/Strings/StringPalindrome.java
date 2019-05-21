package org.jsp.strings;

import java.util.Scanner;

public class StringPalindrome 
{	
	public static void main(String[] args) 
	{
		String input,reverseString;
		
		//Declaring the values in the runtime;
		Scanner scr = new Scanner(System.in);
		
		System.out.print("Enter the input: ");
		input = scr.nextLine();
		
		reverseString = "";
		for(int index=input.length()-1;index>=0;index--)
		{
			reverseString = reverseString+input.charAt(index);
		}
		
		if(input.equalsIgnoreCase(reverseString))
			System.out.println("\n"+"The given string is an PALINDROME");
		
		else
			System.out.println("\n"+"The given string is NOT AN PALINDROME");
	}
}
