package org.jsp.meanAndMedian;

import java.util.Scanner;

public class StandardDeviation 
{
	public static void main(String[] args) 
	{
		double standardDeviation,sum;
		int arrayLength,mean,distance;
		mean = 0;
		sum=0;
		
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter the array length: ");
		arrayLength = scr.nextInt();
		
		System.out.println("Enter the array elements: ");
		int array[] = new int[arrayLength];
		for(int count=0;count<=array.length-1;count++)
		{
			array[count] = scr.nextInt();
		}
		
		for(int count=0;count<=array.length-1;count++)
		{
			mean = mean+array[count];
		}
		mean = mean/arrayLength;
		System.out.println("The mean of the array elements is: "+mean);
		
		System.out.println("The square distance of each point to mean are: ");
		int squareDistance[] = new int[arrayLength];
		for(int count=0;count<=array.length-1;count++)
		{
			distance = array[count] - mean;
			squareDistance[count] = distance*distance;
			System.out.print(squareDistance[count]+" ");
		}
		
		for(int count=0;count<=squareDistance.length-1;count++)
		{
			sum = sum+squareDistance[count];
		}
		sum = sum/arrayLength;
		standardDeviation = Math.sqrt(sum);
		System.out.println("The standard deviation of given data is: "+standardDeviation);
	}
}
