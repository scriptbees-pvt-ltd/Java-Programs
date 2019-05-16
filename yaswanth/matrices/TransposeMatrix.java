package org.jsp.matrices;

import java.util.Scanner;

public class TransposeMatrix 
{
	public static void main(String[] args) 
	{
		int rows,columns;
		
		Scanner scr = new Scanner(System.in);
		
		System.out.print("Enter the rows: ");
		rows = scr.nextInt();
		System.out.print("columns: ");
		columns = scr.nextInt();
		
		System.out.println("Enter the elements of matrix: ");
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
		
		if(rows != columns)
		{
			//To achieve the transpose matrix;
			int transposeMatrix[][] = new int[columns][rows];
			for(int count=0;count<columns;count++)
			{
				for(int value=0;value<rows;value++)
				{
					transposeMatrix[count][value] = matrix[value][count];
					System.out.print(transposeMatrix[count][value]+" ");
				}
				System.out.println();
			}
		}
		
		else if(rows == columns)
		{
			System.out.println("The transpose of a given matrix is: ");
			int transposeMatrix[][] = new int[rows][columns];
			for(int count=0;count<rows;count++)
			{
				for(int value=0;value<columns;value++)
				{
					transposeMatrix[count][value] = matrix[value][count];
					System.out.print(transposeMatrix[count][value]+" ");
				}
				System.out.println();
			}
		}
	}
}
