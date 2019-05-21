package org.jsp.matrices;

import java.util.Scanner;

public class MagicSquareMatrix 
{
	public static void main(String[] args) 
	{
		int rows,columns,sum1,sum2,sum3,sum4;
		sum1 = 0; sum2=0; sum3=0; sum4=0;
		
		Scanner scr = new Scanner(System.in);
		
		System.out.print("Enter the"+"\n"+"rows: ");
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
		
		//Finding the sum of diagonals;
		//Diagonal 1:
		for(int count=0;count<rows;count++)
			sum1 = sum1+matrix[count][count];
		
		//Diagonal 2:
		for(int count=0;count<rows;count++)
		{
			sum2 = sum2+matrix[count][rows-1-count];
		}
		
		//Validating the diagonals sum;
		if(sum2 != sum1)
			System.out.println("The given matrix is not a MAGIC SQUARE");
		else
		{
			//Finding the sum of rows;
			for(int count=0;count<rows;count++)
			{
				for(int value=0;value<columns;value++)
				{
					sum3 = sum3+matrix[count][value];
				}
				if(sum3 != sum1)
					System.out.println("The given matrix is not a MAGIC SQUARE");
				else
				{
					//Finding the sum of columns;
					for(int digit=0;digit<rows;digit++)
					{
						for(int value=0;value<columns;value++)
						{
							sum4 = sum4+matrix[value][digit];
						}
					}
				}
			}
			if(sum4 == sum1)
				System.out.println("The given matrix is an MAGIC SQUARE");
		}
	}
}
