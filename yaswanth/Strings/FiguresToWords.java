package org.jsp.strings;

import java.util.Scanner;

public class FiguresToWords 
{
	//Initializing the variables as static such that we can use hose in all methods;
	static int figures,key;
	
	//Method to reverse a number in order to acquire given figures in words;
	public static void reverseNumber(int value)
	{
		value = 0;
		while(figures>0)
		{
			value = value*10;
			value = value+figures%10;
			figures = figures/10;
		}
		word(value);
	}
	
	//Method to convert given figures into words using switch statement;
	public static void word(int number)
	{
		while(number>0)
		{
			key = number%10;
			number = number/10;

			switch (key) 
			{
				case 0:
					System.out.print("zero"+" ");
					break;
				
				case 1:
					System.out.print("one"+" ");
					break;
				
				case 2:
					System.out.print("two"+" ");
					break;
				
				case 3:
					System.out.print("three"+" ");
					break;
				
				case 4:
					System.out.print("four"+" ");
					break;
				
				case 5:
					System.out.print("five"+" ");
					break;
				
				case 6:
					System.out.print("six"+" ");
					break;
				
				case 7:
					System.out.print("seven"+" ");
					break;
					
				case 8:
					System.out.print("eight"+" ");
					break;
					
				case 9:
					System.out.print("nine"+" ");
					break;

				default:
					break;
			}
		}
	}
	public static void main(String[] args) 
	{
		//Declaring the values from runtime;
		Scanner scr = new Scanner(System.in);
		
		System.out.print("Enter the input in figures: ");
		figures = scr.nextInt();
	
		if(figures == 0)
			System.out.println("zero");
		else
			reverseNumber(figures);
	}
}
