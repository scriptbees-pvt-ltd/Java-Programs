package org.jsp.strings;

import java.util.Scanner;

public class StringPosition 
{
	public static void main(String[] args) 
	{
		String input,output;
		int stringLength;
		
		//Declaring the values in runtime;
		Scanner scr = new Scanner(System.in);
		
		System.out.print("Enter the input: ");
		input = scr.nextLine();
		
		stringLength = input.length();
		System.out.println("The length of the given strength is: "+stringLength);
		
		System.out.println("Enter the value to find the position: ");
		output = scr.nextLine();
		
		if(input.contains(output))
			System.out.println("The string is present in original string and the index is: "+input.indexOf(output));
		else
			System.out.println("The entered string is not present in the original string");
				
	}
}
