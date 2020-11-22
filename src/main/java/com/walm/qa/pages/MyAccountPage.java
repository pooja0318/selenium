package com.walm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.walm.qa.base.TestBase;

public class MyAccountPage extends TestBase
{
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div/div[3]/div/div[2]/div[2]/div/div[2]/div/div[4]/div/span")
	WebElement MyAccount;
	
	@FindBy(linkText="My account")
	WebElement MyAcc;
	public MyAccountPage()
	{
		PageFactory.initElements(driver, this); 
			
	}
	public  MyNewAccountPage myAccount1Click() throws InterruptedException
	{
			Actions action= new Actions(driver);
			action.moveToElement(MyAccount).build().perform();
			Thread.sleep(5000);
			MyAcc.click();
			return new  MyNewAccountPage();
	}

}
