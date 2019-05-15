package org.jsp.matrices;

import java.util.Scanner;

public class SumOfAllNonDiagonalElements 
{
	public static void main(String[] args) 
	{
		int rows,columns,sum=0;
		
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter the rows: ");
		rows = scr.nextInt();
		columns = rows;  //since the diagonal occurs only in square matrix;
		
		System.out.println("Enter the matrix elements: ");
		int matrix[][] = new int[rows][columns];  
		for(int count=0;count<rows;count++)
		{
			for(int value=0;value<columns;value++)
			{
				System.out.print("row ["+count+"] coloumn ["+value+"]: ");
				matrix[count][value] = scr.nextInt();
			}
			System.out.println();
		}
		
		//Adding all the non diagonal elements;
		for(int count=0;count<rows;count++)
		{
			for(int value=0;value<columns;value++)
			{
				if(count != value)
				{
					sum = sum+matrix[count][value];
				}
			}
		}
		System.out.println("The addition of all non diagonal matrix of elements is: "+sum);
	}
}
