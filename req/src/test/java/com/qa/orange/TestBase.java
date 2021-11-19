package com.qa.orange;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.qa.pages.OrangeHRMPages;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestBase {
	
	WebDriver driver;
	Actions act;
	OrangeHRMPages OrangeHrm;
	FileInputStream fileLoc;
	Properties prop;
	@BeforeClass
     public void setUp(String Browser,String Url) throws IOException {
	
		
		fileLoc = new FileInputStream("C:\\Users\\rajnishk\\eclipse-workspace\\req\\src\\test\\java\\com\\qa\\testdata\\Credentials.properties");
		prop = new Properties();
		prop.load(fileLoc);
		
		
		if(Browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\rajnishk\\OneDrive - Broadridge Financial Solutions, Inc\\JAVA-SDET\\Drivers\\chromedriver.exe");
			WebDriverManager.chromedriver().setup(); 
			driver = new ChromeDriver();	
		}
		
		OrangeHrm = new OrangeHRMPages(driver);
		act = new Actions(driver);
		driver.manage().window().maximize();
		driver.get(prop.getProperty("Url"));
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	
	}
		
		@AfterClass
		public void tearDown() throws IOException {
			// after completion of every class
			// close browser
			fileLoc.close();
			driver.close();
			
		}
		
		public void captureScreenshot(WebDriver driver, String tName) throws IOException {		
			TakesScreenshot ts = (TakesScreenshot)driver;		
			File Source = ts.getScreenshotAs(OutputType.FILE);
			File Target = new File(System.getProperty("user.dir")+"/Screenshots/"+tName+".png");
			FileUtils.copyFile(Source, Target);		
			System.out.println("Screenshot capture successfully");
			
		}


}
