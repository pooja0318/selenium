package com.walm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.walm.qa.util.TestUtil;



public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	static public	JavascriptExecutor js;
	static public WebDriverWait wait;
	
	public TestBase() 
	{
		try {
			prop=new Properties();
			FileInputStream file=new FileInputStream("C:\\Users\\keval\\eclipse-workspace\\AutomationofWalmart\\src\\main\\java\\com\\walm\\qa\\config\\config.properties");
		prop.load(file);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		
	}catch(IOException e) {
		e.printStackTrace();
		
	}
	}
	public static void initiate() {
		
		//read properties from config file
			String Browsername=prop.getProperty("browser");
			if (Browsername.equals("Firefox"))
			//if (Browsername=="Firefox")
			{
			System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
			driver=new FirefoxDriver();
			}
			else if(Browsername.equals("Chrome")) {
			System.setProperty("webdriver.chrom.driver","C:\\chromedriver.exe");
			driver=new ChromeDriver();
			
			}
			driver.manage().window().maximize(); //we will specify common features
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_timeout, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(TestUtil.implict_wait, TimeUnit.SECONDS);//time can be changes according to page, so we will put static variable in testutil.java class
			
			driver.get(prop.getProperty("url")); //prop is defined at global level so we can use it anywhere
			
			js = (JavascriptExecutor)driver;
		}
	
		}

	





