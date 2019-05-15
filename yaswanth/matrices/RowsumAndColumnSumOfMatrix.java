package org.jsp.matrices;

import java.util.Scanner;

public class RowsumAndColumnSumOfMatrix 
{
	public static void main(String[] args) 
	{
		int rows,columns,rowSum=0,coloumnSum=0;
		
		Scanner scr = new Scanner(System.in);
		
		System.out.print("Enter the rows: ");
		rows = scr.nextInt();
		System.out.print("Column: ");
		columns = scr.nextInt();
		
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
		
		//Calculating the row sum of a matrix;
		for(int count=0;count<rows;count++)
		{
			for(int value=0;value<columns;value++)
			{
				rowSum = rowSum + matrix[count][value];
			}
			System.out.println("The sum of the row["+count+"]: "+rowSum);
			rowSum=0;
		}
		
		//Calculating the column sum of a matrix;
		for(int count=0;count<columns;count++)
		{
			for(int value=0;value<rows;value++)
			{
				coloumnSum = coloumnSum + matrix[value][count];
			}
			System.out.println("The sum of the column["+count+"]: "+coloumnSum);
			coloumnSum=0;
		}
	}
}
