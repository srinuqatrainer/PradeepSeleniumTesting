package com.getPageSource;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google_Identify_GmailElement {

	public static void main(String[] args) 
	{
	
		WebDriver driver = null;
		String url="http://google.com";
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		
		String expected_Element="Gmail";
		System.out.println(" The expected Element on the Goolge Home page is : "+expected_Element);
		
		String google_PageSource=driver.getPageSource();
		System.out.println("The Source code of Google Home Page : "+google_PageSource);
		
		if(google_PageSource.contains(expected_Element))
		{
			System.out.println("Element existing -PASS");
		}
		else
		{
			System.out.println("Element not found - FAIL");
		}
		
		driver.quit();
		
		
		

	}

}
