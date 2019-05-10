package com.DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class NewUserRegistration extends BaseTest {
	
	@Test(priority=0)
	public void Register()
	{
		// <a href="mercuryregister.php">REGISTER</a>
		
		WebElement register=driver.findElement(By.linkText("REGISTER"));
		register.click();
		
	}
	
	@Test(priority=1)
	public void userRegistration() throws IOException
	{
	
		FileInputStream file = new FileInputStream("./src/com/ApplicationTestDataFiles/UserRegistration_TestData.xlsx");
		XSSFWorkbook workbBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbBook.getSheet("Sheet1");
		
		Row r=sheet.getRow(1);
		
		driver.findElement(By.name("firstName")).sendKeys(r.getCell(0).getStringCellValue());
		driver.findElement(By.name("lastName")).sendKeys(r.getCell(1).getStringCellValue());
		
		// Type Casting
		double d=r.getCell(2).getNumericCellValue();
		long x=(long)d;
		String phoneNumber=Long.toString(x);
		
		driver.findElement(By.name("phone")).sendKeys(phoneNumber);
		driver.findElement(By.id("userName")).sendKeys(r.getCell(3).getStringCellValue());
		
		driver.findElement(By.name("address1")).sendKeys(r.getCell(4).getStringCellValue());
		driver.findElement(By.name("city")).sendKeys(r.getCell(5).getStringCellValue());
		driver.findElement(By.name("state")).sendKeys(r.getCell(6).getStringCellValue());
		
		double p=r.getCell(7).getNumericCellValue();
		long y=(long)p;
		String postalCode=Long.toString(y);
		
		driver.findElement(By.name("postalCode")).sendKeys(postalCode);
		driver.findElement(By.name("country")).sendKeys(r.getCell(8).getStringCellValue());
		
		driver.findElement(By.id("email")).sendKeys(r.getCell(9).getStringCellValue());
		driver.findElement(By.name("password")).sendKeys(r.getCell(10).getStringCellValue());
		driver.findElement(By.name("confirmPassword")).sendKeys(r.getCell(11).getStringCellValue());
		
		driver.findElement(By.name("register")).click();
		
		String expected_UserName=r.getCell(9).getStringCellValue();
		System.out.println(" The Expected UserName is : "+expected_UserName);
		
		String actual_RegisteredUserName=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();
		System.out.println(" The actual User REgistered is : "+actual_RegisteredUserName);
		
		if(actual_RegisteredUserName.contains(expected_UserName))
		{
			System.out.println(" User Registration Successfull - PASS");
			r.createCell(12).setCellValue("User Registration Successfull - PASS");
		}
		else
		{
			System.out.println(" User registration Failed - FAIL ");
			r.createCell(12).setCellValue("User registration Failed - FAIL");
		}
		
		FileOutputStream file1 = new FileOutputStream("./src/com/ApplicationTestResultFiles/NewUserRegistration_TestResult.xlsx");
		workbBook.write(file1);
		
	}

}
