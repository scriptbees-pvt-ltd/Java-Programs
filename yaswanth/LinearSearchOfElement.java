package org.jsp.linearSearch;

import java.util.Scanner;

public class LinearSearchOfElement 
{
	public static void main(String[] args) 
	{
		int element,arrayLength,index;
		
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter the array length: ");
		arrayLength = scr.nextInt();
		
		System.out.println("Enter the array elements: ");
		int array[] = new int[arrayLength];
		for(int count=0;count<=array.length-1;count++)
		{
			array[count]=scr.nextInt();
		}
		
		System.out.println("Enter the element to be searched: ");
		element = scr.nextInt();
		
		for(int count=0;count<=array.length-1;count++)
		{
			if(array[count]==element)
			{
				index = count;
				System.out.println("The given element "+element+" found at an index: "+(index+1));
			}
		}
	}
}
