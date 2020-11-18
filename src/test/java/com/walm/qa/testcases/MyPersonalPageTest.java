package com.walm.qa.testcases;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.walm.qa.base.TestBase;
import com.walm.qa.pages.HomePage;
import com.walm.qa.pages.LoginPage;
import com.walm.qa.pages.MyPesronalSetting;
import com.walm.qa.pages.PersonalSettingPage;

public class MyPersonalPageTest extends TestBase{

	LoginPage loginpage;
	HomePage homepage;
	PersonalSettingPage personalsetting;
	MyPesronalSetting  settings;

	public MyPersonalPageTest ()
	{
			super();
	}
	
	@BeforeMethod
	public void setprop() throws InterruptedException 
	{
		 initiate();
		 Thread.sleep(2000);
		 loginpage=new LoginPage();
		 Thread.sleep(2000);
		 personalsetting=new PersonalSettingPage();
		 Thread.sleep(2000);
		 homepage=loginpage.login(prop.getProperty("Email"),prop.getProperty("Password"));
		 Thread.sleep(2000);
	}
	
	@Test(priority=1)
	public void SettinClick() throws InterruptedException
	{
		//testUtil.switchToframe();
		settings= personalsetting.SettinClick();
	}
	
	@Test(priority=2)
	public void EditTest() throws InterruptedException
	{
		
		settings= personalsetting.SettinClick();
		Thread.sleep(500);
		settings.editButtonClick("pooja", "patel", "N5Y 1E1");
	}
	
	@Test(priority=3)
	public void editPersonalInfo()
	{
		personalsetting.editPersonalInformation("pooja", "patel", "N5Y1E21");
	}


	@Test (enabled=false)
	public void editEmail()
	{
		personalsetting.editEmail("poojampatel1894@gmail.com");
		Assert.assertTrue(false, "poojampatel1894@gmail.com");
	}

	@Test (enabled=false)
	public void changePsw()
	{
		personalsetting.changePassword("Pooja123", "Pooja123", "Pooja123");
	}
 
	@Test (enabled=false)
	public void changeEnglishLanguage()
	{
		personalsetting.editEnglishLanguage();
	}
	
	@Test (enabled=false)
	public void changeFrenchLanguage()
	{
		personalsetting.editFrenchLanguage();
	}

	@Test (enabled=false)
	public void winAssociateDiscount()
	{
		personalsetting.employeeDiscount("poojaabc", "ABC200");;
	}

	@AfterMethod
	public void close() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.close();
	}



}
