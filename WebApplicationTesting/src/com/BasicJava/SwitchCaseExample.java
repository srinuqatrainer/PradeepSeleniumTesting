package com.BasicJava;

public class SwitchCaseExample {

	public static void main(String[] args) 
	{
		
	/*	Initilization;
		
	switch(Condition)
	{
		
		Case1:
			statement / statements;
			break;
		Case2:
			statement / statements;
			break;
			
		default:
			statement / statements;
			break;
				
	}*/
		
		
		int number = 40;
		
		switch(number)
		{
			
		case 10:
			System.out.println("The number is 10 ");
			break; // key word - which terminates the test 
			
		case 20:
			System.out.println("The number is 20 ");
			break; // key word - which terminates the test	
		
		case 30:
			System.out.println("The number is 30 ");
			break; // key word - which terminates the test
			
		default:
			System.out.println(" Not matching with 10 , 20 and 30 ");
			break;
			
		}
		
		

	}

}
