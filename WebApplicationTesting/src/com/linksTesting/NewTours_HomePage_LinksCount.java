package com.linksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_HomePage_LinksCount {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String url = "http://newtours.demoaut.com";
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		// <a href="mercurysignon.php?osCsid=569f27e36dd3659cf035015dc1f82097">SIGN-ON</a>
		// <a href="mercuryregister.php?osCsid=569f27e36dd3659cf035015dc1f82097">REGISTER</a>
		// <a href="mercuryunderconst.php?osCsid=569f27e36dd3659cf035015dc1f82097">SUPPORT</a>
		
		List<WebElement>pradeep=driver.findElements(By.tagName("a"));
		
		int linksCount=pradeep.size();
		
		System.out.println(" The total number of links on the NewTours Home Page are: "+linksCount);
		
		driver.quit();
		
		

	}

}
