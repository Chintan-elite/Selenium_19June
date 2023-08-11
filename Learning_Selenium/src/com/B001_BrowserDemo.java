package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class B001_BrowserDemo {
	public static void main(String[] args) throws InterruptedException {
		
//		System.setProperty("webdriver.chrome.driver", "D:\\selenuum data\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
			
//		System.setProperty("webdriver.edge.driver", "D:\\selenuum data\\edgedriver_win64\\msedgedriver.exe");
//		WebDriver driver = new EdgeDriver();
		
		System.setProperty("webdriver.gecko.driver", "D:\\selenuum data\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		
		//max
		driver.manage().window().maximize();
		
		//open url
		driver.get("https://www.facebook.com/");
			
		Thread.sleep(5000);
		
		//driver.close();  //peritcular window
		driver.quit();  //all tabs
		
		
	}
}
