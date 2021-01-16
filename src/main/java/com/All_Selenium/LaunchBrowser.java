package com.All_Selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static WebDriver driver;
	
	@Test
	public static void openBrowser()
	{
     WebDriverManager.chromedriver().setup();
     driver = new ChromeDriver();
     
     // To maximize
     driver.manage().window().maximize();
     
     // To minimize browser
     Dimension n = new Dimension(360,592);
     driver.manage().window().setSize(n);

     driver.get("http://Google.com/");
     driver.close();
     
	}
}
