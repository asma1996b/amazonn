package com.Amazon.TestLayer;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.Amazon.PageLayer.BuyNow;
import com.Amazon.PageLayer.Cart;
import com.Amazon.PageLayer.HomePage;
import com.Amazon.PageLayer.ProductDisplayPage;
import com.Amazon.PageLayer.ResultPage;
import com.Amazon.TestBase.TestBase;
import com.Amazon.Utility.Utility;

public class BuyNowTest extends TestBase {
	@Test
	public void SelectAdd() throws InterruptedException
	{
		
	
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
	pdp_obj.clickOnAddToCart();
	Thread.sleep(3000);
	pdp_obj.clickOnCartIcon();
	cart_obj.getProducts(driver);
	
         BuyNow buy_obj=new BuyNow(driver);
         buy_obj.proceedToRetailscheckout();
         Thread.sleep(2000);
         buy_obj.clickNnselectdeliveryadd();
         Thread.sleep(2000);
         buy_obj.clickAddnewAdd();
         buy_obj.enterCountryname();
         buy_obj.entername();
         buy_obj.enterMobileno();
         buy_obj.enterpostal();
         buy_obj.enterAddLine1();
         buy_obj.enterAddLine2();
         buy_obj.enterLandmark();
         buy_obj.enterCity();
         buy_obj.selectState();
         buy_obj.clickOnUseThis();
}
}

