package org.jsp.paternString;

import java.util.Scanner;

public class MatchThePatternString 
{
	public static void main(String[] args) 
	{
		String string,stringSearch;
		
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter the string: ");
		string = scr.nextLine();
		
		System.out.println("Enter the string to search: ");
		stringSearch = scr.nextLine();
		
		if(string.contains(stringSearch))
		{
			System.out.println(string.indexOf(stringSearch));
		}
		else
		{
			System.out.println("The string search doesn't match the string.");
		}
	}
}
