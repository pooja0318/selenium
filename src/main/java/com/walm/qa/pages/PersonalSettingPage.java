package com.walm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.walm.qa.base.TestBase;

public class PersonalSettingPage extends TestBase{
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div/div[3]/div/div[2]/div[2]/div/div[2]/div/div[4]/div/span")
	WebElement MyAccount;
	
	@FindBy(xpath="//*[@id=\"my-account-nav\"]/section[1]/ul/li[7]/a")
	WebElement personasetting;
	@FindBy(xpath="//span[@id='set-edit-info']")
    WebElement editinfo;
	
	@FindBy(id="phone")
	   WebElement phn;
	
	
	@FindBy(xpath="//*[@id=\"personal-info\"]/fieldset/label[3]/input")
   WebElement firstname;
	
	@FindBy(xpath="//*[@id=\"personal-info\"]/fieldset/label[4]/input")
   WebElement lastname;

	@FindBy(xpath="//*[@id=\"personal-info\"]/fieldset/label[5]/input")
   WebElement postalcode;
	
	
	@FindBy(xpath="//*[@id=\"update-details-btn\"]")
   WebElement savebtn;
	
	@FindBy(xpath="//span[@id='set-edit-email']")
   WebElement editemail;

	@FindBy(xpath="//*[@id=\"email-change\"]/fieldset/label[2]/input")
   WebElement email;
	
	@FindBy(xpath="//*[@id=\"email-password\"]")
   WebElement epassword;
	
	@FindBy(id="update-email-btn")
   WebElement saveemail;
	
	
	@FindBy(id="set-edit-password")
   WebElement editpassword;
	
	@FindBy(id="oldPassword")
   WebElement oldpassword;
	
	@FindBy(id="confirmPassword")
   WebElement confirmpassword;
	
	@FindBy(id="password")
   WebElement newpassword;
	
	@FindBy(id="update-passwd-btn")
   WebElement savepassword;
	
	@FindBy(id="set-edit-language")
   WebElement editlanguage;
	
	@FindBy(xpath="//label[2]//i[1]")
   WebElement englishlanguage;
	

	@FindBy(xpath="//label[3]//i[1]")
   WebElement frenchlanguage;
	
	@FindBy(id="update-language-btn")
   WebElement savelanguage;
	
	
	
	@FindBy(linkText="Add your WIN and Discount Card Number to your account")
   WebElement associatediscount;
	
	@FindBy(xpath="//*[@id=\"win\"]")
   WebElement win;
	
	@FindBy(xpath="//*[@id=\"associate-change\"]/fieldset/label[4]/input")
   WebElement discountcard;
	
	@FindBy(xpath="//input[contains(@name,'agree')]")
   WebElement agree;
	
	@FindBy(id="update-associate-btn")
   WebElement saveassociate;
	
	
	//initializing the page object
		public PersonalSettingPage()
		{
			PageFactory.initElements(driver, this); 
			
		}
		public String validateHometitle() {
			return driver.getTitle();
		}
		public MyPesronalSetting SettinClick() throws InterruptedException
		{
			Actions action= new Actions(driver);
			action.moveToElement(MyAccount).build().perform();

			MyAccount.click();
			Thread.sleep(5000);
			personasetting.click();
			//Thread.sleep(5000);
			return new MyPesronalSetting();
		}
		public void editPersonalInformation(String fname,String lname,String postal)
		{
			editinfo.click();
			firstname.sendKeys(fname);
			lastname.sendKeys(lname);
			postalcode.clear();
			postalcode.sendKeys(postal);
			savebtn.click();
		}
		public void editEmail(String myemail)
		{
			js.executeScript("arguments[0].scrollIntoView();", myemail);
			editemail.click();
			email.clear();
			email.sendKeys(myemail);
			epassword.sendKeys(prop.getProperty("userpassword"));
			saveemail.click();
			
		}
		public void changePassword(String oldpsw, String newpsw, String confirmpsw)
		{
			editpassword.click();
			oldpassword.sendKeys( oldpsw);
			newpassword.sendKeys(newpsw);
			confirmpassword.sendKeys(confirmpsw);
			savepassword.click();
		}

	   
		 public void editEnglishLanguage()
		 
		 {
			 editlanguage.click();
			 englishlanguage.click();
			 savelanguage.click();
		 }
		 
	public void editFrenchLanguage()
		 
		 {
			 editlanguage.click();
			 frenchlanguage.click();
			 savelanguage.click();
		 }

	public void employeeDiscount(String windetail,String discountCard)
	{
		associatediscount.click();
		win.sendKeys(windetail);
		discountcard.sendKeys(discountCard);
		agree.click();
		saveassociate.click();
		
	}
	


}
