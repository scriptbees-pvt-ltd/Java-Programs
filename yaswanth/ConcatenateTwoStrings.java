package org.jsp.stringConcatination;

import java.util.Scanner;

public class ConcatenateTwoStrings 
{
	public static void main(String[] args) 
	{
		String string1,string2,stringConcat;
		
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter the String1: ");
		string1 = scr.nextLine();
		
		System.out.println("Enter the string2: ");
		string2 = scr.nextLine();
		
		stringConcat = string1.concat(string2);
		
		System.out.println("After concatinating two strings: "+stringConcat);
	}
}
