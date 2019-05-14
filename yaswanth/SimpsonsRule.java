package org.jsp.findingAreas;

import java.util.Scanner;

public class SimpsonsRule 
{
	public static void main(String[] args) 
	{
		/*Let's declare the values according to Simpson's 1/3^rd Rule;
		 * 'a' and 'b' indicates limits and 'h' indicates the equal distance between each points;
		 * 'n' indicates number of terms, 'x' and 'y' indicates the functional terms;
		 * 'sum1' and 'sum2' indicates the sum of extremes and sum of remaining terms;
		 * extremes --> sum of starting and ending values of 'y';
		 */
		double a,b,n,h,x,y,sum1,sum2=0,sum3=0,area;
		
		//Getting the possible values from runtime;
		Scanner scr = new Scanner(System.in);
		
		System.out.print("Enter the value of limits: "+"\n"+"a= ");
		a = scr.nextDouble();
		
		System.out.print("b= ");
		b = scr.nextDouble();
		
		System.out.print("\n"+"Enter the value of number of terms: "+"n= ");
		n = scr.nextDouble();
		//If 'n' is not given from runtime then the value of 'n' is;
		if(n == 0)
		{
			n = b-a;
		}
		
		//Calculating 'h' value;
		h = (b-a)/n;
		
		/*Declaring array length and storing the 'x' terms in an array;
		 *The array length should be equal to number of terms;
		 */
		double array[] = new double[(int) n+1];
		System.out.print("\n"+"The 'x' term elements are: "+"\n"+"x[]= ");
		for(int count=0;count<=n;count++)
		{
			array[count] = a;
			System.out.print(array[count]+" ");
			a = a+h; 
		}
		
		/*Finding the 'y' terms using the given function;
		 * Substituting 'x' terms in function;
		 */
		double yArray[] = new double[(int) n+1];
		System.out.print("\n\n"+"The 'y' term elements are: "+"\n"+"y[]= ");
		for(int count=0;count<=n;count++)
		{
			yArray[count] = 1/(Math.sqrt(1+(array[count]*array[count])));  
			System.out.print(yArray[count]+" ");
		}
		
		//Calculating the area using Simpson's Rule;
		sum1 = yArray[0]+yArray[(int) (n)];
		for(int count=1;count<=n-1;count+=2)
		{
			sum2 = sum2+yArray[count];
		}
		for(int count=2;count<=n-1;count+=2)
		{
			sum3 = sum3+yArray[count];
		}
		//The area for the given function;
		
		area = (h*(sum1+(4*sum2)+(2*sum3)))/3;
		
		System.out.println("\n\n"+"The area for the given function ∫(1/(√1+x^2*))*dx is: "+"\n"+"Area= "+area);
	}
}
