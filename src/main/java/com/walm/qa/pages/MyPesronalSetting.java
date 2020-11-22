package com.walm.qa.pages;

import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.walm.qa.base.TestBase;

public class MyPesronalSetting extends TestBase{
	@FindBy(id="set-edit-info")
	WebElement editbutton;
	@FindBy(name="phone")
	WebElement phnumber;
	@FindBy(name="firstName")
	WebElement fname;
	@FindBy(name="lastName")
	WebElement lname;
	@FindBy(name="postalCode")
	WebElement postalcode;
	@FindBy(xpath="//*[@id=\"update-details-btn\"]")
	WebElement saveButton;
	
	public MyPesronalSetting()
	{
		PageFactory.initElements(driver, this); 
		
	}
	
	public void editButtonClick(String fn,String ln,String pc)
	{
		editbutton.click();
		fname.sendKeys(fn); 
		lname.sendKeys(ln);
		postalcode.sendKeys(pc);
		saveButton.click();
	}
}
