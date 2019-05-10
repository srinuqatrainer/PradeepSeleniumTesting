package com.Xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UserRegistration_AbsoluteXpath {

	public static void main(String[] args) {
		
		
		WebDriver driver = null;
		String url="http://newtours.demoaut.com";
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// <a href="mercuryregister.php">REGISTER</a>
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		driver.findElement(By.id("email")).sendKeys("Pradeep");
		
		driver.findElement(By.name("password")).sendKeys("hello123");
		
		driver.findElement(By.name("confirmPassword")).sendKeys("hello123");
		
		driver.findElement(By.name("register")).click();
		
		String expected_UserName="Pradeep";
		System.out.println(" The expected UserName is : "+expected_UserName);
		
		String actual_UserRegisteredText=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();
		System.out.println(" The actual User Registered text is : "+actual_UserRegisteredText);
		
		if(actual_UserRegisteredText.contains(expected_UserName))
		{
			System.out.println("User registration Successfull - PASS");
		}
		else
		{
			System.out.println("User registration Failed - FAIL");
		}
		
		driver.quit();
	

	}

}
