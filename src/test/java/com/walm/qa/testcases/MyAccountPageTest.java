package com.walm.qa.testcases;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.walm.qa.base.TestBase;
import com.walm.qa.pages.HomePage;
import com.walm.qa.pages.LoginPage;
import com.walm.qa.pages.MyAccountPage;
import com.walm.qa.pages.MyNewAccountPage;
import com.walm.qa.pages.RecommendationPage;

public class MyAccountPageTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	MyAccountPage  account;
	MyNewAccountPage newaccount;
	RecommendationPage recom;
	
	public  MyAccountPageTest()
	{
			super();
	}
	
	@BeforeMethod
	public void setprop() throws InterruptedException 
	{
		 initiate();
		 Thread.sleep(2000);
		 loginpage=new LoginPage();
		 account=new MyAccountPage();
		 homepage=loginpage.login(prop.getProperty("Email"),prop.getProperty("Password"));
		 Thread.sleep(2000);
		
	}
	
	@Test(priority=1)
	public void myAccountClick1() throws InterruptedException
	{
		newaccount=account.myAccount1Click();
	}
	
	@Test(priority=2)
	public void shoppingcartclick() throws InterruptedException
	{
		
		newaccount=account.myAccount1Click();
		Thread.sleep(500);
		newaccount.shoppingcartClick();
		Thread.sleep(2000);
	}
	
}
