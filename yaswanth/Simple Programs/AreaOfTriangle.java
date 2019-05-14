package org.jsp.simplePrograms;

import java.util.Scanner;

public class AreaOfTriangle
{
	public static void main(String[] args) 
	{
		System.out.print("Area of Equilateral triangle: 1"+"\n"+"Area of isosceles triangle: 2"+"\n"+"Area of right angled triangle: 3");
		//Option indicates to select the type of triangle to find the area; 
		double option,side,base,height,area;
		
		Scanner scr = new Scanner(System.in);
		
		System.out.print("\n"+"Select the triangle to find the area: ");
		option = scr.nextDouble();
		
		//Calculating the area of Equilateral triangle;
		if(option ==1)
		{
			System.out.print("Enter the value of the side of triangle: "+"\n"+"Side= ");
			side = scr.nextDouble();
			area = (Math.sqrt(3)/4)*(side*side);
			System.out.println("The area of equilateral triangle is: "+area);
		}
		
		//Calculating the area of Isosceles triangle;
		else if(option == 2)
		{
			System.out.print("Enter the values: "+"\n"+"base= ");
			base = scr.nextDouble();
			System.out.print("height= ");
			height = scr.nextDouble();
			
			area = (base*height)/2;
			System.out.println("The area of an Isosceles triangle is: "+area);
		}
		
		//Calculating the area of right-angled triangle;
		else if(option == 3)
		{
			System.out.print("Enter the values: "+"\n"+"base= ");
			base = scr.nextDouble();
			System.out.print("side= ");
			side = scr.nextDouble();
			
			area = (side*base)/2;
			System.out.println("The area of an right-angled triangle is: "+area);
		}
	}
}
