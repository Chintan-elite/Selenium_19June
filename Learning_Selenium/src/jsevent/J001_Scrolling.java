package jsevent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.Driverconnection;

public class J001_Scrolling {
	public static void main(String[] args) {
		
		WebDriver driver = Driverconnection.connect("https://www.facebook.com/");
		
		J003_ScreenShot.getScreenShot(driver, "D://test//fb.png");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//js.executeScript("window.scrollBy(0,50)");
		
		WebElement link = driver.findElement(By.linkText("Instagram"));
		//js.executeAsyncScript("arguments[0].scrollIntoView()", link);		
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		J003_ScreenShot.getScreenShot(driver, "D://test//fb1.png");
		
		
	}
}
