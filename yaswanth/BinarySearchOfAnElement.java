package org.jsp.binarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchOfAnElement 
{
	public static void main(String[] args) 
	{
		int arrayLength,element,index;
		
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter the length of an array: ");
		arrayLength = scr.nextInt();
		
		System.out.println("Enter the elements of an array: ");
		int array[] = new int[arrayLength];
		for(int count=0;count<=array.length-1;count++)
		{
			array[count] = scr.nextInt();
		}
		
		Arrays.sort(array);
		
		System.out.println("Enter the element for a binary search: ");
		element = scr.nextInt();
		
		index = Arrays.binarySearch(array, element);
		
		if(index>=0)
		{
			System.out.println(element+" is found at index: "+index);
		}
		else 
		{
			System.out.println(element+" is not found in an array");
		}
	}
}
