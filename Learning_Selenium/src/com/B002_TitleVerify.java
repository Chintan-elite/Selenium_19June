package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B002_TitleVerify {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenuum data\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fb.com");
		
		String actualTilte = driver.getTitle();
		String expectedTitle = "Facebook Login page";
		
		if(expectedTitle.equals(actualTilte))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		driver.close();
		
		
		
		
		
		
		
		
		
	}
}
