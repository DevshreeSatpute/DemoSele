package utility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebElementMethods 
{
	public static void enterText(WebDriver driver, By locator, String text) 
	{
		try 
		{
			driver.findElement(locator).sendKeys(text);
		}
		catch(NoSuchElementException e) 
		{
			System.out.println("Element not foound" + e.getMessage());
		}
	}
	
	public static void clickElement(WebDriver driver, By locator) 
	{
		try 
		{
			driver.findElement(locator).click();
		}
		catch(NoSuchElementException e) 
		{
			System.out.println("Element not foound" + e.getMessage());
		}
	}
	
	public static void selectCheckbox(WebDriver driver, By locator, String option) 
	{
		List<WebElement> chkboxes = driver.findElements(locator);
		if(chkboxes.size()>0) 
		{
			for(WebElement ch : chkboxes) 
			{
				if(ch.getAttribute("value").equals(option) && (!ch.isSelected())) 
				{
					ch.click();
					break;
				}
			}
		}
		else
			System.out.println("Elemnet not found chkbox");
	}
	
	public static void selectRadio(WebDriver driver, By locator, String option) 
	{
		List<WebElement> radios = driver.findElements(locator);
		if(radios.size()>0) 
		{
			for(WebElement rb : radios) 
			{
				if(rb.getAttribute("value").equalsIgnoreCase(option)) 
				{
					rb.click();
					break;
				}
			}
		}
		else
			System.out.println("Elemnet not found radio");
	}
	
	public static void selectDDByValue(WebDriver driver, By locator, String option) 
	{
		boolean flag = false;
		Select dd = new Select(driver.findElement(locator));
		List<WebElement> options = dd.getOptions();
		for(WebElement op : options) 
		{
			if(op.getAttribute("value").equals(option)) 
			{
				dd.selectByValue(option);
				flag = true;
				break;
			}
		}
		if(flag == true) 
		{
			System.out.println("Option Selected");
		}
		else
			System.out.println("Elemnet not found radio");
	}
	
	public static void selectDDByText(WebDriver driver, By locator, String option) 
	{
		boolean flag = false;
		Select dd = new Select(driver.findElement(locator));
		List<WebElement> options = dd.getOptions();
		for(WebElement op : options) 
		{
			if(op.getText().equals(option)) 
			{
				dd.selectByValue(option);
				flag = true;
				break;
			}
		}
		if(flag == true) 
		{
			System.out.println("Option Selected");
		}
		else
			System.out.println("Elemnet not found radio");
	}
	
}

