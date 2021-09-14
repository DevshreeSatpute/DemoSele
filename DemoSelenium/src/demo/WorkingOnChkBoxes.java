package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingOnChkBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.echoecho.com/htmlforms09.htm");
		
		driver.manage().window().maximize();
		
		List<WebElement> chkboxes = driver.findElements(By.cssSelector("td.table5>input"));
		for(WebElement ch : chkboxes) {
			String op = ch.getAttribute("value");
			if(op.equals("Cheese") && (!ch.isSelected())) {
				ch.click();
				break;
			}
		}
		for(WebElement ch : chkboxes) {
			String op = ch.getAttribute("value");
			if(op.equals("Milk") && (!ch.isSelected())) {
				ch.click();
				break;
			}
		}

	}

}
