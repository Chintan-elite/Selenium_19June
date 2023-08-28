package window_switching;

import java.util.Iterator;
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
//		for(String win : allwins)
//		{
//			
//			System.out.println(win);
//			if(!win.equals(mainWin))
//			{
//				driver.switchTo().window(win);
//			}
//		}

		Iterator<String> itr = allwins.iterator();
		System.out.println(itr.next());
		//System.out.println(itr.next());
		driver.switchTo().window(itr.next());
		
		String data = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(data);
		
//		driver.close();
//		driver.switchTo().window(mainWin);
//		driver.close();
		
		driver.quit();
		
		
	}
}
