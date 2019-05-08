package org.jsp.mergeTwoArrays;

import java.util.Scanner;

public class MergeTwoSortedArrays 
{
	public static void main(String[] args) 
	{
		int arrayLength1,arrayLength2,arrayLength3,temp1,temp2,digit;
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
		
		System.out.println("Enter the array length1: ");
		arrayLength2 = scr.nextInt();
		
		System.out.println("Enter the array2 elements: ");
		int array2[] = new int[arrayLength2];
		for(int count=0;count<=array2.length-1;count++)
		{
			array2[count]=scr.nextInt();
		}
		
		for(int count=0;count<array1.length;count++)
		{
			for(int value=count+1;value<array1.length;value++)
			{
				if(array1[count]>array1[value])
				{
					temp1 = array1[count];
					array1[count]=array1[value];
					array1[value]=temp1;
				}
			}
		}
		
		System.out.println("The sorted array of an array1: ");
		int sortedArray1[] = new int[arrayLength1];
		for(int count=0;count<array1.length;count++)
		{
			sortedArray1[count] = array1[count];
			System.out.print(sortedArray1[count]+" ");
		}
		
		for(int count=0;count<array2.length;count++)
		{
			for(int value=count+1;value<array2.length;value++)
			{
				if(array2[count]>array2[value])
				{
					temp2 = array2[count];
					array2[count]=array2[value];
					array2[value]=temp2;
				}
			}
		}
		
		System.out.println("\n"+"The sorted array of an array2: ");
		int sortedArray2[] = new int[arrayLength2];
		for(int count=0;count<array2.length;count++)
		{
			sortedArray2[count] = array2[count];
			System.out.print(sortedArray2[count]+" ");
		}
		
		arrayLength3 = arrayLength1+arrayLength2;
		int mergedArray[] = new int[arrayLength3];
		for(int count=0;count<=sortedArray1.length-1;count++)
		{
			mergedArray[count] = sortedArray1[count];
	        digit++;
		}
		for(int value=0;value<=sortedArray2.length-1;value++) 
		{ 
	        mergedArray[digit++] = sortedArray2[value];
	    } 
		
		System.out.println("\n"+"The merged array after sorting the two array elements: ");
	    for(int number=0;number<= mergedArray.length-1;number++) 
	    {
	    	System.out.print(mergedArray[number]+" ");
	    } 
	}
}
