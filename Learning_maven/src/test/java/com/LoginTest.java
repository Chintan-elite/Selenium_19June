package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import util.Driverconnection;

public class LoginTest {
	
	@Test
	public void loginTest()
	{
		WebDriver driver = Driverconnection.connect("https://www.fb.com");
		driver.findElement(By.id("email")).sendKeys("test@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("test");
		driver.findElement(By.name("login")).click();
	}
}
