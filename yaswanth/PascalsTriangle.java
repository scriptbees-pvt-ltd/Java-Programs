package org.jsp.pascalsTriangle;

import java.util.Scanner;

public class PascalsTriangle 
{
	public static void main(String[] args) 
	{
		int rows,number,count,value,digit;
		
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter the number of rows: ");
		rows = scr.nextInt();
		
		for(count=0;count<rows;count++)
		{
			for(value=rows;value>count;value--)
			{
				System.out.print(" ");
			}
			number = 1;
			for(digit=0;digit<=count;digit++)
			{
				System.out.print(number+" ");
				number = number * (count - digit)/(digit + 1);
			}
			System.out.println();
		}
	}
}
