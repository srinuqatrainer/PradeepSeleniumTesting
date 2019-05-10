package com.ScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Bing_ScreenShot {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = null;
		String url="http://bing.com";
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Type Casting
		File bing_ScreenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(bing_ScreenShot, new File("C:\\Users\\srinivas1\\Desktop\\PradeepSelenium\\WebApplicationTesting\\screenShots\\bing.png"));
		
		driver.quit();

	}

}
