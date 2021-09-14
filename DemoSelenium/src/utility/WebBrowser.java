package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebBrowser {

	public static WebDriver openBrowser (String url) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver_win32\\chromedriver.exe");
//		System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\Driver\\geckodriver.exe");
		WebDriver driver = new ChromeDriver();
//		WebDriver driver = new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
	}
	public static void verifyTitle(WebDriver driver, String expTitle) 
	{
		if(driver.getTitle().equals(expTitle))
		{
			System.out.println("pass");
		}
		else 
			System.out.println("fail");
	}
	public static void titleContains(WebDriver driver, String expTitle) 
	{
		if(driver.getTitle().contains(expTitle))
		{
			System.out.println("pass");
		}
		else
			System.out.println("fail");
	}
}
