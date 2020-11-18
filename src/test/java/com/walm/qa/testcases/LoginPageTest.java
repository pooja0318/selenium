package com.walm.qa.testcases;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.walm.qa.base.TestBase;
import com.walm.qa.pages.HomePage;
import com.walm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	public  LoginPageTest()
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
	}
	
	@Test(priority=1)
	public void loginTest()
	{
		homepage=loginpage.login(prop.getProperty("Email"),prop.getProperty("Password"));
		
	}
	
}
