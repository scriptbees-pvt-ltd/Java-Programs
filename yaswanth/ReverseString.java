package org.jsp.reverseString;

import java.util.Scanner;

public class ReverseString 
{
	public static void main(String[] args) 
	{
		String string,reverseString;
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter the string: ");
		string = scr.next();
		
		reverseString = "";
		
		for(int count=string.length()-1;count>=0;count--)
		{
			reverseString = reverseString+string.charAt(count);
		}
		System.out.println("\n"+"The reversed String: "+"\n"+reverseString);
	}
}
