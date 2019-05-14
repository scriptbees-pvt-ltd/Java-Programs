package org.jsp.simplePrograms;

import java.util.Scanner;

public class CentigradeToFahreneit 
{
	public static void main(String[] args) 
	{
		double celsius,fahreneit,convert;
		
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter the conversion options: ");
		convert = scr.nextDouble();
		
		//Conversion from centigrade to fahreneit;
		if(convert == 1)
		{
			System.out.println("Enter the value in celsius: ");
			celsius = scr.nextDouble();
			
			fahreneit = (celsius*9/5)+32;
			System.out.println("The temperature of centigrade "+celsius+"^o C"+" is converted to "+fahreneit+"^o f fahreneit");
		}
		//conversion from fahreneit to centigrade;
		else if(convert ==2)
		{
			System.out.println("Enter the value in fahreneit: ");
			fahreneit = scr.nextDouble();
			
			celsius = (fahreneit-32)*5/9;
			System.out.println("The temperature of fahreneit "+fahreneit+"^o f"+" is converted to "+celsius+"^o C centigrade.");
		}
	}
}
