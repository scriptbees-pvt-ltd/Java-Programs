package org.jsp.simplePrograms;

import java.util.Scanner;

public class LargestOfThreeNumbers 
{
	public static void main(String[] args) 
	{
		int largestNumber;
		
		//Declaring the values to array from runtime with static length;
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter the array elements: ");
		int array[] = new int[3];
		for(int count=0;count<3;count++)
		{
			array[count] = scr.nextInt();
		}
		largestNumber = array[0];
		for(int count=0;count<3;count++)
		{
			if(array[count] > largestNumber)
			{
				largestNumber = array[count];
			}	
		}
		System.out.println("The largest number among three numbers is: "+largestNumber);
	}
}
