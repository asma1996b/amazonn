package com.Amazon.PageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultPage {
		public ResultPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="//section[@aria-label='4 Stars & Up']")
		private WebElement four_star_or_up_filter;
		
		@FindBy(xpath="//span[text()='Featured']")
		private WebElement sort_dropdown;
		
		@FindBy(xpath="//a[text()='Price: Low to High']")
		private WebElement sort_dropdown_option;
		
		@FindBy(xpath="(//div[@class='a-section aok-relative s-image-square-aspect'][1])")
		private WebElement first_product_link;
		
		public void clickOnFourStarOrUpFilter() {
			four_star_or_up_filter.click();
			System.out.println("--> Filtering Successful");
			}
		public void clickOnSortDropdown() {
			sort_dropdown.click();
			}
		public void clickOnSortDropdownOption() {
			sort_dropdown_option.click();
			System.out.println("--> Sorting Successful");
			}
		public void clickOnFirstProduct() {
			first_product_link.click();
			System.out.println("--> Product Selection Successful");
			}
	}



