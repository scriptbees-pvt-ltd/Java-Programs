package org.jsp.simplePrograms;

import java.util.Scanner;

public class SimpleInterestAndCompoundInterest 
{
	public static void main(String[] args) 
	{
		//These are the variables used for calculating both Simple Interest and Compound Interest; 
		double n,sum,amount,rateOfInterest,time,principle,simpleInterest,compoundInterest;
		
		//Declaring the values in runtime;
		Scanner scr = new Scanner(System.in);
		
		System.out.print("Enter the values: "+"\n"+"Principle= ");
		principle = scr.nextDouble();
		
		System.out.print("Rate of Interest= ");
		rateOfInterest = scr.nextDouble();
		
		System.out.print("Time= ");
		time = scr.nextDouble();
		
		//System.out.println("n= ");
		//n = scr.nextDouble();
		
		simpleInterest = (principle*rateOfInterest*time)/100;
		System.out.println("The simple interest is: "+simpleInterest);
		//calculation of Compound interest
		sum = 1+(rateOfInterest/100);
		for(double count=1;count<=time;count++)
		{
			if(count ==1)
				sum =sum;
			else 
				sum = sum*sum;
			if(count==time)
			{
				compoundInterest = principle*sum;
				System.out.println("The compound interest is: "+compoundInterest);
			}
		}
	}
}
