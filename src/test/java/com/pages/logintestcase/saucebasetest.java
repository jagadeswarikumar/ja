package com.pages.logintestcase;

import org.openqa.selenium.By;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import url.saucebaseclass;

public class saucebasetest extends saucebaseclass {
	@Test(dataProvider="Credentials1")
	public void loginTest(String username,String password) {
		


	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	driver.findElement(By.id("login-button")).click();
	String actualURL=driver.getCurrentUrl();

	String expectedURL="https://www.saucedemo.com/";
	AssertJUnit.assertEquals(actualURL, expectedURL);
	

	}
}
