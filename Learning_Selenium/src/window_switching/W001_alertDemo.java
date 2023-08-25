package window_switching;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.Driverconnection;

public class W001_alertDemo {
	public static void main(String[] args) {
		
		
		WebDriver driver = Driverconnection.connect("https://demoqa.com/alerts");
		
		
//		driver.findElement(By.id("alertButton")).click();
//		Alert alert =  driver.switchTo().alert();
//		//System.out.println(alert.getText());
//		alert.accept();
		
		
//		driver.findElement(By.id("timerAlertButton")).click();
//		try {
//			Thread.sleep(7000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
		
		
//		driver.findElement(By.id("confirmButton")).click();
//		Alert alert = driver.switchTo().alert();
//		alert.dismiss();
//		
		
		driver.findElement(By.id("promtButton")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Hello");
		alert.accept();
		
		
	}
}
