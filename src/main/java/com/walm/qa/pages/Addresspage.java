package com.walm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.walm.qa.base.TestBase;

public class Addresspage extends TestBase{
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div/div[3]/div/div[2]/div[2]/div/div[2]/div/div[4]/div/span")
	WebElement MyAccount;
	
	@FindBy(xpath="//*[@id=\"my-account-nav\"]/section[1]/ul/li[8]/a")
	WebElement address;
	
	//initializing the page object
		public Addresspage()
		{
			PageFactory.initElements(driver, this); 
			
		}
		
		public MyAddressPage addressClick() throws InterruptedException
		{
			Actions action= new Actions(driver);
			action.moveToElement(MyAccount).build().perform();

			MyAccount.click();
			Thread.sleep(5000);
			address.click();
			return new  MyAddressPage();
		}


}
