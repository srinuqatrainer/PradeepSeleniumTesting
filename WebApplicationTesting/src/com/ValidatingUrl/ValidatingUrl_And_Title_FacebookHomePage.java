package com.ValidatingUrl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingUrl_And_Title_FacebookHomePage {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String url="http://facebook.com";
		
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
		driver = new ChromeDriver();
			
		//driver = new FirefoxDriver();
		//driver = new EdgeDriver();
		
		//driver.get(url);		
		driver.navigate().to(url);
		
		String expected_Title="Facebook – log in or sign up";
		System.out.println(" The expected Title of Facebook Home page is : "+expected_Title);
		
		System.out.println(" The Title of Facebook Home Page is : "+ driver.getTitle());
		
		if(driver.getTitle().equals(expected_Title))
		{
			System.out.println(" The Title matched - PASS");
		}
		else
		{
			System.out.println(" The Title not matched - FAIL");
		}
		
		String expected_Url = "facebook.com";
		System.out.println(" The expected url of Facebook home Page is : "+expected_Url);
		
		String actual_Url=driver.getCurrentUrl();
		System.out.println(" The actual Url of Facebook Home Page is : "+actual_Url);
		
		if(actual_Url.contains(expected_Url))
		{
			System.out.println(" URL matched - PASS ");
		}
		else
		{
			System.out.println(" Url not matched - FAIL");
		}
		
		driver.quit();

	}

}
