package org.jsp.strings;

import java.util.Scanner;

public class InsertString 
{
	public static void main(String[] args) 
	{
		String input,insertString,output;
		int insertIndex;
		
		//Declaring the values in runtime;
		Scanner scr = new Scanner(System.in);
		
		System.out.print("Enter the values: "+"\n"+"Input String = ");
		input = scr.nextLine();
		System.out.print("Enter the string to be inserted: ");
		insertString = scr.nextLine();
		System.out.print("Enter the index where string is to be iserted: "+"\n"+"Index = ");
		insertIndex = scr.nextInt();
		
		output = input.substring(0, insertIndex+1) +  insertString + input.substring(insertIndex+1);
		
		System.out.println("The string after inserting a substring is: "+output);
		
	}
}
