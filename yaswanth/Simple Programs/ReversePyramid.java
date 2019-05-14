package org.jsp.simplePrograms;

import java.util.Scanner;

public class ReversePyramid 
{
	public static void main(String[] args) 
	{
		int spaces,rows,numbers;
		Scanner scr = new Scanner(System.in);
		
		System.out.print("Enter the number of rows to be printed: "+"\n"+"rows= ");
		rows = scr.nextInt();
		
		spaces = 1;
		numbers = 2*rows-1;
		
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
			spaces+=2;
			numbers-=2;
		}
	}
}
