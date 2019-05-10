package com.Xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_Vacations_BackToHome_Click {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String url="http://newtours.demoaut.com";
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// <a href="mercuryunderconst.php">Vacations</a>
		
		driver.findElement(By.linkText("Vacations")).click();
		
		/*
		 *1. Relative(starts with //)
<img src="/images/forms/home.gif" width="118" height="23" border="0">

 xpath - locator

 selector - should be created based on the properties of the element


 Syntax : xpath Expression creation

 // - search on the entire webPage
  * - search for the all the tags

--> //tagName[@attribute='value']
    //*[@attribute='value']

 Selector --   //img[@src='/images/forms/home.gif']

		 */
		
	//	driver.findElement(By.xpath("//img[@src='/images/forms/home.gif']")).click();
		
// 2. Absolute Xpath		
// /html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[4]/td/a/img
		
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[4]/td/a/img")).click();

	}

}
