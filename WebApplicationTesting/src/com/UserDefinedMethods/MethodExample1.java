package com.UserDefinedMethods;

public class MethodExample1 {
	
	public void test1()
	{
		System.out.println(" Test1 method executed successfully ");
	}
	
	public static void main(String[]args)
	{
		MethodExample1 m = new MethodExample1();
		
		m.test2();
		m.test1();
		
		
	}
	
	public void test2()
	{
		System.out.println(" Test2 method executed successfully ");
	}

}
