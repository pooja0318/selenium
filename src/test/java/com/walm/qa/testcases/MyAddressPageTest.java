package com.walm.qa.testcases;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.walm.qa.base.TestBase;
import com.walm.qa.pages.Addresspage;
import com.walm.qa.pages.HomePage;
import com.walm.qa.pages.LoginPage;
import com.walm.qa.pages.MyAddressPage;

public class MyAddressPageTest extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	MyAddressPage myaddress;
	Addresspage address;
	
	public MyAddressPageTest()
	{
			super();
	}
	
	@BeforeMethod
	public void setprop() throws InterruptedException 
	{
		 initiate();
		 Thread.sleep(2000);
		 loginpage=new LoginPage();
		 myaddress=new MyAddressPage();
		 Thread.sleep(2000);
		 homepage=loginpage.login(prop.getProperty("Email"),prop.getProperty("Password"));
	}
	
	@Test(priority=1)
	public void AddressClick() throws InterruptedException
	{
		myaddress= address.addressClick();
	}
	@Test(priority=2)
	public void EditButtonTest() throws InterruptedException
	{
		
		myaddress= address.addressClick();
		Thread.sleep(500);
		myaddress.editButtonaddClick("pooja", "Patel", "551 vanier", "drive", "Kitchener", "N5Y1E1", "2264484697", "Ontario");;
	}

}
