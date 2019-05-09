package org.jsp.extractSubstring;

import java.util.Scanner;

public class ExtractSubstringFromString 
{
	public static void main(String[] args) 
	{
		String string;
		int value1,value2;
		
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter the string: ");
		string = scr.nextLine();
		
		System.out.println("Enter the starting index: ");
		value1 = scr.nextInt();
		
		System.out.println("Enter the ending index: ");
		value2 = scr.nextInt();
		
		System.out.println("The substring of string: "+string.substring(value1, value2));
	}
}
