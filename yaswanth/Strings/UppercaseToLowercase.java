package org.jsp.strings;

import java.util.Scanner;

public class UppercaseToLowercase 
{
	public static void main(String[] args) 
	{
		String input,output;
		
		//Declaring the input of string in runtime;
		Scanner scr = new Scanner(System.in);
		
		System.out.print("Enter the string: "+"\n"+"Input = ");
		input = scr.nextLine();
		
		output = input.toLowerCase();    //Converting the uppercase letters to lowercase by using methods;
		
		System.out.println("The string from uppercase to lower case: "+output);
	}
}
