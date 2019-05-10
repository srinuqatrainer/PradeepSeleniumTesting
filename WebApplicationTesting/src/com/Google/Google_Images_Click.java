package com.Google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google_Images_Click {

	public static void main(String[] args) {
	
		WebDriver driver = null;
		String url = "http://google.com";
		
		
		driver = new FirefoxDriver();
		driver.get(url);
		
	// <a class="gb_d" data-pid="23" href="https://mail.google.com/mail/?tab=wm">Gmail</a>	
	// <a class="gb_d" data-pid="2" href="https://www.google.co.in/imghp?hl=en&amp;tab=wi">Images</a>
		
		//WebElement images=driver.findElement(By.className("gb_d"));
		
		WebElement images=	driver.findElement(By.linkText("Images"));
		images.click();
		
		
		
	}

}
