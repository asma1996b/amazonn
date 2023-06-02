package com.Amazon.Utility;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Amazon.TestBase.TestBase;

public class Utility extends TestBase{
		
		public static String parentWindow;
		public String currentPageTitle()
		{
		String title = driver.getTitle();
		return title;
		}

		
		public static void takeSS(String filename) {
			
			try {
				String path = "D:\\Class Software Testing\\Class Programs\\Amazon\\Screenshots\\";
				TakesScreenshot ts = (TakesScreenshot)driver;
				File src = ts.getScreenshotAs(OutputType.FILE);
				File des = new File(path+filename+System.currentTimeMillis()+".png");
				FileHandler.copy(src,des);
			} catch (IOException e) {
				System.out.println("File Path is not correct.");
				e.printStackTrace();
			}
		
		
		}
		public void selectMonth()
		{ WebElement day= driver.findElement(By.xpath("//span[@class='a-dropdown-prompt'])[2]"));
			Select s=new Select(day);
			s.deselectByIndex(07);
		}
		public void selectYear()
		{ WebElement year= driver.findElement(By.xpath("//span[@class='a-dropdown-prompt'])[2]"));
			Select s1=new Select(year);
			s1.deselectByVisibleText("2027");
			
		}
		public void alert() throws InterruptedException
		{
			driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small a-text-right']"));
			Thread.sleep(2000);
		}
		public void alert2() throws InterruptedException
		{
			driver.findElement(By.xpath("//div[@id='a-popover-content-4']"));
			Thread.sleep(2000);
		}
		
		public static void explicitWait() {
			
			WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement title = wait.until(ExpectedConditions.elementToBeClickable(By.id("productTitle")));
			System.out.println(title.getText());
		}
		
		public static void getCurrentWindow() {
			parentWindow = driver.getWindowHandle();
		}
		public static void switchWindow() {
			
			Set <String> windows = driver.getWindowHandles();
			
			for(String handle:windows) {
				if(!handle.equals(parentWindow)) {
					driver.switchTo().window(handle);
				}
			}
		}
	}



