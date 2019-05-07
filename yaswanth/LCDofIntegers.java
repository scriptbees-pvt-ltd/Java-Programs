package org.jsp.lcdOfIntegers;

import java.util.Scanner;

public class LCDofIntegers 
{
	static int gcd(int number1,int number2)
	{
		while(number1 != number2)
		{
			if(number1>number2)
			{
				number1-= number2;
			}
			else
			{
				number2-=number1;
			}
		}
		return(number1);
	}
	
	static int lcm(int number1,int number2)
	{
		int lcm = (number1 * number2)/gcd(number1,number2);
		return(lcm);
	}
	
	static int lcd(int numerator1,int denominator1,int numerator2,int denominator2)
	{
		int lcd = lcm(denominator1,denominator2);
		System.out.println("The LCD of an given two integer fractions is: "+lcd);
		
		numerator1 *=(lcd/denominator1); 
		numerator2 *=(lcd/denominator2);
		
		System.out.println("\n"+"After finding LCD the fractions are: "+numerator1+"/"+lcd+", "+numerator2+"/"+lcd);
		return(0);
	}
	
	public static void main(String[] args) 
	{
		int numerator1,denominator1,numerator2,denominator2;
		
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter the First fraction: ");
		numerator1 = scr.nextInt();
		denominator1 = scr.nextInt();
		
		System.out.println("Enter the Second fraction: ");
		numerator2 = scr.nextInt();
		denominator2 = scr.nextInt();
		
		lcd(numerator1,denominator1,numerator2,denominator2);
	}
}
