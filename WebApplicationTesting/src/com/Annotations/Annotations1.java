package com.Annotations;

import org.testng.annotations.Test;

public class Annotations1 {
	
	// Test Case - Any functionality in the web page to automated - should be always written withIn @Test Only
	@Test(priority=0) 
	public void inBox()
	{
		System.out.println(" Testing Inbox functionality ");
	}
	
	
	@Test(priority=2) 
	public void sentMail()
	{
		System.out.println(" Testing Sent Mail functionality ");
	}
	
	@Test(priority=1) 
	public void composeMail()
	{
		System.out.println(" Testing composeMail functionality ");
	}
	

}
