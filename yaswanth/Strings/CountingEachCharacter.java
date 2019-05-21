package org.jsp.strings;

import java.util.Scanner;

public class CountingEachCharacter 
{
	public static void main(String[] args) 
	{
		String input;
		int vowelCount,consonantCount,spacesCount;
		vowelCount = 0;
		consonantCount = 0;
		spacesCount = 0;
		
		//Declaring the values in runtime;
		Scanner scr = new Scanner(System.in);
		
		System.out.print("Enter the input: ");
		input = scr.nextLine();
		
		input = input.toLowerCase();
		
		for(int index=0;index<=input.length()-1;index++)
		{
			if(input.charAt(index) == 'a' || input.charAt(index) == 'e' || input.charAt(index) == 'i' || input.charAt(index) == 'o' || input.charAt(0) == 'u' )												
				vowelCount++;
			
			else if(input.charAt(index) >= 'a' && input.charAt(index) <= 'z') 
				consonantCount++;
			
			else
				spacesCount++;
		}
		
		System.out.println("The number of vowels in a given string is: "+vowelCount);
		System.out.println("THe number of consonants in a given string is: "+consonantCount);
		System.out.println("The number of whitespaces in a given string is: "+spacesCount);
	}
}
