package com.walm.qa.testcases;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.walm.qa.base.TestBase;
import com.walm.qa.pages.HomePage;
import com.walm.qa.pages.LoginPage;
import com.walm.qa.pages.MyOrderPage;
import com.walm.qa.pages.OrderHistoryPage;


public class OrderHistoryPageTest extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	OrderHistoryPage Orderhistory;
	MyOrderPage myorder;
	
	public OrderHistoryPageTest()
	{
			super();
	}
	
	@BeforeMethod
	public void setprop() throws InterruptedException 
	{
		 initiate();
		 Thread.sleep(2000);
		 //testUtil=new TestUtil();	
		 loginpage=new LoginPage();
		 Orderhistory=new OrderHistoryPage();
		 homepage=loginpage.login(prop.getProperty("Email"),prop.getProperty("Password"));
		 Thread.sleep(2000);
		
	}
	
	@Test(priority=1)
	public void myAccountClick2() throws InterruptedException
	{
		myorder= Orderhistory.myAccountClick2();
	}
	
}
