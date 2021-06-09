package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.utils.BaseClass;

public class PageElement {
	@FindBy(id="twotabsearchtextbox")
	public WebElement textBox;
	
	@FindBy(id="nav-search-submit-button")
	public WebElement searchBtn;
	
	@FindBy(xpath="//div[@id='a-popover-sp-info-popover-1617296279']//following::h2[1]/a/span")
	public WebElement firstItem;
	
	@FindBy(xpath="//span[@id='newBuyBoxPrice']")
	public WebElement price;
	
	@FindBy(id="add-to-cart-button")
	public WebElement addCart;
	
	@FindBy(xpath="//div[@id='hlb-subcart']//following-sibling::span[2]")
	public WebElement priceBeforeCheckout;
	
	@FindBy(id="hlb-ptc-btn-native")
	public WebElement checkOut;
	
	
	public PageElement() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	


}
