package org.jsp.findingAreas;

import java.util.Scanner;

public class NewtonRaphsonsMethod 
{
	public static void main(String[] args) 
	{
		/*Declaring the variables according to the roots of eqaution;
		 * Here a,b,c are the co-efficients and cube,square,single are powers of the co-efficients;
		 * 'x' indicates the number of iterations should be done;
		 * 'd' indicates the constant number without any co-efficients and powers;
		 */
		double x0,x;
		int a,b,c,d,a1,b1,c1,d1,cube,square,single,operation;
		//values are powers;
		cube = 3;
		square = 2;
		single = 1;
		
		//Declaring the values for co-efficients through runtime;
		Scanner scr = new Scanner(System.in);
		
		//operation indicates the performance of powers of roots;
		System.out.println("Enter the value for the operation to be performed: ");
		operation = scr.nextInt();
		
		if(operation == 1)
		{
			System.out.print("Enter the values for the co-efficients: "+"\n"+"a= ");
			a=scr.nextInt();
			System.out.print("b= ");
			b=scr.nextInt();
			System.out.print("c= ");
			c=scr.nextInt();
			
			System.out.println("Enter the iterations value should be done: ");
			x0=scr.nextDouble();
			
			System.out.println("The equation of the roots is: "+a+"(x^2)+"+b+"(x)+"+c+" with the approximations "+x0);
			
			//Differentiating the equation for once;
			a1=square*a;
			b1=single*b;
			System.out.println("After derivation the equation is: "+a1+"(x)+"+b1);
			
			/*Calculating in NewtonRaphson's Method in order to acquire roots;
			 * This method is an iterative process; 
			 */
			for(int count=1;count<=x0;count++)
			{
				x = (x0)-(((a*x0*x0)+(b*x0)+c)/((a1*x0)+b));
				if(x == x0)
				{
					System.out.println("The root of the equation is: "+x);
				}
				x0=x;
			}
		}
		
		if(operation == 2)
		{
			System.out.print("Enter the values for the co-efficients: "+"\n"+"a= ");
			a=scr.nextInt();
			System.out.print("b= ");
			b=scr.nextInt();
			System.out.print("c= ");
			c=scr.nextInt();
			System.out.print("d= ");
			d=scr.nextInt(); 
			
			System.out.println("Enter the iterations value should be done: ");
			x0=scr.nextDouble();
			
			System.out.println("The equation of the roots is: "+a+"(x^3)+"+b+"(x^2)+"+c+"(x)+"+d+" with the approximations "+x0);
			
			//Differentiating the equation for once;
			a1=cube*a;
			b1=square*b;
			c1=single*c;
			System.out.println("After derivation the equation is: "+a1+"(x^2)+"+b1+"(x)+"+c1);
			
			/*Calculating in NewtonRaphson's Method in order to acquire roots;
			 * This method is an iterative process; 
			 */
			for(int count=1;count<=x0;count++)
			{
				x = ((x0)-(((a*x0*x0*x0)+(b*x0*x0)+(c*x0)+d)/((a1*x0*x0)+(b*x0)+c1)));
				if(x == x0)
				{
					System.out.println("The root of the equation is: "+x);
				}
				else if(count == x0)
				{
					System.out.println("the root of the equation is: "+x);
				}
				System.out.println(x);
				x0=x;
			}
		}
	}
}
