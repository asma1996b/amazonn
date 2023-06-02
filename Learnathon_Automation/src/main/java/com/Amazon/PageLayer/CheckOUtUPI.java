package com.Amazon.PageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOUtUPI {
	public CheckOUtUPI(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='buy-now-button']")
	private WebElement Buynow_Btn;
	
	@FindBy(xpath="//input[@id='pp-MX05jC-132']")
	private WebElement check_box;
	@FindBy(xpath="//input[@id='pp-MX05jC-140']")
	private WebElement Upi_textbox;
	@FindBy(xpath="//input[@name='ppw-widgetEvent:ValidateUpiIdEvent']")
	private WebElement verify_btn;
	
	@FindBy(xpath="	(//input[@class='a-button-input a-button-text'])[3]")
	private WebElement UsethisMethod_btn;
	
	@FindBy(xpath="//input[@name='placeYourOrder1']")
	private WebElement placeYourorder_btn;
	public void clickonBuy()
	{
		Buynow_Btn.click();
	}
	public void clickoncheck()
	{
		 check_box.click();
	}
	public void enterupi()
	{
		Upi_textbox.sendKeys("9322005750@axl");
	}
	public void clickonVerify()
	{
		 verify_btn.click();
	}
	public void clickonUsethis()
	{
		UsethisMethod_btn.click();
		 }
	public void clickOOnPlaceOrder()
	{
		 placeYourorder_btn.click();
	}
}
