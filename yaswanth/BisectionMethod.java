package org.jsp.findingAreas;

import java.util.Scanner;

//Finding the roots of equation using Bisection Method;

public class BisectionMethod 
{
	public static void main(String[] args) 
	{
		/*'x' and 'y' values indicates the intervals of the equation;
		 * 'f_x1' and 'f_y1' indicates the functions of 'a' and 'b';
		 * 'a', 'b' and 'c' indicates the co-efficients of the equation ax^2+bx+c;
		 * 'm' indicates the midpoint of roots and 'epsilon' is the least number;
		 */
		double a,b,x,y,c,f_x,f_y,m,f_m;
		final double epsilon = 0.01;
		
		//Declaring the values in runtime;
		Scanner scr = new Scanner(System.in);
		
		System.out.print("Enter the co-efficient values: "+"\n"+"a= ");
		a = scr.nextDouble();
		
		System.out.print("b= ");
		b = scr.nextDouble();
		
		System.out.print("c= ");
		c = scr.nextDouble();
		
		System.out.print("Enter the intervals of the equation: "+"\n"+"x= ");
		x = scr.nextDouble();
		
		System.out.print("y= ");
		y = scr.nextDouble();
		
		//After declaring the values, printing the equation with intervals;
		System.out.println("The equation is "+a+"x^2+"+(b)+"x+"+(c)+" with the intervals "+"("+x+","+y+")");
		
		//Substituting the intervals in the equation;
		f_x = (a*x*x)+(b*x)+c;
		f_y = (a*y*y)+(b*y)+c;
		
		//Calculating the midpoint and finding roots;
		while( (y-x) > epsilon)
		{ 
			m = (y-x)/2;
			f_m = (a*m*m)+(b*m)+c;  //Substituting 'm' in the equation;
			if(f_m<0)
			{
				x = m;  //If f_m<0 then we are replacing the 'a' value with 'm';
			}
			else if (f_m>0) 
			{
				y = m;  //If f_m>0 then we are replacing the 'b' value with 'm';
			}
			System.out.println("Interval: ["+x+", "+y+"]"); //Printing the progress;
		}
		System.out.println("The root of the given equation using Bisection Method is: "+(x+y)/2);
	}
}
