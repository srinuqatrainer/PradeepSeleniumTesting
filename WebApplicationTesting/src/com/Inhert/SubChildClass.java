package com.Inhert;

public class SubChildClass extends ChildClass {
	
	public void test3()
	{
		System.out.println(" Test3 method executed Successfully ");
	}

	public static void main(String[] args) {
		
		SubChildClass sc = new SubChildClass();
		sc.test3();
		sc.test1();
		sc.test2();
		

	}

}
