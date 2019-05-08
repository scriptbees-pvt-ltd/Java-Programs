package org.jsp.DiffrenceInArray;

import java.util.Scanner;

public class LargerAndSmallerDifferenceInArray 
{
	public static int secondSmallestNumber(int array[],int number )
	{
		int temp;
		for(int count=0;count<=array.length-1;count++)
		{
			for(int value=0;value<=array.length-1;value++)
			{
				if(array[count]<array[value])
				{
					temp = array[count];
					array[count]=array[value];
					array[value]=temp;
				}
			}
		}
		number = array[1];
		return(number);
	}
	public static void main(String[] args) 
	{
		int arrayLength,largerNumber,smallerNumber;
		
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter the array length value: ");
		arrayLength = scr.nextInt();
		
		System.out.println("Enter the value in array: ");
		int array[] = new int[arrayLength];
		for(int count=0;count<=array.length-1;count++)
		{
			array[count] = scr.nextInt();
		}
		largerNumber = array[0];
		for(int count=0;count<=array.length-1;count++)
		{
			if(array[count]>largerNumber)
			{
				largerNumber=array[count];
			}
		}
		smallerNumber = array[0];
		for(int count=0;count<=array.length-1;count++)
		{
			if(array[count]<smallerNumber)
			{
				smallerNumber=array[count]; 
			}
		}
		System.out.println("The largest difference in given array elements is: "+(largerNumber-smallerNumber));
		
		
		System.out.println("The smallest difference in given array elemnets is: "+(secondSmallestNumber(array, arrayLength)-smallerNumber));
	}
}
