package com.walm.qa.pages;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.walm.qa.base.TestBase;

public class HomePage extends TestBase{
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div/div[3]/div/div[2]/div[2]/div/div[2]/div/div[4]/div/span")
	WebElement MyAccount;
	
	@FindBy(linkText="My recommendations")
	WebElement MyRecom;
	
	@FindBy(linkText="Sign out")
	WebElement signout;
	
	@FindBy(xpath="/html/body/div[1]/div/div/div[2]/div/div/div[2]/div[2]/div/div[2]/div/div[5]/a/svg")
    WebElement cart;
	
		public HomePage()
		{
			PageFactory.initElements(driver, this); 
			
		}
	
		public  RecommendationPage myAccountClick() throws InterruptedException
		{
			Actions action= new Actions(driver);
			action.moveToElement(MyAccount).build().perform();
			Thread.sleep(5000);
			MyRecom.click();
			return new RecommendationPage();
		}
		public LoginPage clickOnSignOutLink()
		{
			Actions action= new Actions(driver);
			action.moveToElement(MyAccount).build().perform();
			signout.click();
			return new LoginPage();
		}
		public void clickOnCart()
		{
			cart.click();
		}

}		
