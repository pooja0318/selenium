package com.walm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.walm.qa.base.TestBase;

public class MyAddressPage extends TestBase {
	@FindBy(id="edit-address-btn")
	WebElement editbutton;
	@FindBy(id="shipping-first-name")
	WebElement fname;
	
	@FindBy(id="shipping-last-name")
	WebElement lname;
	@FindBy(id="shipping-address1")
	WebElement add1;
	@FindBy(id="shipping-address2")
	WebElement add2;
	@FindBy(id="shipping-city")
	WebElement city;
	@FindBy(id="shipping-postal-code")
	WebElement postalcode;
	
	@FindBy(id="shipping-phone")
	WebElement phn;
	@FindBy(id="save-address-btn")
	WebElement saveButton;
	
	public MyAddressPage()
	{
		PageFactory.initElements(driver, this); 
		
	}
	
	public void editButtonaddClick(String fn,String ln,String addr,String Addres,String ct,String pc,String pn,String pro)
	{
		editbutton.click();
		//phnumber.sendKeys(ph);
		fname.sendKeys(fn); 
		lname.sendKeys(ln);
		add1.sendKeys(addr);
		add2.sendKeys(Addres);
		city.sendKeys(ct);
		Select select=new Select(driver.findElement(By.id("provinces")));
		select.selectByVisibleText(pro);
		postalcode.sendKeys(pc);
		phn.sendKeys(pn);
		saveButton.click();
	
		
		

	}
}

