package com.All_Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleWindow {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/mnjuser/homepage");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//div[contains(text(),'Tools')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Services')]")).click();
		
		Set<String> ids = driver.getWindowHandles();
		Iterator <String> it = ids.iterator();
		
		String ParentID = it.next();
		String ChildID = it.next();
		String SubChild = it.next();
		
		driver.switchTo().window(ChildID);
		System.out.println(driver.getTitle());
		
		
		driver.switchTo().window(SubChild);
		System.out.println(driver.getTitle());
		driver.quit();
		
		
	}
	

}