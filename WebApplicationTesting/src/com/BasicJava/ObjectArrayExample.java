package com.BasicJava;

public class ObjectArrayExample {

	public static void main(String[] args) {
		
		//Object pradeep[] = new Object[size];
		
		Object pradeep[] = new Object[3];
		
		pradeep[0] = 10;
		pradeep[1] = "Hello";
		pradeep[2] = 10.123;
		
		for(int i=0;i<pradeep.length;i++)
		{
			System.out.println(pradeep[i]);
		}
		

	}

}
