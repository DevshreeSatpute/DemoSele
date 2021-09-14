package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.manage().window().maximize();
		WebElement txtusername = driver.findElement(By.id("login1"));
		txtusername.sendKeys("testuser");
		
		driver.findElement(By.id("password")).sendKeys("test@123");
		WebElement chbox = (WebElement) driver.findElements(By.id("remember"));
		if(!chbox.isSelected()) {
			chbox.click();
		}
		
		driver.findElement(By.name("proceed")).click();
		
		String acterr = driver.findElement(By.cssSelector("div#div_login_error>b")).getText();
		if(acterr.equals("Wrong username and password combination."))
		{
			System.out.println("Pass");
		}
		else
			System.out.println("Fail");

	}

}
