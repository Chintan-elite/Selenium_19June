package com;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.Driverconnection;

@RunWith(Parameterized.class)
public class J008_Login_Parameters {
	
	String uname;
	String pass;
	
	public J008_Login_Parameters(String uname, String pass) {
		super();
		this.uname = uname;
		this.pass = pass;
	}

	static WebDriver driver;
	@BeforeClass
	public static void setup()
	{
		 driver = Driverconnection.connect("https://www.fb.com");
		
	}
	
	
	@Test
	public void login()
	{
		
		WebElement username =  driver.findElement(By.id("email"));
		username.clear();
		username.sendKeys(uname);
		
		WebElement password = driver.findElement(By.id("pass"));
		password.clear();
		password.sendKeys(pass);
		
		driver.findElement(By.name("login")).click();	
		
		assertEquals("Log in to Facebook", driver.getTitle());
		
		
		driver.navigate().back();
	}
	
	@Parameters
	public static List<Object[]> getData()
	{
		Object obj[][] = new Object[3][2];
		
		obj[0][0] = "test@gmail.com";
		obj[0][1] = "test123";
		
		obj[1][0] = "abc@gmail.com";
		obj[1][1] = "abc123";
		
		obj[2][0] = "xyz@gmail.com";
		obj[2][1] = "xyz123";
		
		
		return Arrays.asList(obj);
		
		
		
		
		
	}
}
