package com.qa.orange;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC_007_TestAnnotationCase {
	
	WebDriver driver;
	
	@BeforeTest()
	public void StartTest1() {
		try {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\rajnishk\\OneDrive - Broadridge Financial Solutions, Inc\\JAVA-SDET\\Drivers\\chromedriver.exe");
			 driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			Thread.sleep(1000);
			driver.manage().window().maximize();
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}

	}
	
	@Test(priority=1)
	public void StartTest2() {
		
		WebElement SearchTextField = driver.findElement(By.id("txtUsername"));
		SearchTextField.sendKeys("Admin");
		WebElement SearchTextField1 = driver.findElement(By.id("txtPassword"));
		SearchTextField1.sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();

	}
	
	@AfterTest()
	public void Logout()
	
	{
		driver.close();
	}
	
}
