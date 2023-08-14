package com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B006_Tagname {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenuum data\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fb.com");
		
		
//		List<WebElement> tags = driver.findElements(By.tagName("input"));
//		for(WebElement tag : tags)
//		{
//			System.out.println(tag.getAttribute("id"));
//		}
		
		List<WebElement> tags = driver.findElements(By.tagName("a"));
		for(WebElement tag : tags)
		{
			//System.out.println(tag.getAttribute("href"));
			System.out.println(tag.getText());
		}
		
		
		
	}
}
