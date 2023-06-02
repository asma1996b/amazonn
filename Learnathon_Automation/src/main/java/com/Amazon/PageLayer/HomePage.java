package com.Amazon.PageLayer;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Amazon.TestBase.TestBase;

public class HomePage extends TestBase{
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	private WebElement searchbox;
	
	

	public void enterTextInSearchBox(String product) {
		searchbox.sendKeys(product+Keys.ENTER);
		System.out.println("--> Product Search Successful");
		
	}
	
}



