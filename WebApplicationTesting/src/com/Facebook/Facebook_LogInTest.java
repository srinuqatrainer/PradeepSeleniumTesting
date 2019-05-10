package com.Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook_LogInTest {

	public static void main(String[] args) 
	{
		WebDriver driver = null;
		String url="http://facebook.com";
		
		//System.setProperty("webdriver.gecko.driver", "./driverFiles/geckodriver.exe");
		driver = new FirefoxDriver();
		
		driver.get(url);
		
		/*
		 
<input type="email" class="inputtext" name="email" id="email" data-testid="royal_email">


 locator - id
 selector - email 

		 */
		
		driver.findElement(By.id("email")).sendKeys("Pradeep");
		
		// <input type="password" class="inputtext" name="pass" id="pass" data-testid="royal_pass">
		
		// locator - id
		// selector - pass
		
		driver.findElement(By.id("pass")).sendKeys("Hello");
		
		// <label class="uiButton uiButtonConfirm" id="loginbutton" for="u_0_2"><input value="Log In" aria-label="Log In" data-testid="royal_login_button" type="submit" id="u_0_2"></label>
		
		// locator  - id
		// selector - loginbutton
		
		driver.findElement(By.id("loginbutton")).click();
		

	}

}
