package com.walm.qa.testcases;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.walm.qa.base.TestBase;
import com.walm.qa.pages.HomePage;
import com.walm.qa.pages.LoginPage;
import com.walm.qa.pages.MyListPage;
import com.walm.qa.pages.MyShoppingList;


public class MyListTest extends TestBase{

	LoginPage loginpage;
	HomePage homepage;
	MyListPage list;
	MyShoppingList mylist;
	
	public MyListTest()
	{
			super();
	}
	
	@BeforeMethod
	public void setprop() throws InterruptedException 
	{
		 initiate();
		 Thread.sleep(2000);
		 loginpage=new LoginPage();
		 list=new MyListPage();
		 homepage=loginpage.login(prop.getProperty("Email"),prop.getProperty("Password"));
		 Thread.sleep(2000);
		
	}
	
	@Test(priority=1)
	public void myAccountClick3() throws InterruptedException
	{
		
		mylist= list.myAccountClick3();
	}
	
	@Test(priority=2)
	public  void createlistTest()
	{
		mylist=mylist.createlist(prop.getProperty("newshoppinglist"));
		
		
	}
	
	public void findSearchButton()
	{
		mylist.searchisDispaly();
	}
	

}