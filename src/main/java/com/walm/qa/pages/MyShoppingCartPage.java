package com.walm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.walm.qa.base.TestBase;

public class MyShoppingCartPage extends TestBase{
	@FindBy(xpath="//*[@id=\"riP4z30\"]/div[4]/a/article")
	WebElement selectadditem;
	@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div[2]/div[2]/div/div[1]/a/article")
	WebElement selectadditem1;
	@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div[4]/section[2]/div[3]/div/article[1]/a/div[3]")
	WebElement selectadditem2;
	@FindBy(xpath="/html/body/div[1]/div/div[4]/div/div/div[1]/div[3]/div[2]/div/div[2]/div[2]/div/button[1]")
	WebElement selectadditem3;
	public MyShoppingCartPage()
	{
		PageFactory.initElements(driver, this); 
		
	}
	
	public void ShoppingCartselectClick()
	{
		
		selectadditem.click();
		selectadditem1.click();
		selectadditem2.click();
		selectadditem3.click();
		//Thread.sleep(5000);
		
	}

}
