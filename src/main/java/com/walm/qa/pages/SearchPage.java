package com.walm.qa.pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.walm.qa.base.TestBase;

public class SearchPage extends TestBase{
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div/div[3]/div/div[1]/div[2]/form/div/input")
	WebElement Search;
	@FindBy(xpath="//*[@id=\"simplified-header\"]/div[2]/div/div[4]/form/button")
	WebElement searchbutton;
	//initializing the page object
		public SearchPage()
		{
			PageFactory.initElements(driver, this); 
			
		}
		
		public SearchResultPage searchButtonClick(String se) throws InterruptedException
		{
			
			Search.sendKeys(se);
			Thread.sleep(2000);
			
			Thread.sleep(2000);
			return new SearchResultPage();
		
		}
		

}
