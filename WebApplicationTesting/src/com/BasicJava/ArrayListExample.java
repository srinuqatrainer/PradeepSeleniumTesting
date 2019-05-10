package com.BasicJava;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
//ArrayList is a dynamic data Structure which is capable of saving any dataType values and the size need not declared
		
		// List<dataType>arrayName = new ArrayList<>();
		
		List<Object>pradeep = new ArrayList<>();
		
		pradeep.add("Selenium");
		pradeep.add("LoadRunner");
		pradeep.add(10);
		pradeep.add(12.345);
	
		
		for(int i=0;i<pradeep.size();i++)
		{
			System.out.println(pradeep.get(i));
		}
		
		System.out.println("***************");
		
		// for each loop
		for(Object var:pradeep)
		{
			System.out.println(var);
		}
		
		

	}

}
