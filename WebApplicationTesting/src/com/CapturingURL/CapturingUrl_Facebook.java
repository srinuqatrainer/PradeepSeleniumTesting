package com.CapturingURL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CapturingUrl_Facebook {

	public static void main(String[] args) {
		
		//WebDriver is an interface in Selenium
		
		WebDriver driver = null;
		String url="http://facebook.com";
		
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
		driver = new ChromeDriver();
			
		//driver = new FirefoxDriver();
		//driver = new EdgeDriver();
		
		//driver.get(url);		
		driver.navigate().to(url);
		
		System.out.println(" The Title of Facebook Home Page is : "+ driver.getTitle());
		
		String actual_Url=driver.getCurrentUrl();
		System.out.println(" The actual Url of Facebook Home Page is : "+actual_Url);
		
		driver.quit();
		
		
		
		

	}

}
