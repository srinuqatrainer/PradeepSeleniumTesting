package com.UserDefinedMethods;

public class MethodExample2 {

	int a=20;
	int b=10;
	//int c;
	
	
	public void add()
	{
		int c;
	c=a+b;
		System.out.println("The addition of a and b is : "+c);
	}
	
	private void subtraction()
	{
		int c;
		c=a+b;
		System.out.println("The subtration of a and b is : "+c);
	}
	public static void main(String[] args) 
	{
		
		
		MethodExample2 m = new MethodExample2();
		m.add();
		m.subtraction();
	}

}
