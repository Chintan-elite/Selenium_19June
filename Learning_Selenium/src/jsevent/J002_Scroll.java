package jsevent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.Driverconnection;

public class J002_Scroll {
	public static void main(String[] args) {
		
		WebDriver driver = Driverconnection.connect("https://www.amazon.in/");
		
		//WebElement element = driver.findElement(By.xpath("//*[text()='Today’s Deals']"));
		WebElement element = driver.findElement(By.linkText("Shop daily essentials"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView()", element);
		
		
		
		
	}
}
