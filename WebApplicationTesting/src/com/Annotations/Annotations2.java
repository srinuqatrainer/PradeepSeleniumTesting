package com.Annotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations2 {
	
	@BeforeTest
	public void navigateToGmailApplication()
	{
		System.out.println(" Gmail Application Launched ");
	}
	
	@Test(priority=0) 
	public void inBox()
	{
		System.out.println(" Testing Inbox functionality ");
	}
	
	
	@Test(enabled=false) 
	public void sentMail()
	{
		System.out.println(" Testing Sent Mail functionality ");
	}
	
	@Test(priority=1) 
	public void composeMail()
	{
		System.out.println(" Testing composeMail functionality ");
	}
	
	@AfterTest
	public void applicationClose()
	{
		System.out.println(" Gmail Application Close");
	}

}
