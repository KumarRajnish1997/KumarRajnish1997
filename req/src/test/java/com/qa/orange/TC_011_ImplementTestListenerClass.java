package com.qa.orange;

import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;

import org.testng.annotations.Test;
import com.qa.pages.*;



public class TC_011_ImplementTestListenerClass extends TestBase  {
	
	OrangeHRMPages OrangeHRM;
	
	@Test(priority=1)
	public void LogInApp() throws InterruptedException {
		String  Uname = prop.getProperty("Uname");
		String  Pwd= prop.getProperty("Pwd");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(Uname);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(Pwd);
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(1000);
	}
    @Test(priority=2,retryAnalyzer=com.qa.utility.RetryAnalyzer.class)
    public void method1() throws Exception
	{
        String DashBoardHeader = OrangeHrm.GetDashBoardHeaderText();
		boolean result = DashBoardHeader.equalsIgnoreCase("Dashboard");
		boolean res;
		if(res=true)
		{
			Thread.sleep(1000);
			captureScreenshot(driver,"DashBoard Passed");
			Assert.assertTrue(true); 
			Reporter.log("User is in Dashboard Menu", true);;
		}
		else
		{
			int i = 1; 
			captureScreenshot(driver,"DashBoard Failed Interation = "+ i);
			Assert.assertTrue(false); 
			Reporter.log("User is NOT in Dashboard Menu", true);
			i++;
		} 
	}
    @AfterSuite
	public void tearDown() {
		driver.quit();
	}

}
