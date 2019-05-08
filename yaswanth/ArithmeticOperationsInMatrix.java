package org.jsp.ArithmeticOperationsMatrix;

import java.util.Scanner;

public class ArithmeticOperationsInMatrix 
{
	public static void main(String[] args) 
	{
		int rows1,coloumns1,rows2,coloumns2,rowLength,coloumnLength,operation;
		
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter the array length for rows: ");
		rowLength = scr.nextInt();
		
		System.out.println("Enter the array length for coloumns: ");
		coloumnLength = scr.nextInt();
		
		System.out.println("Enter the matrix1: ");
		int matrix1[][] = new int[rowLength][coloumnLength];
		for(int count=0;count<rowLength;count++)
		{
			for(int value=0;value<coloumnLength;value++)
			{
				System.out.println("row ["+count+"] coloumn ["+value+"]: ");
				matrix1[count][value]=scr.nextInt();
			}
		}
		
		System.out.println("Enter the matrix2: ");
		int matrix2[][] = new int[rowLength][coloumnLength];
		for(int count=0;count<rowLength;count++)
		{
			for(int value=0;value<coloumnLength;value++)
			{
				System.out.println("row ["+count+"] coloumn["+value+"]: ");
				matrix2[count][value]=scr.nextInt();
			}
		}
		
		System.out.println("Enter thr arithmetic operation value that should be performed: ");
		operation = scr.nextInt();
		
		rows1 = matrix1.length;
		coloumns1 = matrix1[0].length;
		
		rows2 = matrix2.length;
		coloumns2 = matrix2[0].length;
		
		if(operation==1)
		{
			int add[][] = new int[rowLength][coloumnLength];
			
			for(int count=0;count<rowLength;count++)
			{
				for(int value=0;value<coloumnLength;value++)
				{
					add[count][value] = matrix1[count][value]+matrix2[count][value];
				}
			}
			System.out.println("Addition Of two matrices: ");
			for(int count=0;count<rowLength;count++)
			{
				for(int value=0;value<coloumnLength;value++)
				{
					System.out.print(add[count][value]+" ");
				}
				System.out.println();
			}
		}
		
		if(operation==2)
		{
			int diff[][] = new int[rowLength][coloumnLength];
			
			for(int count=0;count<rowLength;count++)
			{
				for(int value=0;value<coloumnLength;value++)
				{
					diff[count][value] = matrix1[count][value]-matrix2[count][value];
				}
			}
			System.out.println("Subtraction Of two matrices: ");
			for(int count=0;count<rowLength;count++)
			{
				for(int value=0;value<coloumnLength;value++)
				{
					System.out.print(diff[count][value]+" ");
				}
				System.out.println();
			}
		}
		
		if(operation==3)
		{
			if(coloumns1 != rows2)
			{
				System.out.println("Matrices cannot be Multiplied");
			}
			else
			{	
				int product[][] = new int[rowLength][coloumnLength];
				
				for(int count=0;count<rows1;count++)
				{
					for(int value=0;value<coloumns2;value++)
					{
						for(int digit=0;digit<rows2;digit++)
						{
							product[count][value] = product[count][value]+(matrix1[count][digit]*matrix2[digit][value]);
						}
					}
				}
				System.out.println("Multiplication Of two matrices: ");
				for(int count=0;count<rows1;count++)
				{
					for(int value=0;value<coloumns2;value++)
					{
						System.out.print(product[count][value]+" ");
					}
					System.out.println();
				}
			}
		}
		
		if(operation==4)
		{
			int division[][] = new int[rowLength][coloumnLength];
			
			for(int count=0;count<rowLength;count++)
			{
				for(int value=0;value<coloumnLength;value++)
				{
					division[count][value] = matrix1[count][value]/matrix2[count][value];
				}
			}
			System.out.println("Division Of two matrices: ");
			for(int count=0;count<rowLength;count++)
			{
				for(int value=0;value<coloumnLength;value++)
				{
					System.out.print(division[count][value]+" ");
				}
				System.out.println();
			}
		}
	}
}
