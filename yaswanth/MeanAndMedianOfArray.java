package org.jsp.meanAndMedian;

import java.util.Scanner;

public class MeanAndMedianOfArray 
{
	public static void main(String[] args) 
	{
		int arrayLength,temp,value1,value2,median;
		float sum,mean;
		sum = 0;
		
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter the array length: ");
		arrayLength = scr.nextInt();
		
		System.out.println("Enter the array elements: ");
		int array[] = new int[arrayLength];
		for(int count=0;count<=array.length-1;count++)
		{
			array[count] = scr.nextInt();
			sum = sum+(array[count]);
		}

		System.out.println("The mean for a given array elements is:"+"\n"+"mean = "+sum/arrayLength);
		
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
		int ascendingOrder[] = new int[arrayLength];
		for(int count=0;count<array.length;count++)
		{
			ascendingOrder[count] = array[count];
			System.out.print(ascendingOrder[count]+" ");
		}
		
		if(arrayLength%2==0)
		{
			value1 = arrayLength/2;
			value2 = value1--;
			System.out.println("\n"+"The median of given array elements are: "+ascendingOrder[value1]+","+ascendingOrder[value2]);
		}
		else
		{
			value1 = arrayLength/2;
			System.out.println("\n"+"The median of given array elements is: "+ascendingOrder[value1]);
		}
	}
}
