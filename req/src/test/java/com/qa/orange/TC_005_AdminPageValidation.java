package com.qa.orange;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_005_AdminPageValidation {

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
			driver.findElement(By.id("menu_admin_viewAdminModule")).click();
			driver.findElement(By.id("menu_admin_UserManagement")).click();
			Thread.sleep(2000);

			
			TakesScreenshot Ts = (TakesScreenshot)driver;		
			File screenshotAs2 = Ts.getScreenshotAs(OutputType.FILE);		
			String DatePattern = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());		
			String Destination1 = System.getProperty("user.dir")+"/Screenshots/"+"DriverScreenshot" +DatePattern + ".png";		
			FileUtils.copyFile(screenshotAs2, new File(Destination1));
			
			driver.findElement(By.id("menu_admin_Job")).click();
			Thread.sleep(2000);
			TakesScreenshot Ts1 = (TakesScreenshot)driver;		
			File screenshotAs3 = Ts1.getScreenshotAs(OutputType.FILE);		
			String DatePattern1 = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());		
			String Destination2 = System.getProperty("user.dir")+"/Screenshots/"+"DriverScreenshot" +DatePattern1 + ".png";		
			FileUtils.copyFile(screenshotAs3, new File(Destination2));
			driver.findElement(By.id("menu_admin_Organization")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("menu_admin_Qualifications")).click();
			Thread.sleep(2000);
			
			
			
			driver.close();

	}

}
