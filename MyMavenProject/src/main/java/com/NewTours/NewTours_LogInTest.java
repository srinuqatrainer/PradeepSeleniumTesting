package com.NewTours;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTours_LogInTest {
	
	Logger logger = Logger.getLogger("NewTours_LogInTest");
	
	WebDriver driver = null;
	String url = "http://newtours.demoaut.com";
	String UserName = "tutorial";
	String Password = "tutorial";
	
	@BeforeTest
	public void setUp()
	{
		PropertyConfigurator.configure("log4j.properties");
		
		driver = new FirefoxDriver();
		//System.out.println(" FireFox Browser Launched Successfully ");
		logger.info("FireFox Browser Launched Successfully ");
		
		driver.get(url);
		
		logger.info(" NewTours Application lunched Successfully");
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	
	@Test
	public void logIn()
	{
		WebElement userName=driver.findElement(By.name("userName"));
		userName.sendKeys(UserName);
		
		logger.info( " Entered UserName ");
		
		// <input type="password" name="password" size="10">
		
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys(Password);
		
		logger.info(" Entered Password " );
		
		// <input type="image" name="login" value="Login" src="/images/btn_signin.gif?osCsid=1f1b8fc7b3f0e3951eaf04efc4ab2e5b" width="58" height="17" alt="Sign-In" border="0">
		
		WebElement signIn=driver.findElement(By.name("login"));
		signIn.click();
		
		logger.info(" Clicked on LogIn Button ");
		
		String expected_Title="Find";
		//System.out.println(" The expected Title after Successfull LogIn is : "+expected_Title);
		
		logger.info(" The expected Title after Successfull LogIn is : "+expected_Title);
		
		String actual_Title=driver.getTitle();
		//System.out.println(" The actual Title after LogIN Is : "+actual_Title);
		
		logger.info("The actual Title after LogIN Is : "+actual_Title);
		
		if(actual_Title.contains(expected_Title))
		{
			//System.out.println(" LogIn Successfull - PASS ");
			logger.info("LogIn Successfull - PASS");
		}
		else
		{
			//System.out.println(" LogIN Failed - FAIL ");
			logger.info("LogIN Failed - FAIL");
		}
		

	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
		logger.info("NewTours Application Closed successfully");
	}
	
}
