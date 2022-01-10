package com.pages.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class saucepage {
	WebDriver driver;
	 //UI Elements
	By username = By.id("txtUsername");
	By password = By.name("txtPassword");
	By loginBtn = By.xpath("//*[@id=\"btnLogin\"]");
	By logo = By.xpath("//*[@id=\"divLogo\"]/img");

	//Constructor to initialize current class objects
	public void LoginPage(WebDriver driver) {
	 this.driver=driver;
	}
	//User Actions methods
	public boolean validateLogo() {
	 driver.findElement(logo).isDisplayed();
	 return true;

}
	public void login() {
		driver.findElement(By.id(username)).sendKeys("txtUsername");
		driver.findElement(By.id(password)).sendKeys("txtPassword");
		driver.findElement(By.id("btnLogin")).click();
		 //return new HomePage();
		}
		}


