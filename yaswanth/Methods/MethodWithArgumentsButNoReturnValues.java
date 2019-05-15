package org.jsp.methods;

public class MethodWithArgumentsButNoReturnValues 
{
	// Declaring the method with arguments but no return values;
	public static void run(int argument1, int argument2)
	{
		System.out.println("Method with arguments but no return values");
		System.out.println(argument1+argument2);   //performing the action;
	}
	
	//Calling the run() from main()
	public static void main(String[] args) 
	{
		run(8,9);  //Calling the method by passing the arguments;
	}
}
