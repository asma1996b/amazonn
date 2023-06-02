package com.Amazon.TestLayer;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.Amazon.PageLayer.Cart;
import com.Amazon.PageLayer.Checkoutpage;
import com.Amazon.PageLayer.HomePage;
import com.Amazon.PageLayer.LoginPage;
import com.Amazon.PageLayer.ProductDisplayPage;
import com.Amazon.PageLayer.ResultPage;
import com.Amazon.TestBase.TestBase;
import com.Amazon.Utility.Utility;

public class CheckOutTest extends TestBase {
	@Test
	public void Checkout() throws InterruptedException {
	LoginPage obj_login=new LoginPage(driver)	;
	
	HomePage home_obj = new HomePage(driver);
	ResultPage result_obj	= new ResultPage(driver);
	Utility util_obj = new Utility();
	Cart cart_obj = new Cart(driver);
	//Threada-button-input.sleep(2000);
	obj_login.mouseoveronSignUp();
	obj_login.enterEmail();
	obj_login.clickOnContinueBtn();
	obj_login.enterpassh();
	obj_login.clickOsubb();
	ProductDisplayPage pdp_obj = new ProductDisplayPage(driver);
	home_obj.enterTextInSearchBox("Nataraj Gelix Gel Pens"+Keys.SPACE);
	Thread.sleep(3000);
	result_obj.clickOnFourStarOrUpFilter();
	result_obj.clickOnSortDropdown();
	result_obj.clickOnSortDropdownOption();
	Utility.getCurrentWindow();
	result_obj.clickOnFirstProduct();
	Thread.sleep(3000);
	Utility.switchWindow();
	//Utility.explicitWait();
	pdp_obj.getProductTitle(driver);
	
	Thread.sleep(3000);
	pdp_obj.getProductPrice();
	//pdp_obj.clickOnAddToCart();
	//Thread.sleep(3000);
	//pdp_obj.clickOnCartIcon();
	//cart_obj.getProducts(driver);
	Checkoutpage check_obj=new Checkoutpage(driver);
	check_obj.clickOnBUyNow();
	
	Thread.sleep(2000);
	check_obj.clickonhiddpage();
check_obj.enterEmaill();
check_obj.clickoncontinue();
	check_obj.enterpassword();
check_obj.clickonSubmit();
Thread.sleep(2000);
	check_obj.enterotp();
	//WebDriverWait wait = new WebDriverWait(driver, 10);
	//wait.until(ExpectedConditions.stalenessOf(element));
	Thread.sleep(10000);
	check_obj.clicksub();
	Thread.sleep(5000);
	driver.switchTo().frame(0);
check_obj.clickpage();
	check_obj.clickonpage1();
	check_obj.selectpaymentmode();
	check_obj.clickOnLink();
	util_obj.alert();
	Alert alt= driver.switchTo().alert();
	Thread.sleep(2000);
	check_obj.enterName();
	check_obj.enterCardNum();
	
	check_obj.selectmonthDropdown();
	util_obj.selectMonth();
	check_obj.selectYearDropdown();
	util_obj.selectYear();
	check_obj.clickOncardDetail();
	check_obj.enterCVVdetail();
	check_obj.clickonUseThismethod();
	util_obj.alert2();
	Alert alt1= driver.switchTo().alert();
	check_obj.Popup();
	check_obj.clickonPlaceOrder();
	}
}
