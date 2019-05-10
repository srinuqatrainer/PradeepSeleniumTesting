package com.BrowserAutomation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class AutomatingBrowsers {

	public static void main(String[] args) 
	{
		// Chrome Browser Automation
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\srinivas1\\Desktop\\PradeepSelenium\\WebApplicationTesting\\driverFiles\\chromedriver.exe");
		ChromeDriver pradeep = new ChromeDriver();
		
		// FireFox Browser Automation
		//System.setProperty("webdriver.gecko.driver", "./driverFiles/geckodriver.exe");
		FirefoxDriver pr = new FirefoxDriver();
		
		// Edge Browser
		System.setProperty("webdriver.edge.driver", "./driverFiles/MicrosoftWebDriver.exe");
		EdgeDriver dr = new EdgeDriver();
		
		// Internet explorer Browser
		System.setProperty("webdriver.ie.driver", "./driverFiles//IEDriverServer.exe");
		InternetExplorerDriver ie = new InternetExplorerDriver();
		
		

	}

}
