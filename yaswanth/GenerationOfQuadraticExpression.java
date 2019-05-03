package org.jsp.quadraticExpression;

import java.util.Scanner;

public class GenerationOfQuadraticExpression 
{
	public static void main(String[] args) 
	{
		double  x,y,a,b,c,d,interceptX,interceptY;
		x = 0;
		y = 0;
		
		System.out.println("Type the co-efficient values for quadratic expression: ");
		
		Scanner scr  = new Scanner(System.in);
		
		System.out.println("Enter the 'x-square' coefficient 'a' value: ");
		a = scr.nextFloat();
		
		System.out.println("Enter the 'x' coefficient 'b' value: ");
		b = scr.nextFloat();
		
		System.out.println("Enter the constant 'c' value: ");
		c = scr.nextFloat();
		
		d = (b*b)-(4*a*c);
		
		if(a==0)
		{
			System.out.println("Equation is Linear"+"\n"+"Roots = "+(-c/b));
		}
		else if (d==0)
		{
			x = (-b)/(2*a);
			System.out.println("Roots are real and equal"+"\n"+"Roots are: x = "+x+"; y = "+x);
		}
		else if (d>0)
		{
			x = ((-b)+(Math.sqrt(d)))/(2*a);
			y = ((-b)-(Math.sqrt(d)))/(2*a);
			System.out.println("Roots are real and unequal"+"\n"+"Roots are: x = "+x+"; y = "+y);
		}
		else if (d<0)
		{
			interceptX = (-b)/(2*a);
			d = (-d);
			interceptY = Math.sqrt(d)/(2*a);
			System.out.println("Roots are unequal and Imaginary"+"\n"+"Roots are: x = "+interceptX+"+j "+interceptY+"; y = "+interceptX+"-j "+interceptY);
		}	
	}
}
