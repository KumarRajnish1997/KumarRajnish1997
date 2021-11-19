package com.qa.orange;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_010_ReadDashboardHeading {

		public static void main(String[] args) throws InterruptedException, IOException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","C:\\Users\\rajnishk\\OneDrive - Broadridge Financial Solutions, Inc\\JAVA-SDET\\Drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");
		
				
			WebElement SearchTextField = driver.findElement(By.id("txtUsername"));
			SearchTextField.sendKeys("Admin");
			WebElement SearchTextField1 = driver.findElement(By.id("txtPassword"));
			SearchTextField1.sendKeys("admin123");
			driver.findElement(By.id("btnLogin")).click();
			
			driver.findElement(By.linkText("Dashboard")).click();
			String DashHead = driver.findElement(By.xpath("//div[@class='head']//child::h1")).getText();
			System.out.println(DashHead);
			
			driver.close();

	}

}
