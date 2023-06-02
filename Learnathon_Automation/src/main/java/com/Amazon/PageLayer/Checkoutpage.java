package com.Amazon.PageLayer;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;



public class Checkoutpage {
	public Checkoutpage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='buy-now-button']")
	private WebElement Buynow_Btn;
	@FindBy(xpath="//body[@class='auth-no-skin ap-locale-en_IN a-m-us a-aui_72554-"
			+ "c a-aui_accordion_a11y_role_354025-t1 a-aui_killswitch_csa_logger_372963-"
			+ "c a-aui_pci_risk_banner_210084-c a-aui_preload_261698-c a-aui_rel_noreferrer_noopene"
			+ "r_309527-c a-aui_template_weblab_cache_333406-c a-aui_tnr_v2_180836-c a-meter-animate']")
	private WebElement page_hidden;
	@FindBy(xpath="//input[@id='ap_email']")
	private WebElement Email_text;
	@FindBy(xpath="//input[@id='continue']")
	private WebElement continue_btn;
	@FindBy(xpath="//input[@id='ap_password']")
	private WebElement passwrd_text;
	@FindBy(xpath="//input[@id='signInSubmit']")
	private WebElement submit_btn;
	@FindBy(xpath="//input[@name='otc-1']")
private WebElement otp_text;
@FindBy(xpath="(//(//input[@class='a-button-input'])[2]")
private WebElement sub_btn;
@FindBy(xpath="//body[@class='auth-no-skin ap-locale-en_IN a-m-us a-aui_72554-c a-aui_accordion_a11y_role_354025-t1 a-aui_killswitch_csa_logger_372963-c a-aui_pci_risk_banner_210084-c a-aui_preload_261698-c a-aui_rel_noreferrer_noopener_309527-c a-aui_template_weblab_cache_333406-c a-aui_tnr_v2_180836-c a-meter-animate']")
private WebElement hid;
@FindBy(xpath="//body/div[@id='a-page']/div[1]/div[1]")
private WebElement Pagehidd_text;
	@FindBy(xpath="//input[@name='ppw-instrumentRowSelection']")
	private WebElement paymentModecheck_box;
@FindBy(xpath="///a[@id='pp-eqL5x8-97']")
private WebElement carddetail_text;
@FindBy(xpath="//input[@name='addCreditCardNumber']")
private WebElement cardnum_textbox;

@FindBy(xpath="//input[@id='pp-9i6Qhf-17']")
private WebElement name_textbox;

@FindBy(xpath="(//span[@class='a-dropdown-prompt'])[2]")
private WebElement dropdown;
@FindBy(xpath="(//span[@class='a-dropdown-prompt'])[3]")


private WebElement YearDropdown;
@FindBy(xpath="//input[@name='ppw-widgetEvent:AddCreditCardEvent']")
private WebElement Entercarddetail_btn;
@FindBy(xpath="//input[@id='field']")
private WebElement Cvv_textbox;
@FindBy(xpath="/(//input[@class='a-button-input'])[6]")
private WebElement useThisPayMethod_chcekbox;
@FindBy(xpath="(//input[@class='a-button-input'])[7]")
private WebElement popup_checkbox;
@FindBy(xpath="(//input[@name='placeYourOrder1']")
private WebElement placeyourOrder_box;
public void clickOnBUyNow()
{
	Buynow_Btn.click();
}
public void clickonhiddpage()
{
	page_hidden.click();
}
public void enterEmaill()
{
	Email_text.sendKeys("9322005750");	
}
public void clickoncontinue()
{
	continue_btn.click();
}
public void enterpassword()
{
	passwrd_text.sendKeys("Asma@1996");
}
public void clickonSubmit()
{
	 submit_btn.click();
}
public void enterotp()
{
otp_text.sendKeys("234562");
}
public void clicksub()
{
	sub_btn.click();
}
public void clickpage()
{
hid.click();	
}
public void clickonpage1()
{
	Pagehidd_text.click();
}

public void selectpaymentmode()
{
	paymentModecheck_box.click();
}
public void clickOnLink()
{
carddetail_text.click();
}
public void enterCardNum()
{
	cardnum_textbox.sendKeys("6522940402787793");
}
public void enterName()
{
	name_textbox.sendKeys("Asma jahangir buwa");	
}
public void selectmonthDropdown()
{
	dropdown.click();
}
public void selectYearDropdown()
{
	YearDropdown.click();
}
public void clickOncardDetail()
{
Entercarddetail_btn.click();
}
public void enterCVVdetail()
{
	Cvv_textbox.sendKeys("393");
}
public void clickonUseThismethod()
{
	useThisPayMethod_chcekbox.click();
}
public void Popup()
{
	popup_checkbox.click();
}
public void clickonPlaceOrder()
{
	placeyourOrder_box.click();
}
}
