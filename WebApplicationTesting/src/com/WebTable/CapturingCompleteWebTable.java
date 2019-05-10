package com.WebTable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CapturingCompleteWebTable {

	public static void main(String[] args) {
		

		WebDriver driver = null;
		String url="https://www.timeanddate.com/worldclock/";
		
		driver =new FirefoxDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// /html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
		// /html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[8]
		
		for(int i=1;i<=36;i++) // to goto every Row
		{
			
			for(int k=1;k<=8;k++) // goto every ROw of All the Columns
			{
				String data=driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr["+i+"]/td["+k+"]")).getText();
				System.out.print(data+"  ");
			}
			System.out.println();
			
		}
		
		driver.quit();

	}

}
