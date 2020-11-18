package com.walm.qa.pages;

//import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.walm.qa.base.TestBase;

public class MyShoppingList extends TestBase {
	@FindBy(xpath="//*[@id=\"save-list-input\"]")
	WebElement newshoppinglist ;
	
	@FindBy(xpath="//*[@id=\"save-list-button\"]")
	WebElement createlistbutton;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/form/button")
	WebElement searchbutton;
	
	
	//initializing the page object
	public  MyShoppingList()
	{
		PageFactory.initElements(driver, this); 
		
	}
	
	public MyShoppingList createlist(String sopl)
	{
		 newshoppinglist.sendKeys(sopl);
		createlistbutton.click();
		return new MyShoppingList();
	}
	public void searchisDispaly()
	{
		searchbutton.click();
		
	}
	

}
