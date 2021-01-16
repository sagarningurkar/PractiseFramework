package com.All_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertionDemo {
	
	String expectedtitle = "Onlin Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
	
	@Test
	public void Check()
	{
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.amazon.in/");
	   // System.out.println(driver.getTitle());
	    
	    String actualTitle = driver.getTitle();
	    
	    Assert.assertEquals(actualTitle, expectedtitle);
	    driver.close();
	}

}
