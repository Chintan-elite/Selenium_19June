package com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class B004_FbSignUp {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenuum data\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fb.com");
		
		driver.findElement(By.linkText("Create new account")).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.name("firstname")).sendKeys("test");
		driver.findElement(By.name("lastname")).sendKeys("test");
		driver.findElement(By.name("reg_email__")).sendKeys("9885968574");
		driver.findElement(By.name("reg_passwd__")).sendKeys("test123");
		
		
		WebElement day = driver.findElement(By.id("day"));
		Select days = new Select(day);
		days.selectByVisibleText("15");
		
		WebElement month = driver.findElement(By.id("month"));
		Select months = new Select(month);
		months.selectByIndex(3);
		
		WebElement year = driver.findElement(By.id("year"));
		Select years = new Select(year);
		years.selectByValue("2020");
		
		
		List<WebElement> gender = driver.findElements(By.name("sex"));
		gender.get(1).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
