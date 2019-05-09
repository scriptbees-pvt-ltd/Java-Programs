package org.jsp.replaceSubString;

import java.util.Scanner;

public class ReplaceSubstringOfaString 
{
	public static void main(String[] args) 
	{
		String string,replaceString,oldValue,newValue;
		
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter the string: ");
		string = scr.nextLine();
		
		System.out.println("Enter the string that has to change: ");
		oldValue = scr.next();
		
		System.out.println("Enter the string that has to be changed: ");
		newValue = scr.next();
		
		replaceString = string.replaceAll(oldValue, newValue);
		
		System.out.println("The replaced string: "+replaceString);
	}
}
