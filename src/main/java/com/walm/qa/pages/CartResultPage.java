package com.walm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.walm.qa.base.TestBase;

public class CartResultPage extends TestBase{
	@FindBy(xpath="/html/body/div[1]/div[1]/div[3]/div/div/div/div/div[6]/div[2]/div[2]/div[1]/div/div[1]/div[1]/div/a/div[1]/img")
	WebElement Search1;
	@FindBy(xpath="/html/body/div[1]/div/div[4]/div/div/div[1]/div[3]/div[2]/div/div[2]/div[2]/div/button[1]")
	WebElement Search2;

	public CartResultPage()
	{
		PageFactory.initElements(driver, this); 
		
	}
	
	public void ShoppingCartselectClick1() throws InterruptedException
	{
		
		Search1.click();
		Thread.sleep(2000);;
		
		
		
	}
	public void Addtocart() throws InterruptedException
	{
		Actions action= new Actions(driver);
		action.moveToElement(Search2).build().perform();
		Thread.sleep(5000);
		Search2.click();
	}
}
