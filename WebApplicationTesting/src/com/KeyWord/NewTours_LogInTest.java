package com.KeyWord;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class NewTours_LogInTest extends BaseTest {

	@Test
	public void logIn() throws IOException
	{
		
		//driver.findElement(By.name("userName")).sendKeys("tutorial");
		
		FileInputStream file = new FileInputStream("./newTours.properties");
		Properties pr = new Properties();
		pr.load(file);
		
		FileInputStream file1 = new FileInputStream("./src/com/ApplicationTestResultFiles/NewTours_LogInTest_MultipleTestData_TestResult.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file1);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		int rowCount=sheet.getLastRowNum();
		
		for(int i=1;i<=rowCount;i++)
		{
		
			Row r=sheet.getRow(i);
			
		driver.findElement(By.name(pr.getProperty("UserName"))).sendKeys(r.getCell(0).getStringCellValue());
		
		driver.findElement(By.name(pr.getProperty("Password"))).sendKeys(r.getCell(1).getStringCellValue());
		
		driver.findElement(By.name(pr.getProperty("SignIn"))).click();
		

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
		
		FileOutputStream file2 = new FileOutputStream("./src/com/ApplicationTestResultFiles/NewTours_LogInTest_MultipleTestData_TestResult_KeyWord.xlsx");
		workBook.write(file2);
		
		driver.navigate().back();
		
		
		}
		
	}
	
}
