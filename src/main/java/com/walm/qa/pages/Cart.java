package com.walm.qa.pages;

import java.util.List;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.walm.qa.base.TestBase;

public class Cart extends TestBase{
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div/div[3]/div/div[1]/div[2]/form/div/input")
	WebElement Search;
	
	@FindBy(xpath="//*[@id=\"simplified-header\"]/div[2]/div/div[4]/form/button")
	WebElement searchbutton;
	
	@FindBy(xpath="/html/body/div[1]/div/div[4]/div/div/div[1]/div[3]/div[2]/div/div[1]/div/div[3]/div/div/div[1]/span/span")
	WebElement priceoffirstproduct;
	
	@FindBy(xpath="//button[contains(text(),'+')]")
	WebElement increasequanitity;
	
	@FindBy(xpath="//button[contains(text(),'-')]")
	WebElement removequantity;
	
	@FindBy(xpath="//body/div/div/div/div/div/div/div/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/span[1]/span[1]")
	WebElement newupdatedprice;
	
	@FindBy(xpath="//*[@id=\"10240762\"]/div[1]/div[2]/div[1]")
	List<WebElement> iteamneedtoremove;
	
	@FindBy(xpath="//*[@id=\"10240762\"]/div[2]/div[4]/button/span")
	List<WebElement> remove;
	
	@FindBy(xpath="/html/body/div[1]/div/div/div[3]/div[4]/div[1]/div[2]/div[2]/div[1]/div[2]")
	WebElement totalnumberofiteam ;
	
	@FindBy(xpath="//*[@id=\"6000200936593\"]/div[1]/div[2]/a")
	WebElement firstiteamincartclick;
	
	@FindBy(linkText="Body Fantasies Signature Sweet Pea Fragrance Body Spray")
	WebElement cartclickiteamname;
	
		public Cart()
		{
			PageFactory.initElements(driver, this); 
		}
		public CartResultPage searchButtonClick(String se) throws InterruptedException
		{
			
			Search.sendKeys(se);
			Thread.sleep(2000);
			return new CartResultPage();
		
		}
		public String getFirstProductPrice()
		{
			return priceoffirstproduct.getText();
		}
		public void increasequanitityClick()
		{
			increasequanitity.click();
		}
		public void removequanitityClick()
		{
			 removequantity.click();
		}
		public String getupdatedprice()
		{
			return newupdatedprice.getText();
		}
		public String getTotalnumberofiteam()
		{
			return totalnumberofiteam.getText();
		}
		public void removeItemFromCart()
		{
			for(int i=0; i<iteamneedtoremove.size();i++)
			{
				String name=iteamneedtoremove.get(i).getText();
				
				if(name.contains("abc"))
				{
					 remove.get(i).click();
				}
			}
		}
		
		public void clickfirstiteamofcart()
		{
			 firstiteamincartclick.click();
		}
		public String nameoffristclickiteam()
		{
			return  cartclickiteamname.getText();
			
		}

}
