package org.jsp.largeNumberEvenOdd;

import java.util.Scanner;

public class FindingLargerNumberEvenOrOdd 
{
	public static void main(String[] args) 
	{
		int arrayLength,largerNumber;
		
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter the array length: ");
		arrayLength = scr.nextInt();
		
		int array[] = new int[arrayLength];
		System.out.println("Enter the array elements according to length: ");
		for(int count=0;count<=array.length-1;count++)
		{
			array[count] = scr.nextInt();
		}
		
		largerNumber = array[0];
		for(int count=0;count<array.length-1;count++)
		{
			if(array[count]>largerNumber)
			{
				 largerNumber = array[count];
			}
			
		}
		System.out.println("the larger number in array is: "+largerNumber);
		
		if(largerNumber%2==0)
		{
			System.out.println("The larger element of an array is EVEN NUMBER ");
		}
		else
		{
			System.out.println("The larger element of an array is ODD NUMBER ");
		}
	}
}

