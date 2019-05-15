package org.jsp.methods;

public class MethodWithArgumentsAndValues 
{
	//Declaring a method with arguments and return values;
	public static int run(int argument1)
	{
		System.out.println("Method with argument and return values");
		
		return(argument1);
	}
	
	//Calling the run() from main()
	public static void main(String[] args) 
	{
		run(198); //Calling the method by passing an argument;
	}
}
