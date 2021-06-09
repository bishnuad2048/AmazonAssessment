package com.amazon.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public static WebDriver driver;
	
	@BeforeMethod
	public static WebDriver setUp() {
	
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
		 driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 driver.get("https://www.amazon.com/");
		 PageInitializer.initiliazer();
		 return driver;
}
}