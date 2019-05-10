package com.getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_Register_FindURLAddress {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String url="http://newtours.demoaut.com";
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		
		// <a href="mercuryregister.php">REGISTER</a>
		
		WebElement register=driver.findElement(By.linkText("REGISTER"));
		String expected_Url=register.getAttribute("href");
		System.out.println("The expected Url address is : "+expected_Url);
		
		
		register.click();
		
		String actual_Url=driver.getCurrentUrl();
		System.out.println("The actual Url address is : "+actual_Url);
		
		if(actual_Url.equals(expected_Url))
		{
			System.out.println("Successfully reached Register WebPage -PASS");
		}
		else
		{
			System.out.println("UnSuccessfully - FAIL");
		}
		
		driver.quit();
		

	}

}
