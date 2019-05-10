package com.BasicJava;

public class StringCampare {

	public static void main(String[] args) {
		
		String a="Hello";
		String b="Hello";
		
		if(a.equals(b))
		{
			System.out.println(" Both Strings are equal ");
		}
		else
		{
			System.out.println(" Both String are not equal");
		}
		
		System.out.println(" ****************** ");

		String c="Hello";
		String d="helLo";
		
		if(c.equalsIgnoreCase(d))
		{
			System.out.println("Both Strings are Equal");
		}
		else
		{
			System.out.println(" Both Strings are not Equal ");
		}
				
		System.out.println("###################");
		
		String p="Hello";
		String q=" Hello";

		if(p.equalsIgnoreCase(q))
		{
			System.out.println(" Both Strings are equal ");
		}
		else
		{
			System.out.println(" Both Strings are not equal ");
		}
		
		// finding the length of a String 
		
		int stringLength=p.length();
		System.out.println(" The length of the p variable is : "+stringLength);
		
		System.out.println("---------------------");

		String i="Hello";
		String k="ello";
		
		if(i.contains(k))
		{
			System.out.println(" String existing");
		}
		else
		{
			System.out.println(" String no found ");
		}
		
	}

}
