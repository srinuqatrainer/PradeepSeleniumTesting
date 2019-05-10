package com.Inhert;

public class ChildClass extends Parent {

	public void test2()
	{
		System.out.println(" Test2 method executed Successfully ");
	}
	
	public static void main(String[] args) {
		
		ChildClass c = new ChildClass();
		c.test2();
		c.test1();
		

	}

}
