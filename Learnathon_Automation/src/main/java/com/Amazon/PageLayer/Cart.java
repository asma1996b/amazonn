package com.Amazon.PageLayer;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart {
		public Cart(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="a-truncate sc-grid-item-product-title a-size-base-plus")
		private WebElement searchbox;
		
		

		public void enterTextInSearchBox(String product) {
			searchbox.sendKeys(product+Keys.ENTER);
			System.out.println("--> Product Search Successful");
			
		}

		public void getProducts(WebDriver driver) {
			
			List <WebElement> products = driver.findElements(By.xpath("//span[@class='a-truncate-cut']"));
			for(WebElement product : products) {
				String title = product.getText();
				String trimmed =title.substring(0,title.length()-2);
				boolean contains = ProductDisplayPage.title.contains(trimmed);
				/*
				if(title.equals(ProductDisplayPage.title)) {
				System.out.println(title);
				*/
				if(contains) {
					System.out.println(title);
					System.out.println(trimmed);
					System.out.println("PRODUCT MATCH SUCCESSFUL");
				}
			}
		
		}
	


}
