package org.jsp.matrices;

import java.util.Scanner;

public class InverseMatrix 
{
	public static void main(String[] args) 
	{
		int rows,columns,option,temp;
		double determinant,adjacent=1;
		
		Scanner scr = new Scanner(System.in);
		
		//Creating selection option for performing an action;
		System.out.print("OPTION =1 for 2x2 matrix or OPTION=2 for 3x3 matrix"+"\n"+"Select any option: ");
		option = scr.nextInt();
		//Performs the action for 2x2 matrix;
		if(option == 1)
		{
			//Declaring the length of rows and columns;
			System.out.print("Enter the rows: ");
			rows = scr.nextInt();
			System.out.print("columns: ");
			columns = scr.nextInt();
			
			System.out.println("Enter the elements of matrix(2x2): ");
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
			
			//Finding the determinant of the given matrix;
			determinant = matrix[0][0]*matrix[1][1]-matrix[0][1]*matrix[1][0];
			determinant = 1/determinant;
			System.out.println("The determinant value: "+determinant);
			//Interchanging the diagonal elements in order to find the inverse of the matrix; 
			//Interchange between 'a' and 'd';
			temp = matrix[0][0];
			matrix[0][0] = matrix[1][1];
			matrix[1][1] = temp;
			//Interchange between 'b' and 'c';
			temp = matrix[0][1];
			matrix[0][1] = -1*matrix[1][0];
			matrix[1][0] = -1*temp;
			
			//Now finding the inverse of matrix by multiplying the matrix elements with determinant;
			System.out.println("The inverse matrix of given matrix is: ");
			double inverseMatrix[][] = new double[rows][columns];
			for(int count=0;count<rows;count++)
			{
				for(int value=0;value<columns;value++)
				{
					inverseMatrix[count][value] = determinant*matrix[count][value];
					System.out.print(inverseMatrix[count][value]+" ");
				}
				System.out.println();
			}
		}
		
		//Performs the action for 3x3 matrix;
		if(option == 2)
		{
			System.out.print("Enter the rows: ");
			rows = scr.nextInt();
			System.out.print("columns: ");
			columns = scr.nextInt();
			
			System.out.println("Enter the elements of matrix(3x3): ");
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
			
			//Finding the determinant of the given matrix;
			double column1,column2,column3;
			column1 = matrix[0][0]*(matrix[1][1]*matrix[2][2] - matrix[2][1]*matrix[1][2]);
			column2 = matrix[0][1]*(matrix[1][0]*matrix[2][2] - matrix[2][0]*matrix[1][2]);
			column3 = matrix[0][2]*(matrix[1][0]*matrix[2][1] - matrix[2][0]*matrix[1][1]);
			
			determinant = column1-column2+column3;
			System.out.println("The determinant of the given matrix is: "+determinant);
			//Finding transpose of a given matrix;
			System.out.println("\n"+"The transpose matrix of the given matrix is: ");
			double transposeMatrix[][] = new double[rows][columns];
			for(int count=0;count<rows;count++)
			{
				for(int value=0;value<columns;value++)
				{
					transposeMatrix[count][value] = matrix[value][count];
					System.out.print(transposeMatrix[count][value]+"  ");
				}
				System.out.println();
			}
			
			//Finding the determinant of each 2x2 minor matrices of transpose matrix;
			double row[][] = new double[rows][columns];
			row[0][0] = (transposeMatrix[1][1]*transposeMatrix[2][2]) - (transposeMatrix[2][1]*transposeMatrix[1][2]);
			row[0][1] = (transposeMatrix[1][0]*transposeMatrix[2][2]) - (transposeMatrix[2][0]*transposeMatrix[1][2]);
			row[0][2] = (transposeMatrix[1][0]*transposeMatrix[2][1]) - (transposeMatrix[2][0]*transposeMatrix[1][1]);
			row[1][0] = (transposeMatrix[0][1]*transposeMatrix[2][2]) - (transposeMatrix[2][1]*transposeMatrix[0][2]);
			row[1][1] = (transposeMatrix[0][0]*transposeMatrix[2][2]) - (transposeMatrix[2][0]*transposeMatrix[0][2]);
			row[1][2] = (transposeMatrix[0][0]*transposeMatrix[2][1]) - (transposeMatrix[2][0]*transposeMatrix[0][1]);
			row[2][0] = (transposeMatrix[0][1]*transposeMatrix[1][2]) - (transposeMatrix[1][1]*transposeMatrix[0][2]);
			row[2][1] = (transposeMatrix[0][0]*transposeMatrix[1][2]) - (transposeMatrix[1][0]*transposeMatrix[0][2]);
			row[2][2] = (transposeMatrix[0][0]*transposeMatrix[1][1]) - (transposeMatrix[1][0]*transposeMatrix[0][1]);
			
			//Printing the matrix that is obtained from finding the determinant of the transpose matrix;
			System.out.println("\n"+"The matrix that is obtained after finding the determinant of the transpose matrix: ");
			for(int count=0;count<rows;count++)
			{
				for(int value=0;value<columns;value++)
				{
					System.out.print(row[count][value]+"  ");
				}
				System.out.println();
			}
			
			//Finding the adjacent of the obtained modified transpose matrix;
			System.out.println("\n"+"The adjacent matrix of the obtained matrix is: ");
			double adjacentMatrix[][] = new double[rows][columns];
			for(int count=0;count<rows;count++)
			{
				for(int value=0;value<columns;value++)
				{
					adjacentMatrix[count][value] = row[count][value]*adjacent;
					System.out.print(adjacentMatrix[count][value]+"  ");
					adjacent = -1*adjacent;
				}
				System.out.println();
			}
			
			//Finding the inverse of the given matrix;
			System.out.println("\n"+"The inverse of the given matrix is: ");
			double inverseMatrix[][] = new double[rows][columns];
			for(int count=0;count<rows;count++)
			{
				for(int value=0;value<columns;value++)
				{
					inverseMatrix[count][value] = (1/determinant)*adjacentMatrix[count][value];
					System.out.print(inverseMatrix[count][value]+"  ");
				}
				System.out.println();
			}
 		}
	}
}
