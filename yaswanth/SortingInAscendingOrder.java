package org.jsp.ascendingOrder;

import java.util.Scanner;

public class SortingInAscendingOrder
{
	public static void main(String[] args) 
	{
		int arrayLength,temp;
		
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter the length of an array: ");
		arrayLength= scr.nextInt();
		
		System.out.println("Enter the elements of an array: ");
		int array[] = new int[arrayLength];
		for(int count=0;count<array.length;count++)
		{
			array[count] = scr.nextInt(); 
		}
		
		for(int count=0;count<array.length;count++)
		{
			for(int value=count+1;value<array.length;value++)
			{
				if(array[count]>array[value])
				{
					temp = array[count];
					array[count]=array[value];
					array[value]=temp;
				}
			}
		}
		
		System.out.println("The ascending order of an array: ");
		for(int count=0;count<array.length;count++)
		{
			System.out.print(array[count]+" ");
		}
	}
}
