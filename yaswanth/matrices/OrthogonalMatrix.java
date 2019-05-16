package org.jsp.matrices;

import java.util.Scanner;

public class OrthogonalMatrix 
{
	public static void main(String[] args) 
	{
		int rows,columns,elementMatrix,dummy=1;
		
		Scanner scr = new Scanner(System.in);
		
		System.out.print("Enter the rows: ");
		rows = scr.nextInt();
		System.out.print("columns: ");
		columns = scr.nextInt();
		
		//Getting the matrix elements from runtime;
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
		
		//Declaring the identity matrix according to the length of the given matrix;
		int identityMatrix[][] = new int[rows][columns];
		for(int count=0;count<rows;count++)
		{
			for(int value=0;value<columns;value++)
			{
				if(count == value)
					identityMatrix[count][value] = 1;
				else
					identityMatrix[count][value] = 0;
			}
		}
		//Printing identity matrix;
		System.out.println("The Identity matrix acording to the length of given matrix is: ");
		for(int count=0;count<rows;count++)
		{
			for(int value=0;value<columns;value++)
			{
				System.out.print(identityMatrix[count][value]+" ");
			}
			System.out.println();
		}
		
		//Finding the transpose of a matrix;
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
		
		//Finding the product of given matrix and transpose matrix;
		int productMatrix[][] = new int[rows][columns];
		for(int count=0;count<rows;count++)
		{
			for(int value=0;value<columns;value++)
			{
				for(int digit=0;digit<matrix.length;digit++)
				{
					productMatrix[count][value] =  productMatrix[count][value]+(matrix[count][digit]*transposeMatrix[digit][value]);           
				}
			}
		}
		
		//Printing the product of two matrices;
		System.out.println("The product of the given matrix and transpose matrix is: ");
		for(int count=0;count<rows;count++)
		{
			for(int value=0;value<columns;value++)
			{
				System.out.print(productMatrix[count][value]+" ");
			}
			System.out.println();
		}
		
		elementMatrix = rows*columns;
		//Comparing the product matrix with identity matrix in order to know whether it is orthogonal matrix or not;
		for(int count=0;count<rows;count++)
		{
			for(int value=0;value<columns;value++)
			{
				if(productMatrix[count][value] == identityMatrix[count][value])
					dummy++;
				if(dummy == elementMatrix)
					System.out.println("The given matrix is an orthogonal matrix.");
			}
			if(dummy >= 1 && dummy<elementMatrix)
				System.out.println("The given matrix is not an orthogonal matrix");
		}		
	}
}
