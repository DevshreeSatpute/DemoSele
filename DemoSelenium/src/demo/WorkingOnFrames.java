package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.WebBrowser;

public class WorkingOnFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = WebBrowser.openBrowser("https://demoqa.com/frames");
		//frame(String arg) - id/name
		driver.switchTo().frame("frame1");
		System.out.println(driver.findElement(By.id("sampleHeading")).getText());
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		System.out.println(driver.findElement(By.id("sampleHeading")).getText());
		driver.close();
		
		driver = WebBrowser.openBrowser("https://demoqa.com/nestedframes");
		driver.switchTo().frame("frame1");
		System.out.println(driver.findElement(By.cssSelector("html>body")).getText());
		
		WebElement childframe = driver.findElement(By.tagName("iframe"));
		
		//frame (WebElement arg) - WebElement identified with a valid locator 
		driver.switchTo().frame(childframe);
		System.out.println(driver.findElement(By.cssSelector("html>body>p")).getText());
		driver.close();
		

	}

}
