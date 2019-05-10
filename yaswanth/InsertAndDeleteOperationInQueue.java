package org.jsp.InsertAndDeleteInQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class InsertAndDeleteOperationInQueue 
{
	public static void main(String[] args) 
	{
		PriorityQueue<String> queue = new PriorityQueue<String>();
		
		queue.add("java");
		queue.add("python");
		queue.add("javascript");
		queue.add("angular");
		
		System.out.println("The queue elements are: "+queue);
		
		queue.add("springs");
		System.out.println("After inserting an element: "+queue);
		
		queue.remove("python");
		System.out.println("After removing an element: "+queue);
			
	}
}
