package com.CapturingTitle;

import org.openqa.selenium.chrome.ChromeDriver;

public class CapturingTitle_Google {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("http://google.com");
	
	String actual_Title=driver.getTitle();
	System.out.println(" The title of Google Home Page is : "+actual_Title);

	driver.quit();
	}

}
