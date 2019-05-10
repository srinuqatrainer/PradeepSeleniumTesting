package com.DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_Register_CountryDropDown_Count {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String url = "http://newtours.demoaut.com";
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		// <a href="mercuryregister.php">REGISTER</a>
		
		WebElement register=driver.findElement(By.linkText("REGISTER"));
		register.click();
		
		// name="country" - proptery of Country WebElement
		
		WebElement country=driver.findElement(By.name("country"));
		
		List<WebElement>countries=country.findElements(By.tagName("option"));
		
		System.out.println("The total number of countries are : "+countries.size());
		
		for(int k=0;k<countries.size();k++)
		{
			System.out.println(k+"-"+countries.get(k).getText());
		}
		
		driver.quit();
		
		
		
		
		
		

	}

}
