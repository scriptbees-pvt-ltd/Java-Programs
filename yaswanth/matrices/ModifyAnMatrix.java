package org.jsp.matrices;

import java.util.Scanner;

public class ModifyAnMatrix 
{
	public static void main(String[] args) 
	{
		//Here 'm' indicates the modify matrix values;
		int rows,columns,mRows,mColumns;
		
		Scanner scr = new Scanner(System.in);
		
		System.out.print("Enter the rows: ");
		rows = scr.nextInt();
		System.out.print("columns: ");
		columns = scr.nextInt();
		
		//For creating matrix;
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
		
		mRows = 0;
		mColumns = 0;
		
		//For modifying the given matrix;
		int modifyMatrix[][] = new int[rows][columns];
		for(int count=rows-1;count>=0;count--)
		{
			for(int value=columns-1;value>=0;value--)
			{
				modifyMatrix[mRows][mColumns] = matrix[count][value] ;
				++mColumns;
			}
			++mRows;
			mColumns = 0;
		}
		
		//For printing the modified matrix;
		System.out.println("The modified matrix is: ");
		for(int count=0;count<rows;count++)
		{
			for(int value=0;value<columns;value++)
			{
				System.out.print(modifyMatrix[count][value]+" ");
			}
			System.out.println();
		}
	}
}
