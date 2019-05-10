package com.MouseHoverOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_HelloSignIn_MouseHover {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = null;
		String url="http://amazon.in";
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		
		Thread.sleep(20000);
		
		// id="nav-link-accountList" - property of HelloSignIn Element
		
		WebElement helloSignIn=driver.findElement(By.id("nav-link-accountList"));
		
		// Mouse Operations or KeyBoard Operation - are done using Actions Class
		
		Actions act = new Actions(driver);
		act.moveToElement(helloSignIn).perform();
		
		// Your Orders - Element Type link
		
		driver.findElement(By.linkText("Your Orders")).click();
		

	}

}
