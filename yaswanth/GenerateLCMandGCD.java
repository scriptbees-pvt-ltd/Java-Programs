package org.jsp.LCMandGCD;

import java.util.Scanner;

public class GenerateLCMandGCD 
{
	public static int gcd(int number1,int number2)
	{
		int gcd;
		while(number1 != number2)
		{
			if(number1>number2)
			{
				number1-= number2;
			}
			else 
			{
				number2-= number1;
			}
		}
		System.out.println("The GCD of two numbers is: "+number1);
		return(number1);
	}
	
	public static int lcm(int  number1,int number2)
	{
		int lcm;
		
		lcm = (number1*number2)/gcd(number1,number2);
		
		System.out.println("The LCM of given two numbers is: "+lcm);
		return(1);
	}
	
	public static void main(String[] args) 
	{
		int number1,number2;
		
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter the number1 value: ");
		number1=scr.nextInt();
		
		System.out.println("Enter the number2 value: ");
		number2=scr.nextInt();
		
		lcm(number1,number2);
	}
}
