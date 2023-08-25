package window_switching;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.Driverconnection;

public class W002_WindowHandling {
	public static void main(String[] args) {
		
		WebDriver driver = Driverconnection.connect("https://demoqa.com/browser-windows");
		
		String mainWin =  driver.getWindowHandle();
		//System.out.println("main : "+mainWin);
		
		driver.findElement(By.id("tabButton")).click();
		
		
		Set<String> allwins = driver.getWindowHandles();
		for(String win : allwins)
		{
			if(!win.equals(mainWin))
			{
				driver.switchTo().window(win);
			}
		}
		
		
		String data = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(data);
		
//		driver.close();
//		driver.switchTo().window(mainWin);
//		driver.close();
		
		driver.quit();
		
		
	}
}
