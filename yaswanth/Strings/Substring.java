package org.jsp.strings;

import java.util.Scanner;

public class Substring 
{
	public static void main(String[] args) 
	{
		String input;
		int startingValue,endingValue;
		
		//Declaring the string in the runtime;
		Scanner scr = new Scanner(System.in);
		
		System.out.print("Enter the input string: ");
		input = scr.nextLine();
		
		System.out.println("The length of the given string is: "+input.length());
		
		System.out.print("Enter the value of substring to be searched within the length: "+"\n"+"Starting value = ");
		startingValue = scr.nextInt();
		System.out.print("Ending value = ");
		endingValue = scr.nextInt();
		
		System.out.println("The substring of given values : "+input.substring(startingValue, endingValue));
		
	}
}
