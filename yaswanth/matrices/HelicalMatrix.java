package org.jsp.matrices;

import java.util.Scanner;

public class HelicalMatrix 
{
	public static void main(String[] args) 
	{
		int rows,columns,rowStarting,columnStarting;
		rowStarting = 0;
		columnStarting = 0;
		
		Scanner scr = new Scanner(System.in);
		
		System.out.print("Enter the rows: ");
		rows = scr.nextInt();
		System.out.print("column: ");
		columns = scr.nextInt();
		
		//Getting the elements of matrix array from runtime;
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
		
		//Solving and printing the matrix helically;
		while(rowStarting<rows && columnStarting<columns)
		{
			for(int count=columnStarting;count<columns;count++)
			{
				System.out.print(matrix[rowStarting][count]+", ");
			}
			rowStarting++;
			
			for(int count=rowStarting;count<rows;count++)
			{
				System.out.print(matrix[count][columns-1]+", ");
			}
			columns--;
			
			if(rowStarting<rows)
			{
				for(int count=columns-1;count>=columnStarting;count--)
				{
					System.out.print(matrix[rows-1][count]+", ");
				}
				rows--;
			}
			
			if(columnStarting<columns)
			{
				for(int count=rows-1;count>=rowStarting;--count)
				{
					System.out.print(matrix[count][columnStarting]+", ");
				}
				columnStarting++;
			}
			
		}
	}
}
