package com.DataDriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	WebDriver driver = null;
	String url="http://newtours.demoaut.com";
	
	// String UserName="tutorial";
	// String Password="tutoria";
	
	@BeforeTest
	public void setUp()
	{
		//System.setProperty("webdriver.gecko.driver", "./driverFiles/geckodriver.exe");
		driver = new FirefoxDriver();
		
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}

}
