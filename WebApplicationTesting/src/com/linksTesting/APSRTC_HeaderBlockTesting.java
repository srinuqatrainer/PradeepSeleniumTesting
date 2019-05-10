package com.linksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class APSRTC_HeaderBlockTesting {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = null;
		String url = "https://apsrtconline.in/oprs-web/";
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		// class="menu-wrap" - Property of Header Block of the Page
		
		WebElement headerBlock=driver.findElement(By.className("menu-wrap"));
		
		List<WebElement>headerBlockLinks=headerBlock.findElements(By.tagName("a"));
		
		int headerBlockElementsCount=headerBlockLinks.size();
		System.out.println(" The total number of elements on the HeaderBlock are : "+headerBlockElementsCount);
		
		for(int i=0;i<headerBlockLinks.size();i++)
		{
			String headerBlocklinkName=headerBlockLinks.get(i).getText();
			System.out.println(" The link name is : "+headerBlocklinkName);
			
			headerBlockLinks.get(i).click();
			
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println();
			
			driver.navigate().back();
			
			Thread.sleep(5000); // Explicit wait
			
			// Identifying the headerBlock again
			headerBlock=driver.findElement(By.className("menu-wrap"));
			// Recreate the arrayList
			headerBlockLinks=headerBlock.findElements(By.tagName("a"));
			
			
		}
		
		
		driver.quit();

	}

}
