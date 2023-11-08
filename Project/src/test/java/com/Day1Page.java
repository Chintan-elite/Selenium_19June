package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Day1Page {
	
		WebDriver driver;
		
		public Day1Page(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		
		@FindBy(name="uid")
		WebElement username;
		
		@FindBy(name="password")
		WebElement password;
		
		@FindBy(name="btnLogin")
		WebElement login;
		
		
		public void enterEmail(String userEmail)
		{
			username.sendKeys(userEmail);
		}
		
		public void enterPass(String userPass)
		{
			password.sendKeys(userPass);
		}
		
		public void loginClick()
		{
			login.click();
		}
		
		
}
