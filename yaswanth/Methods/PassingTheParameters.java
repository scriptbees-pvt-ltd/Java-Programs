package org.jsp.methods;

public class PassingTheParameters 
{
	//Passing the parameters to method;
	public static void run(int parameter1, int parameter2)
	{
		System.out.println("Passing the parameters to method");
		System.out.println((parameter1+parameter2));
	}
	
	//Calling run() from main();
	public static void main(String[] args) 
	{
		run(21,54);
	}
}
