package com.amazon.test;




import org.testng.Assert;
import org.testng.annotations.Test;
import com.amazon.utils.CommonMethods;

public class Steps extends CommonMethods {
	public static String expectedPrice="$47.49";
	@Test	
	public void method() {
		sendText(obj.textBox, "qa testing for beginners");
		click(obj.searchBtn);
		click(obj.firstItem);
		Assert.assertEquals(obj.price.getText(), expectedPrice);
		click(obj.addCart);
		Assert.assertEquals(obj.priceBeforeCheckout.getText(), expectedPrice);
		click(obj.checkOut);
		
		
	}		
}

