package Com.KeywordFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllKeyword {
	
	
	public static void openBrowser(String browsername)
	{
		switch (browsername) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			Constant.driver = new ChromeDriver();
			break;
			
		case "firefox":
			WebDriverManager.chromedriver().setup();
			Constant.driver = new FirefoxDriver();
			break;
			
		case "IE":
			WebDriverManager.chromedriver().setup();
			Constant.driver = new InternetExplorerDriver();
			break;

		default:
			System.out.println("invalid browser name:"+ browsername);
			break;
		}
	}
	
	// return nothing
	public static void openUrl(String url)
	{
		System.out.println("Enter URL");
		Constant.driver.get(url);
	}
	
	// To enter text we can create methd
	public static void enterText(String locatorType, String LocatorValue, String EnterText) 
	{
		switch (locatorType)
		{
		case "xpath":
			Constant.driver.findElement(By.xpath(LocatorValue)).sendKeys(EnterText);
			System.out.println("Enter a Text");
			break;
			
		case "id":
			Constant.driver.findElement(By.id(LocatorValue)).sendKeys(EnterText);
			System.out.println("Enter a Text");
			break;
			
		case "className":
			Constant.driver.findElement(By.className(LocatorValue)).sendKeys(EnterText);
			System.out.println("Enter a Text");
			break;
			
		case "name":
			Constant.driver.findElement(By.name(LocatorValue)).sendKeys(EnterText);
			System.out.println("Enter a Text");
			break;
			
		case "cssSelector":
			Constant.driver.findElement(By.cssSelector(LocatorValue)).sendKeys(EnterText);
			System.out.println("Enter a Text");
			break;
			
		case "linkText":
			Constant.driver.findElement(By.linkText(LocatorValue)).sendKeys(EnterText);
			System.out.println("Enter a Text");
			break;
			
		case "partialLinkText":
			Constant.driver.findElement(By.partialLinkText(LocatorValue)).sendKeys(EnterText);
			System.out.println("Enter a Text");
			break;
			
		case "tagName":
			Constant.driver.findElement(By.tagName(LocatorValue)).sendKeys(EnterText);
			System.out.println("Enter a Text");
			break;

		default:
			System.out.println("Text is not valid :" + locatorType);
			break;
		}
	}
	
	public static void clkOperation(String locatortype, String locatorValue)
	{
		switch (locatortype) {
		case "xpath":
			Constant.driver.findElement(By.xpath(locatorValue)).click();
			System.out.println("Click on WebElement");
			break;
			
		case "id":
			Constant.driver.findElement(By.id(locatorValue)).click();
			System.out.println("Click on WebElement");
			break;
			
		case "cssSelector":
			Constant.driver.findElement(By.cssSelector(locatorValue)).click();
			System.out.println("Click on WebElement");
			break;
			
		case "name":
			Constant.driver.findElement(By.name(locatorValue)).click();
			System.out.println("Click on WebElement");
			break;

		default:
			System.out.println("unable to click on Element:"+ locatortype);
			break;
		}
	}
	
	public static void selectDropdownByIndex(String locatorValue, int i)
	{
		Select sel = new Select(Constant.driver.findElement(By.xpath("locatorValue")));
		sel.selectByIndex(i);
		
	}
	
	public static void selectByValue_Text(String locatorValue, String text)
	{
		Select sel = new Select(Constant.driver.findElement(By.xpath(locatorValue)));
		sel.deselectByValue(text);
		sel.deselectByVisibleText(text);
	}
	
	public static void maximize()
	{
		Constant.driver.manage().window().maximize();
	}
	
	public static void minimize()
	{
		Dimension n = new Dimension(360,592);
		Constant.driver.manage().window().setSize(n);
	}
	
	public static void closeBrowser()
	{
		Constant.driver.close();
	}
	
	public static void closeAll()
	{
		Constant.driver.quit();
	}

	
	public static void enable(String locatorValue)
	{
		Constant.driver.findElement(By.xpath("locatorValue")).isEnabled();
	}
	
	public static void display(String locatorValue)
	{
		Constant.driver.findElement(By.xpath("locatorValue")).isDisplayed();
	}
	
	public static void selected(String locatorValue)
	{
		Constant.driver.findElement(By.xpath("locatorValue")).isSelected();
	}
	
	public static void Wait()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void getText(String locatorvalue)
	{
		System.out.println("Get text of webElement");
		Constant.driver.findElement(By.xpath(locatorvalue)).getText();
	}
	
	
	public static void SCroll(int x, int y) 
	{
		JavascriptExecutor js = (JavascriptExecutor) Constant.driver;

		js.executeScript("window.scrollBy(" + x + "," + y + ")");
	}
	
}
