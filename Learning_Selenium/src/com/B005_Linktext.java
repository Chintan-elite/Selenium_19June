package com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B005_Linktext {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenuum data\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fb.com");
		
		
		//driver.findElement(By.linkText("Forgotten password?")).click();
		//driver.findElement(By.linkText("Create a Page")).click();
		
		//driver.findElement(By.partialLinkText("Forgotten")).click();
		
		List<WebElement> links =  driver.findElements(By.partialLinkText("Create"));
//		for(WebElement link : links)
//		{
//			System.out.println(link.getText());
//		}
		links.get(2).click();	
		
		
		
	}
}
