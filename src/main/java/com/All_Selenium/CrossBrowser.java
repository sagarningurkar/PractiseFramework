package com.All_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowser {

	WebDriver driver = null;
	//String browser = "IE browser";
	//String browser1 = "Mozilla Firefox";
	String browser = "Google Chrome";
	
	
	public void Invoke(String browser)
	{
		if(browser.equalsIgnoreCase("Google Chrome"))
		{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	    }
	else if(browser.equalsIgnoreCase("Mozilla Firefox")) 
	{
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}
		
	else if(browser.equalsIgnoreCase("IE browser")) 
	{
		WebDriverManager.iedriver().setup();
		driver = new InternetExplorerDriver();
	}
}
	@Test(invocationCount = 3)
	public void launch() throws InterruptedException
	{
		Invoke(browser);
		driver.get("https://www.Google.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println("The title of page:"+ driver.getTitle());
		driver.close();
		
	}
}