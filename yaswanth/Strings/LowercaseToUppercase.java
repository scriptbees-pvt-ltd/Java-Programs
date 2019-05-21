package org.jsp.strings;

import java.util.Scanner;

public class LowercaseToUppercase 
{
	public static void main(String[] args) 
	{

		String input,output;
		
		//Declaring the input of string in runtime;
		Scanner scr = new Scanner(System.in);
		
		System.out.print("Enter the string: "+"\n"+"Input = ");
		input = scr.nextLine();
		
		output = input.toUpperCase();    //Converting the lowercase letters to uppercase by using methods;
		
		System.out.println("The string from lowercase  to uppercase: "+output);
	}
}
