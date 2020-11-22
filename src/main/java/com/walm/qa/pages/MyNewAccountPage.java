package com.walm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.walm.qa.base.TestBase;

public class MyNewAccountPage extends TestBase{
	@FindBy(id="shopping-cart-icon")
	WebElement shoppingCart;
	
	@FindBy(xpath="@FindBy(id=\"shopping-cart-icon\")\r\n" + 
			"	WebElement shoppingCart;\r\n" + 
			"	")
	WebElement promocode;
	
	@FindBy(id="redeem-promo-code-btn")
	WebElement redeemcode;
	
	public MyNewAccountPage()
	{
		PageFactory.initElements(driver, this); 
		
	}
	
	public void shoppingcartClick()
	{
		shoppingCart.click();
	}
	public void promocodeClick(String pc)
	{
		
		promocode.sendKeys(pc);
		redeemcode.click();
	}

}
