package com.Select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Monster_CurrentLocation_Industry_Select {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = null;
		String url = "https://my.monsterindia.com/sponsered_popup.html";
		
		driver = new FirefoxDriver();
		
		driver.get(url);
		
		
		// Browser Maximize
		driver.manage().window().maximize();

		// class="border_grey1" - Propetry of current location
		WebElement currentLocation=driver.findElement(By.className("border_grey1"));
		
		/*List<WebElement>cities=currentLocation.findElements(By.tagName("option"));
		
		System.out.println(cities.size());
		
		for(int a=0;a<cities.size();a++)
		{
			System.out.println(cities.get(a).getText());
		}*/
		
		Select selection = new Select(currentLocation);
		selection.selectByVisibleText("Chennai");
		
		// id="id_industry" - property of Industry Element
		
		WebElement industry=driver.findElement(By.id("id_industry"));
		Select sel = new Select(industry);
		
		sel.selectByIndex(1);
		sel.selectByValue("4");
		sel.selectByVisibleText("Banking/ Financial Services");
		
		sel.deselectByValue("5");
		
		Thread.sleep(5000);
		
		sel.deselectAll();
		
		
		
		
		//driver.quit();
	}

}
