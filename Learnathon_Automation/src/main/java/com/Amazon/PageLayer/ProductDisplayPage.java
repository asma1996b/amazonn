package com.Amazon.PageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDisplayPage {
		public static String title;
		public static String price;
		public ProductDisplayPage(WebDriver driver) 
		{
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="//span[@id='productTitle']")
		private WebElement product_title;

		@FindBy(xpath="(//span[@class='a-price-whole'])[1]")
		private WebElement product_price;
		
		@FindBy(xpath="//input[@id='add-to-cart-button']")
		private WebElement add_to_cart_button;
		
		@FindBy(xpath="//span[normalize-space()='Cart']")
		private WebElement add_to_cart_icon;
		
		public void getProductTitle(WebDriver driver) {
			
			boolean chk = product_title.isDisplayed();
			System.out.println(chk);
			title = product_title.getText();
			System.out.println(title);
			}
		
		
		public void getProductPrice() {
			price = product_price.getText();
			System.out.println(price);
			}
		
		public void clickOnAddToCart() {
			add_to_cart_button.click();
			}
		
		public void clickOnCartIcon() {
			add_to_cart_icon.click();
			}
		
	}



