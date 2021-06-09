package com.amazon.utils;

import org.openqa.selenium.WebElement;

public class CommonMethods extends PageInitializer {
	
	public static void sendText(WebElement element, String text) {
		//element.clear();
		element.sendKeys(text);
	}
	
	public static void click(WebElement element) {
		element.click();
	}

}
