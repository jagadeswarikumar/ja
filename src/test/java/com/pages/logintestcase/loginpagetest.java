package com.pages.logintestcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.Assert;
import com.pages.login.login;




@Test
public class loginpagetest {
	

	public void verifyLogo() {
	System.setProperty("webdriver.chrome.driver","C:\\Selenium_FIIT\\chromedriver_win32\\chromedriver.exe");//path

	 WebDriver driver= new ChromeDriver();
	 login loginpage = new login(driver);
	 driver.manage().window().maximize();
	 driver.get("https://opensourcedemo.orangehrmlive.com/index.php/auth/validateCredentials");
	 boolean flag=loginpage.validateLogo();
	 Assert.assertTrue(flag);
	}
	 
	public void verifyLogin() {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_FIIT\\chromedriver_win32\\chromedriver.exe");//path
		WebDriver driver= new ChromeDriver();
		 login loginpage = new login(driver);
		 driver.manage().window().maximize();
		 driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
		 loginpage.login1();
		
	 String actualURL= driver.getCurrentUrl();
	 String expectedURL= "https://opensourcedemo.orangehrmlive.com/index.php/dashboard";
	 Assert.assertEquals(actualURL, expectedURL);
	}
	// @AfterMethod
	// public void tearDown() {
	// driver.close();
}

