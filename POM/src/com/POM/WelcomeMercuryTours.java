package com.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomeMercuryTours {
	
	// Object Repository Class
	
	// <a href="mercurysignon.php">SIGN-ON</a>
	
	//WebElement SignOn=driver.findElement(By.linkText="SIGN-ON");
	//SignOn.click();
	
	// Identification of element is written
	@FindBy(linkText="SIGN-ON")
	WebElement SignOn;
	
	// Method / Business logic
	public void signOn()
	{
		SignOn.click();
	}
		
	// <a href="mercuryregister.php">REGISTER</a>
	@FindBy(linkText="REGISTER")
	WebElement Register;
	
	public void register()
	{
		Register.click();
	}
	
	// <input type="text" name="userName" size="10">
	
	@FindBy(name="userName")
	WebElement UserName;
	
	// <input type="password" name="password" size="10">
	
	@FindBy(name="password")
	WebElement Password;
	
	// <input type="image" name="login" value="Login" src="/images/btn_signin.gif" width="58" height="17" alt="Sign-In" border="0">
	
	@FindBy(name="login")
	WebElement SignIn;
	
	public void logIn(String userName,String password)
	{
		UserName.sendKeys(userName);
		Password.sendKeys(password);
		SignIn.click();
		
	}
	
	
	
	
	
}
