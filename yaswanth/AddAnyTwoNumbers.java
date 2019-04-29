package org.jsp.add;

import java.util.Scanner;

public class AddAnyTwoNumbers 
{
	public static void main(String[] args) 
	{
		int firstNumber,secondNumber;
		
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter Fisrt Number value: ");
		firstNumber = scr.nextInt();

		System.out.println("Enter Second Number value: ");
		secondNumber = scr.nextInt();
		
		System.out.println("Addition of any two numbers: "+(firstNumber+secondNumber));
	}
}
