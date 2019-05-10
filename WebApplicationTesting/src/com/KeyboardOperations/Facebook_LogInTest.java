package com.KeyboardOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Facebook_LogInTest {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String url="https://facebook.com";
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("email")).sendKeys("Pradeep");
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB).perform();
		
		act.sendKeys("Hello").perform();
		
		act.sendKeys(Keys.ENTER).perform();

	}

}
