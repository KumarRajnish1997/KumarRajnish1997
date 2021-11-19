package com.qa.orange;
	
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.util.Date;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;

	public class TC_012_OrangeLogIn {

		public static void main(String[] args) throws InterruptedException, IOException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","C:\\Users\\rajnishk\\OneDrive - Broadridge Financial Solutions, Inc\\JAVA-SDET\\Drivers\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");
		
				
			WebElement SearchTextField = driver.findElement(By.id("txtUsername"));
			SearchTextField.sendKeys("Admin");
			WebElement SearchTextField1 = driver.findElement(By.id("txtPassword"));
			SearchTextField1.sendKeys("admin123");
			
			driver.findElement(By.id("btnLogin")).click();
			driver.findElement(By.id("menu_pim_viewPimModule")).click();
			
			WebElement SearchTextField3 = driver.findElement(By.id("empsearch_employee_name_empName"));
			SearchTextField3.sendKeys("Linda Anderson");
			
			TakesScreenshot Ts = (TakesScreenshot)driver;		
			File screenshotAs2 = Ts.getScreenshotAs(OutputType.FILE);		
			String DatePattern = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());		
			String Destination1 = System.getProperty("user.dir")+"/Screenshots/"+"DriverScreenshot" +DatePattern + ".png";		
			FileUtils.copyFile(screenshotAs2, new File(Destination1));
			
			driver.close();
			

		}

	}
	



