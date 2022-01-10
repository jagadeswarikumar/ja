package com.pages.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login {
	By username = By.id("txtUsername");
	By password = By.name("txtPassword");
	By loginBtn = By.xpath("//*[@id=\"btnLogin\"]");
	By logo = By.xpath("//*[@id=\"divLogo\"]/img");
	private WebDriver driver;

	//Constructor to initialize current class objects
	public login(WebDriver driver) {
	 this.driver=driver;
	}
	//User Actions methods
	public boolean validateLogo() {
	 driver.findElement(logo).isDisplayed();
	 return true;
	}
	 public  void login1() {
		 driver.findElement(username).sendKeys("Admin");
		 driver.findElement(password).sendKeys("admin123");
		 driver.findElement(loginBtn).click();
		 //return new HomePage();
}
}

