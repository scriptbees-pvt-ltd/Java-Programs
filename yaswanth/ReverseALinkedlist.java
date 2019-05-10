package org.jsp.linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ReverseALinkedlist 
{
	public static void main(String[] args) 
	{
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("java");
		list.add("python");
		list.add("javascript");
		list.add("angular");
		
		System.out.println("The elements in the list are: "+list);
		
		Iterator<String> lit = list.descendingIterator();
		
		System.out.println("The reversed elements in list are: ");
		while(lit.hasNext())
		{
			System.out.print(lit.next()+", ");
		}
	}
}
