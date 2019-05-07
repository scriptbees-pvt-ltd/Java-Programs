package org.jsp.arithmeticOperationsOfArray;

import java.util.Scanner;

public class ArithematicOperationsOfTwoArrays 
{
	public static void main(String[] args) 
	{
		int arrayLength,action;
		
		Scanner scr = new Scanner(System.in);
		
		System.out.print("Enter the array length: ");
		arrayLength = scr.nextInt(); 
		int array1[] = new int[arrayLength];
		System.out.print("\n"+"Enter array1 elements according to length given: ");
		for(int count=0;count<=array1.length-1;count++)
		{
			array1[count] = scr.nextInt(); 
		}
		
		int array2[] = new int[arrayLength];
		System.out.print("\n"+"Enter array2 elements according to length given: ");
		for(int count=0;count<=array2.length-1;count++)
		{
			array2[count] = scr.nextInt();
		}
		
		System.out.println("\n"+"Enter the action to be performed: ");
		action = scr.nextInt();
		
		if(action==1)
		{
			System.out.println("The addition of two arrays are: ");
			for(int count=0;count<=array1.length-1;count++)
			{
				int addition[] = new int[arrayLength];
				addition[count] = array1[count]+array2[count];
				System.out.print(addition[count]+" ");
			}
		}
		
		else if (action==2)
		{
			System.out.println("The subtraction of two arrays are: ");
			for(int count=0;count<=array1.length-1;count++)
			{
				int subtraction[] = new int[arrayLength];
				subtraction[count] = array1[count]-array2[count];
				System.out.print(subtraction[count]+" ");
			}
		}
		
		else if (action==3)
		{
			System.out.println("The multiplication of two arrays are: ");
			for(int count=0;count<=array1.length-1;count++)
			{
				int multiplication[] = new int[arrayLength];
				multiplication[count] = array1[count]*array2[count];
				System.out.print(multiplication[count]+" ");
			}	
		}
		
		else if (action==4) 
		{
			System.out.println("The division of two arrays are: ");
			for(int count=0;count<=array1.length-1;count++)
			{
				double division[] = new double[arrayLength];
				division[count] = array1[count]/array2[count];
				System.out.print(division[count]+" ");
			}
		}
	}
}
