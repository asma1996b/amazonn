package com.Amazon.PageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Amazon.TestBase.TestBase;

public class LoginPage  extends TestBase {
		public LoginPage(WebDriver driver)
		{
		PageFactory.initElements(driver, this);
		}
		//=========================================================================
		@FindBy(xpath="//span[@id='lktrk6-ldpsvo-dh77tu-iawbrc']")
		private WebElement Signin_textbox;
		@FindBy(xpath="(//span[@class='nav-action-inner'])[2]")
		private WebElement Signin_button;
		@FindBy(xpath="//input[@id='ap_email']")
		private WebElement email_textbox;
		@FindBy(xpath="//input[@id='continue']")
		private WebElement continue_btn;
		@FindBy(xpath="//input[@id='ap_password']")
		private WebElement passwrdd_text;
		@FindBy(xpath="//input[@id='signInSubmit']")
		private WebElement submitt_btn;
		
		
		
		//==================================================================
		
		
		public void mouseoveronSignUp()
		{
		Signin_button.click();
		}
		public void enterEmail()
		{
		email_textbox.sendKeys("9322005750");
		}
		public void clickOnContinueBtn()
		{
		continue_btn.click();
		}
		public void enterpassh()
		{
			passwrdd_text.sendKeys("Asma@1996");
		}
		public void clickOsubb()
		{
			submitt_btn.click();
		}
		}


