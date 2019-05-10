package org.jsp.linkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class ElementSearchInLinkedlist 
{
	public static void main(String[] args) 
	{
		String searchElement;
		Scanner scr = new Scanner(System.in);
		
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("java");
		list.add("python");
		list.add("javascript");
		list.add("angular");
		
		System.out.println("The elements in the list are: "+list);
		
		System.out.println("Enter the search element: ");
		searchElement = scr.next();
		if(list.contains(searchElement))
		{
			System.out.println("The searched element is present in the list");
		}
		else
			System.out.println("The searched element is not present in the list");
	}
}
