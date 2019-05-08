package org.jsp.sumTheVector;

import java.util.Scanner;

public class SumPositiveAndNegativeElementsOfVector 
{
	public static void main(String[] args) 
	{
		int arrayLength,digit;
		
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter the array length: ");
		arrayLength =scr.nextInt();
		
		int array[] = new int[arrayLength];
		
		System.out.println("Enter the number of elements according to length: ");
		for(int count=0;count<=array.length-1;count++)
		{
			array[count] = scr.nextInt();
		}
		
		int arrayPositive[] = new int[arrayLength];
		int arrayNegative[] = new int[arrayLength];
		int sum[]=new int[arrayLength];
		
		System.out.println("The positive elements in array: ");
		for(int count=0;count<=array.length-1;count++)
		{
			if(array[count]>0)
			{
				digit = 0;
				arrayPositive[digit]=array[count];
				System.out.print(arrayPositive[digit]+" ");
				digit++;
			}
		}
		
		System.out.println("\n"+"The negative elements in array: ");
		for(int count=0;count<=array.length-1;count++)
		{
			if (array[count]<0) 
			{
				digit=0;
				arrayNegative[digit]=array[count];
				System.out.print(arrayNegative[digit]+" ");
				digit++;
			}
		}
		
		System.out.println("\n"+"The sum of positive and negative elements of an array: ");
		for(int value=0;value<=array.length-1;value++)
		{
			sum[value]=arrayPositive[value]+(arrayNegative[value]);
			System.out.println(sum[value]+" ");
		}
	}
}
