package com.walm.qa.testcases;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.walm.qa.base.TestBase;
import com.walm.qa.pages.HomePage;
import com.walm.qa.pages.LoginPage;
import com.walm.qa.pages.RecommendationPage;

public class HomePageTest extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	RecommendationPage recom;
	
	public  HomePageTest()
	{
			super();
	}
	
	@BeforeMethod
	public void setprop() throws InterruptedException 
	{
		 initiate();
		 Thread.sleep(2000);
		 loginpage=new LoginPage();
		 recom=new RecommendationPage();
		 homepage=loginpage.login(prop.getProperty("Email"),prop.getProperty("Password"));
		 Thread.sleep(2000);
		
	}
	
	@Test(priority=1)
	public void myAccountClick() throws InterruptedException
	{
		recom=homepage.myAccountClick();
	}
	
}
