package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.WebBrowser;

public class LocatingLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Gmail")).click();
		if(driver.getTitle().equals("Gmail - Email from Google"));
		{
			System.out.println("Pass");
		}
		WebBrowser.verifyTitle(driver, "Gmail - Email from Google");
		driver.navigate().back();
		driver.findElement(By.linkText("Images")).click();
		String actTitle = driver.getTitle();
		if(actTitle.equals("Google Images"))
		{
			System.out.println("Pass");
		}
		else {
			System.out.println("fail");
		}
		
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Advert")).click();
		
		//driver.close();

	}

}
