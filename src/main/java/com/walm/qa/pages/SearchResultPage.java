package com.walm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.walm.qa.base.TestBase;

public class SearchResultPage extends TestBase{
	@FindBy(tagName="h1")
	WebElement Searchresulttext;
	
	
	
	//initializing the page object
		public SearchResultPage()
		{
			PageFactory.initElements(driver, this); 
			
		}
		
		public String getSearchResultedText()
		{
			return Searchresulttext.getText();
		}
}
