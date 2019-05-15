package org.jsp.matrices;

import java.util.Scanner;

public class TraceOfMatrix 
{
	public static void main(String[] args) 
	{
		//Rows and columns for matrix;
		int rows,columns,traceMatrix=0;
		
		//Declaring all possible values from runtime;
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter the rows :");
		rows = scr.nextInt();
		columns = rows;		//Since 'Trace of Matrix' is possible only in square matrix;
		
		System.out.println("ENter the elements of matrix: ");
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
		for(int count=0;count<matrix.length;count++)
		{
			traceMatrix = traceMatrix+matrix[count][count];
		}
		System.out.println("The trace of the given matrix is: "+traceMatrix);
	}
}
