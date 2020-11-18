package com.walm.qa.pages;

import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.walm.qa.base.TestBase;

public class ShoppingCartPage extends TestBase{
	@FindBy(linkText="Electronics")
	WebElement searchadditem;
	
	@FindBy(xpath="//*[@id=\"riP4z30\"]/div[1]/a/article")
	WebElement searchadditemclick;
	
	@FindBy(xpath="//*[@id=\"thumb-3DE5WZASN603\"]/a/div[2]/div[2]/img")
	WebElement clickonfirstiteam1;
	
	@FindBy(xpath="//*[@id=\"thumb-6000198376847\"]/div/button")
	WebElement additeamtocart;
	
	@FindBy(xpath="//*[@id=\"thumb-6000199782683\"]/div[2]/button")
	WebElement addseconditeamtocart;

	@FindBy(xpath="//*[@id=\"thumb-1EXPWX5G0AAM\"]/div/button")
	WebElement addthirditeamtocart;
	
	@FindBy(xpath="/html/body/div[1]/div/div/div[3]/div[4]/div[2]/div/div[1]/div[11]/a/button")
	WebElement checkout;
	
	@FindBy(xpath="//button[contains(text(),'+')]")
	WebElement increasequantityofproduct;
	
	@FindBy(xpath="//*[@id=\"ac-ctas\"]/a[2]")
	WebElement continueshopping ;
	
	//initializing the page object
	public ShoppingCartPage()
	{
			PageFactory.initElements(driver, this); 
	}
	
	public MyShoppingCartPage ShoppingCartClick() throws InterruptedException
	{
		searchadditem.click();
		Thread.sleep(5000);
		searchadditemclick.click();
		return new MyShoppingCartPage();
	}
	public void clickonfirstiteam()
	{
			js.executeScript("window.scrollBy(0,250)");
			clickonfirstiteam1 .click();
	}
	public void addfirstiteamtocart()
	{
		js.executeScript("arguments[0].scrollIntoView();",additeamtocart);
		additeamtocart.click();
	}
	public void addseconditeamtocart()
	{
		js.executeScript("arguments[0].scrollIntoView();",addseconditeamtocart);
		addseconditeamtocart.click();
	}
	public void addthirditeamtocart()
	{
		js.executeScript("window.scrollBy(0,250)");
		addthirditeamtocart.click();
	}
	public void checkout()
	{
			checkout.click();
	}
	public void increasequantityofproduct(int numberofitems)
	{
			for(int i =0;i<numberofitems;i++)
			{
				js.executeScript("arguments[0].scrollIntoView();",increasequantityofproduct);
				wait.until(ExpectedConditions.visibilityOf(increasequantityofproduct));
				increasequantityofproduct.click();
			}
	}
	public void clickcontinue()
	{
		continueshopping .click();
	}
		
}
