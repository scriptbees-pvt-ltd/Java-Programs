package org.jsp.bubbleSort;

import java.util.Scanner;

public class BubbleSortOfAnArray 
{
	public static void main(String[] args)
	{
		int arrayLength,temp;
		
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter the array length: ");
		arrayLength = scr.nextInt();
		
		System.out.println("Enter the elements of an array: ");
		int array[] = new int[arrayLength];
		for(int count=0;count<=array.length-1;count++)
		{
			array[count] = scr.nextInt();
		}
		
		for(int count=0;count<=array.length-1;count++)
		{
			for(int value=0;value<array.length-1;value++)
			{
				if(array[value]>array[value+1])
				{
					temp = array[value]; 
                    array[value] = array[value+1]; 
                    array[value+1] = temp;
				}
			}
		}
		
		System.out.println("After bubbleSort the elements of array are: ");
		for(int count=0;count<=array.length-1;count++)
		{
			System.out.print(array[count]+" ");
		}
		
	}

}
