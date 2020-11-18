package com.walm.qa.testcases;
import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.walm.qa.base.TestBase;
import com.walm.qa.pages.Cart;
import com.walm.qa.pages.CartResultPage;
import com.walm.qa.pages.HomePage;
import com.walm.qa.pages.LoginPage;

public class CartResultTest extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	Cart cartsearch;
	CartResultPage cartsearchresult;;
	
	public CartResultTest()
	{
			super();
	}
	
	@BeforeMethod
	public void setprop() throws InterruptedException 
	{
		 initiate();
		 Thread.sleep(2000);
		 loginpage=new LoginPage();
		 cartsearch=new Cart();
		 cartsearchresult=new CartResultPage();
		 homepage=loginpage.login(prop.getProperty("Email"),prop.getProperty("Password"));
		 Thread.sleep(2000);
	}
	
	@Test(priority=1)
	public void SearchTest() throws InterruptedException
	{
		cartsearchresult= cartsearch.searchButtonClick("clothes" + Keys.ENTER);
		cartsearchresult.ShoppingCartselectClick1();
		cartsearchresult.Addtocart();
	}
	
}
