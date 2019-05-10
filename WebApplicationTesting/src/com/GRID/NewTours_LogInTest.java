package com.GRID;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTours_LogInTest {
	
	@Parameters("Browser")
	@Test
	public void logIn(String browser) throws IOException
	{
		
		System.out.println(" The name of the browser is : "+browser);
		
		
	//	DesiredCapabilities - is used to specify which Browser and Platform(OS) should be considered to test 
		
		// Node's info is set to DesiredCapabilities class
		
		
		DesiredCapabilities cap = null;
		
		if(browser.equalsIgnoreCase("firefox"))
		{
			cap = DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.WINDOWS);
		}
		else
			if(browser.equalsIgnoreCase("chrome"))
			{
				cap = DesiredCapabilities.chrome();
				cap.setBrowserName("chrome");
				cap.setPlatform(Platform.WINDOWS);
			}
		
		//RemoteWebDriver - it is used to connect to remote Hub Server and communicate to Nodes
		
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.22:4444/wd/hub"),cap);
		
		String url="http://newtours.demoaut.com";
		
		driver.get(url);
		
		FileInputStream file = new FileInputStream("./src/com/ApplicationTestDataFiles/Pradeep_NewTours_LogIn_MultipleTestData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
	
		int rowCount=sheet.getLastRowNum();
		
		for(int i=1;i<=rowCount;i++)
		{
		
		Row r=sheet.getRow(i);
		
		WebElement userName=driver.findElement(By.name("userName"));
		userName.sendKeys(r.getCell(0).getStringCellValue());
		
		// <input type="password" name="password" size="10">
		
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys(r.getCell(1).getStringCellValue());
		
		// <input type="image" name="login" value="Login" src="/images/btn_signin.gif?osCsid=1f1b8fc7b3f0e3951eaf04efc4ab2e5b" width="58" height="17" alt="Sign-In" border="0">
		
		WebElement signIn=driver.findElement(By.name("login"));
		signIn.click();
		
		
		String expected_Title="Find";
		System.out.println(" The expected Title after Successfull LogIn is : "+expected_Title);
		
		String actual_Title=driver.getTitle();
		System.out.println(" The actual Title after LogIN Is : "+actual_Title);
		
		if(actual_Title.contains(expected_Title))
		{
			System.out.println(" LogIn Successfull - PASS ");
			r.createCell(2).setCellValue("LogIn Successfull - PASS");
		}
		else
		{
			System.out.println(" LogIN Failed - FAIL ");
			r.createCell(2).setCellValue("LogIN Failed - FAIL");
		}
		
		FileOutputStream file1 = new FileOutputStream("./src/com/ApplicationTestResultFiles/NewTours_LogInTest_MultipleTestData_TestResult_GRID.xlsx");
		workBook.write(file1);
		
		driver.navigate().back();
		
		}

		driver.quit();
	}
	
	

}
