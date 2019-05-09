package org.jsp.mergeSortArrays;

import java.util.Scanner;

public class MergeAndSortTheArray 
{
	public static void main(String[] args) 
	{
		int arrayLength1,arrayLength2,arrayLength3,temp,digit;
		digit=0;
		
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter the array length1: ");
		arrayLength1 = scr.nextInt();
		
		System.out.println("Enter the array1 elements: ");
		int array1[] = new int[arrayLength1];
		for(int count=0;count<=array1.length-1;count++)
		{
			array1[count]=scr.nextInt();
		}
		
		System.out.println("Enter the array length2: ");
		arrayLength2 = scr.nextInt();
		
		System.out.println("Enter the array2 elements: ");
		int array2[] = new int[arrayLength2];
		for(int count=0;count<=array2.length-1;count++)
		{
			array2[count]=scr.nextInt();
		}
		
		
		arrayLength3 = arrayLength1+arrayLength2;
		int mergedArray[] = new int[arrayLength3];
		for(int count=0;count<=array1.length-1;count++)
		{
			mergedArray[count] = array1[count];
	        digit++;
		}
		for(int value=0;value<=array2.length-1;value++) 
		{ 
	        mergedArray[digit++] = array2[value];
	    } 
		
		System.out.println("\n"+"The merged array of the two array elements: ");
	    for(int number=0;number<= mergedArray.length-1;number++) 
	    {
	    	System.out.print(mergedArray[number]+" ");
	    } 
	    
	    for(int count=0;count<mergedArray.length;count++)
		{
			for(int value=count+1;value<mergedArray.length;value++)
			{
				if(mergedArray[count]>mergedArray[value])
				{
					temp = mergedArray[count];
					mergedArray[count]=mergedArray[value];
					mergedArray[value]=temp;
				}
			}
		}
		
		System.out.println("\n"+"The sorting of an merged array: ");
		int sortedMergedArray[] = new int[arrayLength3];
		for(int count=0;count<mergedArray.length;count++)
		{
			sortedMergedArray[count] = mergedArray[count];
			System.out.print(sortedMergedArray[count]+" ");
		}
	}
}
