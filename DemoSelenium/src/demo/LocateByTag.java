package demo;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.WebBrowser;

public class LocateByTag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WebDriver driver = WebBrowser.openBrowser("https://www.google.co.in/");
		WebDriver driver = WebBrowser.openBrowser("https://mail.rediff.com/cgi-bin/login.cgi");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("No of links :" + links.size());
		for(WebElement l :links) {
			System.out.println(l.getText());
		}
				 

	}

}
