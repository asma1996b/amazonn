package com.Amazon.TestLayer;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Amazon.PageLayer.LoginPage;
import com.Amazon.TestBase.TestBase;
import com.Amazon.Utility.Utility;


public class LoginTestLayer extends TestBase{
		@Test
		public void validateLoginPage()
		{
		String expected_result="Amazon Sign In";
		LoginPage login_obj=new LoginPage(driver);
		Utility util_obj=new Utility();
		WebDriverWait wait=new WebDriverWait(driver,5);
		wait.withTimeout(2, TimeUnit.SECONDS);
		login_obj.mouseoveronSignUp();
		login_obj.enterEmail();
		login_obj.clickOnContinueBtn();
		String actual_result=(util_obj.currentPageTitle());
		//System.out.println(actual_result);
		Assert.assertEquals(util_obj.currentPageTitle(), expected_result);
		System.out.println(actual_result);
		}
		}


