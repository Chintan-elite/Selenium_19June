package window_switching;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.Driverconnection;

public class W004_NestedFrame {
	public static void main(String[] args) {
		
		WebDriver driver = Driverconnection.connect("https://demoqa.com/nestedframes");
		
		driver.switchTo().frame(driver.findElement(By.id("frame1")));
		
//		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
//		System.out.println(frames.size());
		
		driver.switchTo().frame(0);
		
		String data = driver.findElement(By.tagName("p")).getText();
		System.out.println(data);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
