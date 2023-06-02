package com.Amazon.TestLayer;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.Amazon.PageLayer.Cart;
import com.Amazon.PageLayer.CheckOUtUPI;
import com.Amazon.PageLayer.HomePage;
import com.Amazon.PageLayer.ProductDisplayPage;
import com.Amazon.PageLayer.ResultPage;
import com.Amazon.TestBase.TestBase;
import com.Amazon.Utility.Utility;

public class CheckUPITest extends TestBase{
	@Test
	public void checkOutUPI() throws InterruptedException {
		
	
	HomePage home_obj = new HomePage(driver);
	ResultPage result_obj	= new ResultPage(driver);
	Utility util_obj = new Utility();
	Cart cart_obj = new Cart(driver);
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
	CheckOUtUPI Upi_obj=new CheckOUtUPI(driver);
	 Upi_obj.clickonBuy();
	 Upi_obj.clickoncheck();
	 Upi_obj.enterupi();
	 Upi_obj.clickonVerify();
	 Thread.sleep(3000);
	 Upi_obj.clickonUsethis();
	 Thread.sleep(3000);
	 Upi_obj.clickOOnPlaceOrder();
}
}
