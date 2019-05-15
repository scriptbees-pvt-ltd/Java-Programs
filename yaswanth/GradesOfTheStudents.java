package org.jsp.mergeSortArrays;

import java.util.Scanner;

public class GradesOfTheStudents 
{
	public static void percentages()
	{
		
	}
	public static void main(String[] args) 
	{
		double percentage1,percentage2,percentage3,percentage;
		int numberOfSubjects,totalEachSubject1,totalEachSubject2,totalEachSubject3,test1Total,test2Total,test3Total,grandTotal;
		test1Total = 0;
		test2Total = 0;
		test3Total = 0;
		
		//Declaring the values through runtime;
		Scanner scr = new Scanner(System.in);
		
		System.out.print("Number of subjects=  ");
		numberOfSubjects = scr.nextInt();
		
		System.out.println("Enter the test1 marks: ");
		int test1Marks[] = new int[numberOfSubjects];
		for(int count=0;count<=test1Marks.length-1;count++)
		{
			test1Marks[count] = scr.nextInt();
			test1Total = test1Total+test1Marks[count];
		}
		System.out.println("The total marks scored in test1: "+test1Total);
		
		System.out.println("Enter the test2 marks: ");
		int test2Marks[] = new int[numberOfSubjects];
		for(int count=0;count<=test2Marks.length-1;count++)
		{
			test2Marks[count] = scr.nextInt();
			test2Total = test2Total+test2Marks[count];
		}
		System.out.println("The total marks scored in test2: "+test2Total);
		
		System.out.println("Enter the test3 marks: ");
		int test3Marks[] = new int[numberOfSubjects];
		for(int count=0;count<=test1Marks.length-1;count++)
		{
			test3Marks[count] = scr.nextInt();
			test3Total = test3Total+test3Marks[count];
		}
		System.out.println("The total marks scored in test1: "+test3Total);
		
		//Calculating the percentages;
		System.out.println("Total marks of the each subject for test1: ");
		totalEachSubject1 = scr.nextInt();
		
		grandTotal = (numberOfSubjects)*(totalEachSubject1);
		percentage1 = (test1Total*100)/grandTotal;
		System.out.println("The percentage in test1 is: "+percentage1);
		
		System.out.println("Total marks of the each subject for test2: ");
		totalEachSubject2 = scr.nextInt();
		
		grandTotal = numberOfSubjects*totalEachSubject2;
		percentage2 = (test2Total*100)/grandTotal;
		System.out.println("The percentage in test2 is: "+percentage2);
		
		System.out.println("Total marks of the each subject for test1: ");
		totalEachSubject3 = scr.nextInt();
		
		grandTotal = numberOfSubjects*totalEachSubject3;
		percentage3 = (test3Total*100)/grandTotal;
		System.out.println("The percentage in test1 is: "+percentage3);
		percentage = (percentage1+percentage2+percentage3)/3;
		
		if(percentage>=90 && percentage<=100 )
			System.out.println("The grade is 'A'");
		else if(percentage>=80 && percentage<90)
			System.out.println("The grade is 'B'");
		else if(percentage>=70 && percentage<80)
			System.out.println("The grade is 'C'");
		else if(percentage>=60 && percentage<70)
			System.out.println("The grade is 'D'");
		else if(percentage>=50 && percentage<60)
			System.out.println("The grade is 'E'");
		else if(percentage<50)
			System.out.println("The grade is 'F'");
				
	}
}
