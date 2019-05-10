package com.NewTours;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_LogInTest {

	public static void main(String[] args) 
	{
		WebDriver driver = null;
		String url="http://newtours.demoaut.com";
		
		//System.setProperty("webdriver.gecko.driver", "./driverFiles/geckodriver.exe");
		driver = new FirefoxDriver();
		
		driver.get(url);
		
		// <input type="text" name="userName" size="10">
		
		// locator - name
		// selector - userName
		
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		
		// <input type="password" name="password" size="10">
		
		driver.findElement(By.name("password")).sendKeys("tutorial");
		
		// <input type="image" name="login" value="Login" src="/images/btn_signin.gif?osCsid=1f1b8fc7b3f0e3951eaf04efc4ab2e5b" width="58" height="17" alt="Sign-In" border="0">
		
		driver.findElement(By.name("login")).click();
		
		
		
		driver.quit();
	
	}

}
