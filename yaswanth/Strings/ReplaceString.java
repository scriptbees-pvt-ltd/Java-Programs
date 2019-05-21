package org.jsp.strings;

import java.util.Scanner;

public class ReplaceString
{
	public static void main(String[] args) 
	{
		String input,replaceString,changeString,output;
		
		//Declaring the values in runtime;
		Scanner scr = new Scanner(System.in);
		
		System.out.print("Enter the input string: ");
		input = scr.nextLine();
		System.out.print("Enter the replace string: ");
		replaceString = scr.nextLine();
		System.out.print("Enter the change string: ");
		changeString = scr.nextLine();
		
		output = input.replace(replaceString, changeString);
		
		System.out.print("After replacing the string is: "+output);
		
	}
}
