package actionevent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import util.Driverconnection;

public class A001_MouseEvent {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = Driverconnection.connect("https://www.globalsqa.com/demo-site/draganddrop/");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//div[@rel-title='Photo Manager']/p/iframe")));
		
		WebElement img1 = driver.findElement(By.xpath("//ul[@id='gallery']/li[1]"));
		WebElement img2 = driver.findElement(By.xpath("//ul[@id='gallery']/li[2]"));
		WebElement img3 = driver.findElement(By.xpath("//ul[@id='gallery']/li[3]"));
		WebElement img4 = driver.findElement(By.xpath("//ul[@id='gallery']/li[4]"));
		
		WebElement trash = driver.findElement(By.id("trash"));
		
		Actions builder = new Actions(driver);
		builder.clickAndHold(img1).moveToElement(trash).release().build().perform();
		Thread.sleep(2000);
		builder.clickAndHold(img2).moveToElement(trash).release().build().perform();
		Thread.sleep(2000);
		builder.clickAndHold(img3).moveToElement(trash).release().build().perform();
		Thread.sleep(2000);
		Action e1 =  builder.clickAndHold(img4).moveToElement(trash).release().build();
		e1.perform();
		
		
		
		
		
		
		
		
	}
}
