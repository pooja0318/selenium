package com.walm.qa.testcases;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.walm.qa.base.TestBase;
import com.walm.qa.pages.Cart;
import com.walm.qa.pages.HomePage;
import com.walm.qa.pages.LoginPage;
import com.walm.qa.pages.MyShoppingCartPage;
//import com.walm.qa.pages.OrderHistoryPage;
import com.walm.qa.pages.ShoppingCartPage;

public class ShoppingCartPageTest extends TestBase{
	
		LoginPage loginpage;
		HomePage homepage;
		ShoppingCartPage shoppingcart;
		MyShoppingCartPage  myshoppingcart;
		Cart cart;
		
		public ShoppingCartPageTest()
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
			 shoppingcart=new ShoppingCartPage();
			 myshoppingcart =new MyShoppingCartPage();
			 homepage=loginpage.login(prop.getProperty("Email"),prop.getProperty("Password"));
			 Thread.sleep(2000);
			
		}
		
		@Test(priority=1)
		public void myshoppingcartClick() throws InterruptedException
		{
			//testUtil.switchToframe();
			 myshoppingcart=  shoppingcart.ShoppingCartClick();
			 myshoppingcart.ShoppingCartselectClick();
			 shoppingcart.clickonfirstiteam();
			 shoppingcart.addfirstiteamtocart();
			 shoppingcart.addseconditeamtocart();
			 shoppingcart.checkout();
			 String actualpriceofproduct= cart.getFirstProductPrice();
			 Assert.assertTrue(true, actualpriceofproduct);
			 System.out.println("Actualprice of product is"  + actualpriceofproduct);
				 
		}
		
		@Test  (priority=3)
		public void increaseTheQuantityTest() throws InterruptedException
		{

			 myshoppingcart=  shoppingcart.ShoppingCartClick();
			 myshoppingcart.ShoppingCartselectClick();
			 shoppingcart.clickonfirstiteam();
			 shoppingcart.addfirstiteamtocart();
			 shoppingcart.addseconditeamtocart();
			 shoppingcart.checkout();
			 cart.increasequanitityClick();;
			 String newupdateprice= cart.getupdatedprice();
			 System.out.println( "new price of cart is" + newupdateprice);
			
		}
		public void addSameItemMultipleTimes() throws InterruptedException
		{
			 myshoppingcart=  shoppingcart.ShoppingCartClick();
			 myshoppingcart.ShoppingCartselectClick();
			 shoppingcart.clickonfirstiteam();
			 shoppingcart.addfirstiteamtocart();
			 shoppingcart.addseconditeamtocart();
			 shoppingcart.checkout();
			 String actualtotalnumberofiteam= cart.getTotalnumberofiteam();
			 Assert.assertEquals(actualtotalnumberofiteam, "4 items");
				
		}
		
		public void iteaminthecart() throws InterruptedException
		{
			 myshoppingcart=  shoppingcart.ShoppingCartClick();
			 myshoppingcart.ShoppingCartselectClick();
			 shoppingcart.clickonfirstiteam();
			 shoppingcart.addfirstiteamtocart();
			 shoppingcart.addseconditeamtocart();
			 shoppingcart.checkout();
			 cart.clickfirstiteamofcart();
			 String clickiteamname=cart.nameoffristclickiteam();
			 System.out.println("click iteam name is"+ clickiteamname);
		}
		
		@Test (priority=6)
		public void reopenAfterClosingTest() throws InterruptedException 
		{
			myshoppingcart=  shoppingcart.ShoppingCartClick();
			myshoppingcart.ShoppingCartselectClick();
			shoppingcart.clickonfirstiteam();
			shoppingcart.addfirstiteamtocart();
			shoppingcart.addseconditeamtocart();
			shoppingcart.checkout();
			homepage=loginpage.login(prop.getProperty("Email"),prop.getProperty("Password"));
			Thread.sleep(2000);
			homepage.clickOnCart();
			String actualtotalnumberofiteam= cart.getTotalnumberofiteam();
			Assert.assertEquals(actualtotalnumberofiteam, "4 items");
		}
}
