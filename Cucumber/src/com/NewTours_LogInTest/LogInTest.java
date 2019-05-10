package com.NewTours_LogInTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LogInTest {
	
	WebDriver driver = null;
	String url = "http://newtours.demoaut.com";
	
	//String UserName = "tutorial";
	//String Password = "tutotial";
	
	
	@Given("^Open firefox browser and navigate to newTours Application$")
	public void Open_firefox_browser_and_navigate_to_newTours_Application() 
	{
		driver = new FirefoxDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	}

	/*@When("^User enters valid UserName and Password and click on SignIn button$")
	public void User_enters_valid_UserName_and_Password_and_click_on_SignIn_button() 
	{
	
		WebElement userName=driver.findElement(By.name("userName"));
		userName.sendKeys(UserName);
		
		// <input type="password" name="password" size="10">
		
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys(Password);
		
		// <input type="image" name="login" value="Login" src="/images/btn_signin.gif?osCsid=1f1b8fc7b3f0e3951eaf04efc4ab2e5b" width="58" height="17" alt="Sign-In" border="0">
		
		WebElement signIn=driver.findElement(By.name("login"));
		signIn.click();
		
		
	}*/
	
	
	@When("^User enters valid \"([^\"]*)\" and \"([^\"]*)\" and click on SignIn button$")
	public void User_enters_valid_and_and_click_on_SignIn_button(String UserName, String Password) 
	{
		WebElement userName=driver.findElement(By.name("userName"));
		userName.sendKeys(UserName);
		
		// <input type="password" name="password" size="10">
		
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys(Password);
		
		// <input type="image" name="login" value="Login" src="/images/btn_signin.gif?osCsid=1f1b8fc7b3f0e3951eaf04efc4ab2e5b" width="58" height="17" alt="Sign-In" border="0">
		
		WebElement signIn=driver.findElement(By.name("login"));
		signIn.click();
		
		
	}

	@Then("^User Should be able to successfully logIn and close the application$")
	public void User_Should_be_able_to_successfully_logIn_and_close_the_application() 
	{
		String expected_Title="Find";
		System.out.println(" The expected Title after Successfull LogIn is : "+expected_Title);
		
		String actual_Title=driver.getTitle();
		System.out.println(" The actual Title after LogIN Is : "+actual_Title);
		
		if(actual_Title.contains(expected_Title))
		{
			System.out.println(" LogIn Successfull - PASS ");
		}
		else
		{
			System.out.println(" LogIN Failed - FAIL ");
		}
		
		
		driver.quit();
	
	}
	
	

}
