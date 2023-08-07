package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B001_BrowserDemo {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenuum data\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//max
		driver.manage().window().maximize();
		
		//open url
		driver.get("https://www.facebook.com/");
		
		
		
		
		
		
		Thread.sleep(5000);
		
		//driver.close();  //peritcular window
		driver.quit();  //all tabs
		
		
	}
}
