package com.RadioButtonsTesting;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EchoEcho_RadioButtonsTesting {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = null;
		String url="http://www.echoecho.com/htmlforms10.htm";
		
		driver =new FirefoxDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Property of the Block of the WebPage - radio Buttons
		// xpath="/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"

		WebElement radioButtons_Block=driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		
		// <input type="radio" name="group1" value="Milk">
		// <input type="radio" name="group1" value="Butter" checked="">
		// <input type="radio" name="group1" value="Cheese">
		
		// <input type="radio" name="group2" value="Water">
		
		List<WebElement>radioButtons_Group1=radioButtons_Block.findElements(By.name("group1"));
		
		System.out.println(" The total number of RadioButtons in group1 are : "+radioButtons_Group1.size());
		
		for(int k=0;k<radioButtons_Group1.size();k++) // to perform the click Operation on each Radio Button 
		{
			radioButtons_Group1.get(k).click();
			
			Thread.sleep(5000);
			
			for(int p=0;p<radioButtons_Group1.size();p++)
			{
				System.out.println(radioButtons_Group1.get(p).getAttribute("value")+" - "+radioButtons_Group1.get(p).getAttribute("checked"));
			}
			
		}
		
		
		//driver.quit();
	}

}
