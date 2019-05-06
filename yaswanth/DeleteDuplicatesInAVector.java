package org.jsp.duplicatesInVector;

import java.util.Vector;

public class DeleteDuplicatesInAVector 
{
	public static void removeDuplicates(Vector input)
	{
		for(int count=0;count<input.size();count++)
		{
			for(int value=0;value<input.size();value++)
			{
				if(count != value)
				{
					if(input.elementAt(count).equals(input.elementAt(value)))
					{
						input.removeElementAt(value);
					}
				}	
			}
		}
	}
	public static void main(String[] args) 
	{
		Vector<String> input = new Vector<String>();
		
		input.add("Java ");
		input.add("is ");
		input.add("very ");
		input.add("easy ");
		input.add("and ");
		input.add("Java ");
		input.add("is ");
		input.add("important");
		
		System.out.println("The original Vector: ");

		for(int count=0;count<input.size();count++)
		{
			System.out.print(input.elementAt(count));
		}
		
		System.out.println("\n"+"\n"+"After deleting the duplicates in vector: ");
		
		removeDuplicates(input);
		
		for(int count=0;count<input.size();count++)
		{
			System.out.print(input.elementAt(count));
		}
	}
}
