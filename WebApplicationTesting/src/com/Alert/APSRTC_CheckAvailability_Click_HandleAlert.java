package com.Alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class APSRTC_CheckAvailability_Click_HandleAlert {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = null;
		String url="https://apsrtconline.in/oprs-web/";
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// id="searchBtn" - property of Check Availability button
		
		driver.findElement(By.id("searchBtn")).click();
		
		// Alert - its an interface in selenium WebDriver
		
		
		Alert alt = driver.switchTo().alert();
		
		String alert_Text=alt.getText();
		System.out.println(" The alert Window text is : "+alert_Text);
		
		Thread.sleep(10000);
		
		alt.accept(); // OK button
		
		//alt.dismiss(); // Cancel button
		
	//	alt.sendKeys("hello"); // sending data into text/edit element
		
		

	}

}
