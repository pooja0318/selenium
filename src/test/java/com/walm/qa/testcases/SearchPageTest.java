package com.walm.qa.testcases;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.walm.qa.base.TestBase;
import com.walm.qa.pages.HomePage;
import com.walm.qa.pages.LoginPage;
import com.walm.qa.pages.SearchPage;
import com.walm.qa.pages.SearchResultPage;

public class SearchPageTest extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	SearchPage search;
	SearchResultPage searchresult;;
	
	public SearchPageTest()
	{
			super();
	}
	
	@BeforeMethod
	public void setprop() throws InterruptedException 
	{
		 initiate();
		 Thread.sleep(2000); 
		 loginpage=new LoginPage();
		 search=new SearchPage();
		 searchresult=new SearchResultPage();
		 homepage=loginpage.login(prop.getProperty("Email"),prop.getProperty("Password"));
		 Thread.sleep(2000);
		
	}
	
	@Test(priority=1)
	public void SearchTest() throws InterruptedException
	{
		//Thread.sleep(5000);
		 searchresult= search.searchButtonClick("computers" + Keys.ENTER);
		//Thread.sleep(2000);	
	}
	
	@Test(priority=3)
	public void testResult()
	{
		String  actualtestreslttesxt=searchresult.getSearchResultedText();
		Assert.assertEquals(actualtestreslttesxt,"","search result pass");
	}
}



