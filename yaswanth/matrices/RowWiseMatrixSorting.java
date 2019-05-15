package org.jsp.matrices;

import java.util.Scanner;

public class RowWiseMatrixSorting 
{
	public static void main(String[] args) 
	{
		int rows,columns,temp;
		
		Scanner scr = new Scanner(System.in);
		
		System.out.print("Enter the rows: ");
		rows = scr.nextInt();
		System.out.print("columns: ");
		columns = scr.nextInt();
		
		//Defining the matrix;
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
		
		//Performing the Row wise sorting of a matrix;
		for(int count=0;count<rows;count++)
		{   
			for(int value=0;value<columns;value++)
			{
				if(matrix[count][value]>matrix[count][value])
				{
					temp = matrix[count][value];
					matrix[count][value] = matrix[count][value+1];
					matrix[count][value+1] = temp;
				}
			}
		}
		
		//Printing the swapped matrix;
		System.out.println("The sorted matrix: ");
		int swapMatrix[][] = new int[rows][columns];
		for(int count=0;count<rows;count++)
		{   
			for(int value=count+1;value<columns;value++)
			{
				swapMatrix[count][value] = matrix[count][value];
				System.out.print(swapMatrix[count][value]+" ");
			}
			System.out.println();
		}
	}
}
