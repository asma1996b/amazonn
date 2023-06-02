package com.Amazon.PageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyNow {
	public BuyNow(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='proceedToRetailCheckout']")
	private WebElement proceedtoBuy_Btn;
	@FindBy(xpath="//h3[@class='a-color-state']")
	private WebElement Text_msg;
	@FindBy(xpath="//a[@id='add-new-address-popover-link']")
	private WebElement AddnewAdd_link;
	
	@FindBy(xpath="(//span[@class='a-button-text a-declarative'])[1]")
	private WebElement country_box;
	@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressFullName']")
	private WebElement fullname_text;
	@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressPhoneNumber']")
	private WebElement mobileno_text;
	@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressPostalCode']")
	private WebElement	postal_text;
	@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressLine1']")
	private WebElement add_text;
	@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressLine2']")
	private WebElement addline_text;
	@FindBy(xpath="//input[@id='address-ui-widgets-landmark']")
	private WebElement landmark_text;
	@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressCity']")
	private WebElement city_text;
	//@FindBy(xpath="	(//span[@class='a-button-text a-declarative'])[2]")
	//private WebElement btn;
	@FindBy(xpath="	//span[contains(text(),'Choose a state')]")
	private WebElement Selectstate_btn;
	@FindBy(xpath="//span[@id='address-ui-widgets-form-submit-button']")
	private WebElement useThis_btn;
	
	//============================================
	public void proceedToRetailscheckout()
	{
		proceedtoBuy_Btn.click();
	}
	public void clickNnselectdeliveryadd() {
		 Text_msg.click();
	}
	public void clickAddnewAdd() {
		AddnewAdd_link.click();
	}
	public void enterCountryname()
	{
		country_box.sendKeys("india");	
	}
	public void entername()
	{
		fullname_text.sendKeys("Asma");
	}
	public void enterMobileno()
	{
		mobileno_text.sendKeys("8208436610");
	}
	public void enterpostal()
	{
		postal_text.sendKeys("416401");
	}
	public void enterAddLine1()
	{
		add_text.sendKeys("near mandir");
	}
	public void enterAddLine2()
	{
		addline_text.sendKeys("Laxmiwadi road");
	}
	public void enterLandmark()
	
	{
		landmark_text.sendKeys("yallama mandir");
	}
	public void enterCity() {
		city_text.sendKeys("Arag");
	}
	
	public void selectState()
	{
		Selectstate_btn.sendKeys("maharashtra");
	}
	public void clickOnUseThis()
	{
		useThis_btn.click();
	}
	
}
