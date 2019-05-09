package org.jsp.stackOperations;

import java.util.Stack;

public class PerformingStackOperations 
{
	public static void main(String[] args) 
	{
		Stack<String> stack = new Stack<String>();
		
		stack.push("Java ");
		stack.push("is ");
		stack.push("Very ");
		stack.push("easy.");
		
		System.out.println("The elements in stack: "+stack);
		System.out.println("The popped elements: "+stack.pop());
		System.out.println("The peeked elements: "+stack.peek());
	}
}
