package com.Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class NewTours_Register_Country_Select {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String url = "http://newtours.demoaut.com";
		
		driver = new FirefoxDriver();
		
		driver.get(url);
		
		
		// Browser Maximize
		driver.manage().window().maximize();
		
		// <a href="mercuryregister.php">REGISTER</a>
		
		WebElement register=driver.findElement(By.linkText("REGISTER"));
		register.click();
		
		// name="country" - proptery of Country WebElement
		
		WebElement country=driver.findElement(By.name("country"));
		
		// Select class is used to perform selection 
		
		Select selection = new Select(country);
		//selection.selectByIndex(4); // Index always starts with 0
		
		//selection.selectByValue("234"); // value should be given with respect the number assigned to Option tag
		
		selection.selectByVisibleText("INDIA");
		
		
		

	}

}
