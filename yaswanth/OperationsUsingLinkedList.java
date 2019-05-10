package org.jsp.linkedList;

import java.util.LinkedList;

public class OperationsUsingLinkedList 
{
	public static void main(String[] args) 
	{
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("java");
		list.add("python");
		list.add("javascript");
		list.add("angular");
		
		System.out.println("The elements in the list are: "+list);
		
		list.poll();
		System.out.println("After deleting the elements in list: "+list);
		
		list.add("springs");
		System.out.println("After adding the elements in list: "+list);
	}
}
