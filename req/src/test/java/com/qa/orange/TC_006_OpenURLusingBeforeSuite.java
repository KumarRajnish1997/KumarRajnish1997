package com.qa.orange;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
public class TC_006_OpenURLusingBeforeSuite {
	
	@Test
	public void beforeSuiteTest()
	{
	System.out.println("Test Execution");
	}
	@BeforeSuite
	public void before_suite() 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rajnishk\\OneDrive - Broadridge Financial Solutions, Inc\\JAVA-SDET\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	
	   driver.manage().window().maximize();
	    driver.close();
	
	

	

	}

}
