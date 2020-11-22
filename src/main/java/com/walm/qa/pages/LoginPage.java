package com.walm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.walm.qa.base.TestBase;

public class LoginPage extends TestBase
{
	@FindBy(id="username")
	WebElement Email;
	@FindBy(id="password")
	WebElement Password;
	@FindBy(xpath="//*[@id=\"login-form\"]/div/div[7]/button")
	WebElement Signin;

	public LoginPage() 
	{
		PageFactory.initElements(driver, this); 
	}
	public HomePage login(String em,String pass)
	{
		Email.sendKeys(em);
		Password.sendKeys(pass); 
		Signin.click();
		return new HomePage();
	}

}
