package org.jsp.simplePrograms;

import java.util.Scanner;

public class PyramidNumber 
{
	public static void main(String[] args) 
	{
		int spaces,rows,numbers;
		numbers = 1;
		Scanner scr = new Scanner(System.in);
		
		System.out.print("Enter the number of rows to be printed: "+"\n"+"rows= ");
		rows = scr.nextInt();
		
		spaces = 50;
		
		for(int count=1;count<=rows;count++)
		{
			for(int value=1;value<=spaces;value++)
			{
				System.out.print(" ");
			}
			for(int digit=1;digit<=numbers;digit++)
			{
				System.out.print(digit+" ");
			}
			System.out.println();
			spaces-=2;
			numbers+=2;
		}
	}
}
