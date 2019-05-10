package com.BasicJava;

public class ExceptionHandling {

	public static void main(String[] args) // IN built method - defined in the language
	{
		
		/*int a=20;
		int b=0;
		
		int c;
		
		c=a/b;
		
		System.out.println(" The of c after division is:  "+c);*/
		
		try
		{
			int a=20;
			int b=0;
			
			int c;
			
			c=a/b;
			
			System.out.println(" The of c after division is:  "+c);
		}
		catch(Exception e)
		{
			System.out.println(" Cannot perfom the operation");
			System.out.println(e);
		}

	}

}
