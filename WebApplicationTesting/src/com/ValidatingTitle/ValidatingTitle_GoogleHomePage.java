package com.ValidatingTitle;

import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingTitle_GoogleHomePage {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://google.com");
		
		String expected_Title="Google";
		System.out.println(" The expected title of Google Home Page is : "+expected_Title);
		
		String actual_Title=driver.getTitle();
		System.out.println(" The actual title of Google Home Page is : "+actual_Title);
		
		if(actual_Title.equals(expected_Title))
		{
			System.out.println(" Title Matched - PASS");
		}
		else
		{
			System.out.println(" Title not matched - FAIL ");
		}

		driver.quit();

	}

}
