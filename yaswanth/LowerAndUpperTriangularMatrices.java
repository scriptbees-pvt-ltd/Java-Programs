package org.jsp.triangularMatrices;

import java.util.Scanner;

public class LowerAndUpperTriangularMatrices 
{
	public static void main(String[] args) 
	{
		int rows,coloumns,rowLength,coloumnLength;
		
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter the array length for rows: ");
		rowLength = scr.nextInt();
		
		System.out.println("Enter the array length for coloumns: ");
		coloumnLength = scr.nextInt();
		
		System.out.println("Enter the matrix: ");
		int matrix[][] = new int[rowLength][coloumnLength];
		for(int count=0;count<rowLength;count++)
		{
			for(int value=0;value<coloumnLength;value++)
			{
				System.out.println("row ["+count+"] coloumn ["+value+"]: ");
				matrix[count][value]=scr.nextInt();
			}
		}
		
		rows = matrix.length;
		coloumns = matrix[0].length;
		
		if(rows!=coloumns)
		{
			System.out.println("The matrix must be a square matrix");
		}
		else
		{
			System.out.println("Lower triangular matrix: ");
			for(int count=0;count<rowLength;count++)
			{
				for(int value=0;value<coloumnLength;value++)
				{
					if(value>count)
					{
						System.out.print("0"+" ");
					}
					else
					{
						System.out.print(matrix[count][value]+" ");
					}
				}
				System.out.println();
			}
			
			System.out.println("Upper triangular matrix: ");
			for(int count=0;count<rowLength;count++)
			{
				for(int value=0;value<coloumnLength;value++)
				{
					if(count>value)
					{
						System.out.print("0"+" ");
					}
					else
					{
						System.out.print(matrix[count][value]+" ");
					}
				}
				System.out.println();
			}
		}	
	}
}
